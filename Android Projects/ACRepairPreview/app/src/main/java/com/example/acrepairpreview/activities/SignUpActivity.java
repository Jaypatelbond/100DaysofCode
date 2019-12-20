package com.example.acrepairpreview.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

import com.example.acrepairpreview.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Jaypatelbond
 */

public class SignUpActivity extends BaseActivity {

    @BindView(R.id.textViewSignInLabel)
    TextView textViewSignInLabel;
    @BindView(R.id.editTextFirstName)
    EditText editTextFirstName;
    @BindView(R.id.editTextLastName)
    EditText editTextLastName;
    @BindView(R.id.editTextPhoneNumber)
    EditText editTextPhoneNumber;
    @BindView(R.id.editTextEmail)
    EditText editTextEmail;
    @BindView(R.id.editTextPassword)
    EditText editTextPassword;
    @BindView(R.id.editTextConfirmPassword)
    EditText editTextConfirmPassword;
    @BindView(R.id.guideline)
    Guideline guideline;
    @BindView(R.id.guideline2)
    Guideline guideline2;
    @BindView(R.id.guideline3)
    Guideline guideline3;
    @BindView(R.id.guideline4)
    Guideline guideline4;
    @BindView(R.id.buttonSignUp)
    Button buttonSignUp;
    @BindView(R.id.guideline7)
    Guideline guideline7;
    @BindView(R.id.textViewLogin)
    TextView textViewLogin;
    @BindView(R.id.textViewAlreadyHaveAnAccount)
    TextView textViewAlreadyHaveAnAccount;
    @BindView(R.id.imageViewBackButton)
    ImageView imageView;
    @BindView(R.id.clSignUp)
    ConstraintLayout clSignUp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        disableAutofill();
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    @TargetApi(Build.VERSION_CODES.O)
    private void disableAutofill() {
       getWindow().getDecorView().setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS);
    }

    @OnClick({R.id.textViewLogin, R.id.imageViewBackButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textViewLogin:
                startActivity(new Intent(SignUpActivity.this, WelcomeActivity.class));
                break;
            case R.id.imageViewBackButton:
                finish();
                break;
        }
    }
}
