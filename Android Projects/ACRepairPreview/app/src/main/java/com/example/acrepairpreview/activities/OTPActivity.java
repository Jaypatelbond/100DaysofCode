package com.example.acrepairpreview.activities;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Guideline;
import com.example.acrepairpreview.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Jaypatelbond
 */

public class OTPActivity extends BaseActivity implements TextWatcher {
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.buttonSubmit)
    Button buttonSubmit;
    @BindView(R.id.imageBackButton)
    ImageView imageView2;
    @BindView(R.id.textViewEditProfile)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.edittextField1)
    EditText edittextField1;
    @BindView(R.id.edittextField2)
    EditText edittextField2;
    @BindView(R.id.edittextField3)
    EditText edittextField3;
    @BindView(R.id.edittextField4)
    EditText edittextField4;
    @BindView(R.id.guideline1)
    Guideline guideline1;
    @BindView(R.id.guideline)
    Guideline guideline;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textViewResendCode)
    TextView textViewResendCode;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        ButterKnife.bind(this);
        edittextField1.addTextChangedListener(this);
        edittextField2.addTextChangedListener(this);
        edittextField3.addTextChangedListener(this);
        edittextField4.addTextChangedListener(this);
        edittextField1.requestFocus();

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() == 1) {
            if (edittextField1.length() == 1) {
                edittextField2.requestFocus();
            }
            if (edittextField2.length() == 1) {
                edittextField3.requestFocus();
            }
            if (edittextField3.length() == 1) {
                edittextField4.requestFocus();
            }
        } else if (s.length() == 0) {
            if (edittextField4.length() == 0) {
                edittextField3.requestFocus();
            }
            if (edittextField3.length() == 0) {
                edittextField2.requestFocus();
            }
            if (edittextField2.length() == 0) {
                edittextField1.requestFocus();
            }
        }
    }

    @OnClick(R.id.imageBackButton)
    public void onViewClicked() {
        finish();
    }
}
