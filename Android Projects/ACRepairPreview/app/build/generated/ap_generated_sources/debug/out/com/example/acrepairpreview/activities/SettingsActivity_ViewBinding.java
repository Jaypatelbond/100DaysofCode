// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsActivity_ViewBinding implements Unbinder {
  private SettingsActivity target;

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.imageViewBack = Utils.findRequiredViewAsType(source, R.id.imageViewBack, "field 'imageViewBack'", ImageView.class);
    target.textViewEditProfile = Utils.findRequiredViewAsType(source, R.id.textViewEditProfile, "field 'textViewEditProfile'", TextView.class);
    target.flEditProfile = Utils.findRequiredViewAsType(source, R.id.flEditProfile, "field 'flEditProfile'", FrameLayout.class);
    target.textViewAboutUs = Utils.findRequiredViewAsType(source, R.id.textViewAboutUs, "field 'textViewAboutUs'", TextView.class);
    target.flAboutUs = Utils.findRequiredViewAsType(source, R.id.flAboutUs, "field 'flAboutUs'", FrameLayout.class);
    target.textViewTermsandCondition = Utils.findRequiredViewAsType(source, R.id.textViewTermsandCondition, "field 'textViewTermsandCondition'", TextView.class);
    target.flTermsandCondition = Utils.findRequiredViewAsType(source, R.id.flTermsandCondition, "field 'flTermsandCondition'", FrameLayout.class);
    target.textViewPrivacyPolicy = Utils.findRequiredViewAsType(source, R.id.textViewPrivacyPolicy, "field 'textViewPrivacyPolicy'", TextView.class);
    target.flPrivacyPolicy = Utils.findRequiredViewAsType(source, R.id.flPrivacyPolicy, "field 'flPrivacyPolicy'", FrameLayout.class);
    target.textViewCancellationPoilcy = Utils.findRequiredViewAsType(source, R.id.textViewCancellationPoilcy, "field 'textViewCancellationPoilcy'", TextView.class);
    target.flCancellationPolicy = Utils.findRequiredViewAsType(source, R.id.flCancellationPolicy, "field 'flCancellationPolicy'", FrameLayout.class);
    target.textViewFAQ = Utils.findRequiredViewAsType(source, R.id.textViewFAQ, "field 'textViewFAQ'", TextView.class);
    target.flFAQ = Utils.findRequiredViewAsType(source, R.id.flFAQ, "field 'flFAQ'", FrameLayout.class);
    target.textViewContactUs = Utils.findRequiredViewAsType(source, R.id.textViewContactUs, "field 'textViewContactUs'", TextView.class);
    target.flContactUs = Utils.findRequiredViewAsType(source, R.id.flContactUs, "field 'flContactUs'", FrameLayout.class);
    target.textViewFeedBack = Utils.findRequiredViewAsType(source, R.id.textViewFeedBack, "field 'textViewFeedBack'", TextView.class);
    target.flFeedBack = Utils.findRequiredViewAsType(source, R.id.flFeedBack, "field 'flFeedBack'", FrameLayout.class);
    target.textViewRateUs = Utils.findRequiredViewAsType(source, R.id.textViewRateUs, "field 'textViewRateUs'", TextView.class);
    target.flRateUs = Utils.findRequiredViewAsType(source, R.id.flRateUs, "field 'flRateUs'", FrameLayout.class);
    target.textViewChangeLanguage = Utils.findRequiredViewAsType(source, R.id.textViewChangeLanguage, "field 'textViewChangeLanguage'", TextView.class);
    target.flAppSharing = Utils.findRequiredViewAsType(source, R.id.flAppSharing, "field 'flAppSharing'", FrameLayout.class);
    target.textViewLogout = Utils.findRequiredViewAsType(source, R.id.textViewLogout, "field 'textViewLogout'", TextView.class);
    target.flLogout = Utils.findRequiredViewAsType(source, R.id.flLogout, "field 'flLogout'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.imageViewBack = null;
    target.textViewEditProfile = null;
    target.flEditProfile = null;
    target.textViewAboutUs = null;
    target.flAboutUs = null;
    target.textViewTermsandCondition = null;
    target.flTermsandCondition = null;
    target.textViewPrivacyPolicy = null;
    target.flPrivacyPolicy = null;
    target.textViewCancellationPoilcy = null;
    target.flCancellationPolicy = null;
    target.textViewFAQ = null;
    target.flFAQ = null;
    target.textViewContactUs = null;
    target.flContactUs = null;
    target.textViewFeedBack = null;
    target.flFeedBack = null;
    target.textViewRateUs = null;
    target.flRateUs = null;
    target.textViewChangeLanguage = null;
    target.flAppSharing = null;
    target.textViewLogout = null;
    target.flLogout = null;
  }
}
