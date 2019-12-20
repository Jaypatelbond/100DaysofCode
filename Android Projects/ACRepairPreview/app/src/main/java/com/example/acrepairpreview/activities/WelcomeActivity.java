package com.example.acrepairpreview.activities;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;

import com.example.acrepairpreview.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends BaseActivity {

    @BindView(R.id.view4)
    View view4;
    @BindView(R.id.textViewSignInLabel)
    TextView textViewSignInLabel;
    @BindView(R.id.editTextEmail)
    EditText editTextEmail;
    @BindView(R.id.editTextPassword)
    EditText editTextPassword;
    @BindView(R.id.guideline)
    Guideline guideline;
    @BindView(R.id.guideline2)
    Guideline guideline2;
    @BindView(R.id.guideline3)
    Guideline guideline3;
    @BindView(R.id.guideline4)
    Guideline guideline4;
    @BindView(R.id.textViewForgotPassword)
    TextView textViewForgotPassword;
    @BindView(R.id.buttonSignIn)
    Button button;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.textViewOrConnectWith)
    TextView textViewOrConnectWith;
    @BindView(R.id.guideline5)
    Guideline guideline5;
    @BindView(R.id.guideline6)
    Guideline guideline6;
    @BindView(R.id.cardViewTwitter)
    CardView cardViewTwitter;
    @BindView(R.id.cardViewFacebook)
    CardView cardViewFacebook;
    @BindView(R.id.cardViewGoogle)
    CardView cardViewGoogle;
    @BindView(R.id.clWelcome)
    ConstraintLayout clWelcome;
    @BindView(R.id.group)
    Group group;
    @BindView(R.id.group2)
    Group group2;
    @BindView(R.id.guideline7)
    Guideline guideline7;
    @BindView(R.id.textViewSignUp)
    TextView textViewSignUp;
    @BindView(R.id.textViewDontHaveAnAccount)
    TextView textViewDontHaveAnAccount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        setDefaultLanguage("en");
        disableAutofill();
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }


    @TargetApi(Build.VERSION_CODES.O)
    private void disableAutofill() {
        getWindow().getDecorView().setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS);
    }


    public static boolean isRTL(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return context.getResources().getConfiguration().getLayoutDirection()
                    == View.LAYOUT_DIRECTION_RTL;
            // Another way:
            // Define a boolean resource as "true" in res/values-ldrtl
            // and "false" in res/values
            // return context.getResources().getBoolean(R.bool.is_right_to_left);
        } else {
            return false;
        }
    }

    @OnClick({R.id.textViewForgotPassword, R.id.buttonSignIn, R.id.textViewSignUp})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textViewForgotPassword:
                startActivity(new Intent(this, OTPActivity.class));
                break;
            case R.id.buttonSignIn:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.textViewSignUp:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
        }
    }
}
