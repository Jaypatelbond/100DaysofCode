package com.example.acrepairpreview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.acrepairpreview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Jaypatelbond
 */

public class SettingsActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.imageViewBack)
    ImageView imageViewBack;
    @BindView(R.id.textViewEditProfile)
    TextView textViewEditProfile;
    @BindView(R.id.flEditProfile)
    FrameLayout flEditProfile;
    @BindView(R.id.textViewAboutUs)
    TextView textViewAboutUs;
    @BindView(R.id.flAboutUs)
    FrameLayout flAboutUs;
    @BindView(R.id.textViewTermsandCondition)
    TextView textViewTermsandCondition;
    @BindView(R.id.flTermsandCondition)
    FrameLayout flTermsandCondition;
    @BindView(R.id.textViewPrivacyPolicy)
    TextView textViewPrivacyPolicy;
    @BindView(R.id.flPrivacyPolicy)
    FrameLayout flPrivacyPolicy;
    @BindView(R.id.textViewCancellationPoilcy)
    TextView textViewCancellationPoilcy;
    @BindView(R.id.flCancellationPolicy)
    FrameLayout flCancellationPolicy;
    @BindView(R.id.textViewFAQ)
    TextView textViewFAQ;
    @BindView(R.id.flFAQ)
    FrameLayout flFAQ;
    @BindView(R.id.textViewContactUs)
    TextView textViewContactUs;
    @BindView(R.id.flContactUs)
    FrameLayout flContactUs;
    @BindView(R.id.textViewFeedBack)
    TextView textViewFeedBack;
    @BindView(R.id.flFeedBack)
    FrameLayout flFeedBack;
    @BindView(R.id.textViewRateUs)
    TextView textViewRateUs;
    @BindView(R.id.flRateUs)
    FrameLayout flRateUs;
    @BindView(R.id.textViewChangeLanguage)
    TextView textViewChangeLanguage;
    @BindView(R.id.flAppSharing)
    FrameLayout flAppSharing;
    @BindView(R.id.textViewLogout)
    TextView textViewLogout;
    @BindView(R.id.flLogout)
    FrameLayout flLogout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);

        textViewChangeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, ChangeLanguageActivity.class));
            }
        });
    }
}
