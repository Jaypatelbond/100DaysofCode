package com.example.acrepairpreview.di;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module created to provide some common activity scope depdendencies as @ActivityContext.
 * This module is going to be added to the graph generated for every activity while the activity
 * creation lifecycle.
 *
 * @author Jaypatelbond
 */

@Module
public final class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity){
        this.activity = activity;
    }

    @ActivityContext @Provides
    Context provideActivityContext() {
        return activity;
    }
}
