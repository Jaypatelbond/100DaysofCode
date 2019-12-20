package com.example.acrepairpreview.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.acrepairpreview.R;
import com.jakewharton.processphoenix.ProcessPhoenix;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Jaypatelbond
 */

public class ChangeLanguageActivity extends BaseActivity {
    @BindView(R.id.view3)
    View view3;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.imageViewBackButton)
    ImageView imageViewBackButton;
    @BindView(R.id.textViewTitle)
    TextView textViewTitle;
    @BindView(R.id.textViewEnglish)
    TextView textViewEnglish;
    @BindView(R.id.textViewArabic)
    TextView textViewArabic;
    @BindView(R.id.textViewArabicEnglish)
    TextView textViewArabicEnglish;
    @BindView(R.id.view4)
    View view4;
    @BindView(R.id.imageViewCheckboxEnglish)
    ImageView imageViewCheckboxEnglish;
    @BindView(R.id.imageViewCheckboxArabic)
    ImageView imageViewCheckboxArabic;
    @BindView(R.id.buttonChangeLanguage)
    Button buttonChangeLanguage;
    @BindView(R.id.clChangeLanguage)
    ConstraintLayout clChangeLanguage;
    private int mCheckedId = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);
        ButterKnife.bind(this);
        if (Locale.getDefault().getLanguage().equals("ar")) {
            imageViewCheckboxEnglish.setVisibility(View.GONE);
            imageViewCheckboxArabic.setVisibility(View.VISIBLE);
            imageViewCheckboxArabic.setActivated(true);
        }
        if (Locale.getDefault().getLanguage().equals("en")) {
            imageViewCheckboxEnglish.setVisibility(View.VISIBLE);
            imageViewCheckboxArabic.setVisibility(View.GONE);
            imageViewCheckboxEnglish.setActivated(true);
        }

    }

    @Override
    public void onBeforeLocaleChanged() {
        super.onBeforeLocaleChanged();
        ProcessPhoenix.triggerRebirth(this);
    }

    @OnClick({R.id.imageViewBackButton, R.id.textViewEnglish, R.id.textViewArabic, R.id.buttonChangeLanguage, R.id.textViewArabicEnglish})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageViewBackButton:
                finish();
                break;
            case R.id.textViewEnglish:
                imageViewCheckboxEnglish.setActivated(true);
                imageViewCheckboxArabic.setActivated(false);
                imageViewCheckboxEnglish.setVisibility(View.VISIBLE);
                imageViewCheckboxArabic.setVisibility(View.GONE);
                break;
            case R.id.textViewArabic:
                imageViewCheckboxArabic.setActivated(true);
                imageViewCheckboxEnglish.setActivated(false);
                imageViewCheckboxArabic.setVisibility(View.VISIBLE);
                imageViewCheckboxEnglish.setVisibility(View.GONE);
                break;
            case R.id.textViewArabicEnglish:
                imageViewCheckboxArabic.setActivated(true);
                imageViewCheckboxEnglish.setActivated(false);
                imageViewCheckboxArabic.setVisibility(View.VISIBLE);
                imageViewCheckboxEnglish.setVisibility(View.GONE);
                break;
            case R.id.buttonChangeLanguage:
                if (imageViewCheckboxArabic.isActivated()) {
                    setLanguage("ar");
                }
                if (imageViewCheckboxEnglish.isActivated()) {
                    setLanguage("en");
                }
                if (Locale.getDefault().getLanguage().equals("en")) {
                    Toast.makeText(this, "English Already Selected", Toast.LENGTH_SHORT).show();
                }
                if (Locale.getDefault().getLanguage().equals("ar")) {
                    Toast.makeText(this, "Arabic Already Selected", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
