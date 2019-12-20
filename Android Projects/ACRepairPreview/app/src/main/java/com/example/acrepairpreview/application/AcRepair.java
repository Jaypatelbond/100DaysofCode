package com.example.acrepairpreview.application;
/*
 * Created by Jaypatelbond on 05-11-2019.
 */

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.akexorcist.localizationactivity.core.LocalizationApplicationDelegate;

public class AcRepair extends Application {

    public static Context context;
    private static AcRepair mInstance;

    public static Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        AcRepair.context = context;
    }

    public static synchronized AcRepair getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    LocalizationApplicationDelegate localizationDelegate = new LocalizationApplicationDelegate(this);

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(localizationDelegate.attachBaseContext(base));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        localizationDelegate.onConfigurationChanged(this);
    }

    @Override
    public Context getApplicationContext() {
        return localizationDelegate.getApplicationContext(super.getApplicationContext());
    }
}
