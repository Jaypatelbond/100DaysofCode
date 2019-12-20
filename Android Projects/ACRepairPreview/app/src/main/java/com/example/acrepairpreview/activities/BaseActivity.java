package com.example.acrepairpreview.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.akexorcist.localizationactivity.ui.LocalizationActivity;
import com.example.acrepairpreview.application.AcRepair;

/**
 * @author Jaypatelbond
 */

public class BaseActivity extends LocalizationActivity {
    private static final String TAG = "BaseActivity";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AcRepair) getApplication()).setContext(this);

    }
}
