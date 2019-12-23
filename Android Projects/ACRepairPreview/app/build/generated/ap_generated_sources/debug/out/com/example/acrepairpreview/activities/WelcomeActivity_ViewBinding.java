// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WelcomeActivity_ViewBinding implements Unbinder {
  private WelcomeActivity target;

  private View view7f090168;

  private View view7f090056;

  private View view7f090176;

  @UiThread
  public WelcomeActivity_ViewBinding(WelcomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WelcomeActivity_ViewBinding(final WelcomeActivity target, View source) {
    this.target = target;

    View view;
    target.view4 = Utils.findRequiredView(source, R.id.view4, "field 'view4'");
    target.textViewSignInLabel = Utils.findRequiredViewAsType(source, R.id.textViewSignInLabel, "field 'textViewSignInLabel'", TextView.class);
    target.editTextEmail = Utils.findRequiredViewAsType(source, R.id.editTextEmail, "field 'editTextEmail'", EditText.class);
    target.editTextPassword = Utils.findRequiredViewAsType(source, R.id.editTextPassword, "field 'editTextPassword'", EditText.class);
    target.guideline = Utils.findRequiredViewAsType(source, R.id.guideline, "field 'guideline'", Guideline.class);
    target.guideline2 = Utils.findRequiredViewAsType(source, R.id.guideline2, "field 'guideline2'", Guideline.class);
    target.guideline3 = Utils.findRequiredViewAsType(source, R.id.guideline3, "field 'guideline3'", Guideline.class);
    target.guideline4 = Utils.findRequiredViewAsType(source, R.id.guideline4, "field 'guideline4'", Guideline.class);
    view = Utils.findRequiredView(source, R.id.textViewForgotPassword, "field 'textViewForgotPassword' and method 'onViewClicked'");
    target.textViewForgotPassword = Utils.castView(view, R.id.textViewForgotPassword, "field 'textViewForgotPassword'", TextView.class);
    view7f090168 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.buttonSignIn, "field 'button' and method 'onViewClicked'");
    target.button = Utils.castView(view, R.id.buttonSignIn, "field 'button'", Button.class);
    view7f090056 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.view2 = Utils.findRequiredView(source, R.id.view2, "field 'view2'");
    target.textViewOrConnectWith = Utils.findRequiredViewAsType(source, R.id.textViewOrConnectWith, "field 'textViewOrConnectWith'", TextView.class);
    target.guideline5 = Utils.findRequiredViewAsType(source, R.id.guideline5, "field 'guideline5'", Guideline.class);
    target.guideline6 = Utils.findRequiredViewAsType(source, R.id.guideline6, "field 'guideline6'", Guideline.class);
    target.cardViewTwitter = Utils.findRequiredViewAsType(source, R.id.cardViewTwitter, "field 'cardViewTwitter'", CardView.class);
    target.cardViewFacebook = Utils.findRequiredViewAsType(source, R.id.cardViewFacebook, "field 'cardViewFacebook'", CardView.class);
    target.cardViewGoogle = Utils.findRequiredViewAsType(source, R.id.cardViewGoogle, "field 'cardViewGoogle'", CardView.class);
    target.clWelcome = Utils.findRequiredViewAsType(source, R.id.clWelcome, "field 'clWelcome'", ConstraintLayout.class);
    target.group = Utils.findRequiredViewAsType(source, R.id.group, "field 'group'", Group.class);
    target.group2 = Utils.findRequiredViewAsType(source, R.id.group2, "field 'group2'", Group.class);
    target.guideline7 = Utils.findRequiredViewAsType(source, R.id.guideline7, "field 'guideline7'", Guideline.class);
    view = Utils.findRequiredView(source, R.id.textViewSignUp, "field 'textViewSignUp' and method 'onViewClicked'");
    target.textViewSignUp = Utils.castView(view, R.id.textViewSignUp, "field 'textViewSignUp'", TextView.class);
    view7f090176 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.textViewDontHaveAnAccount = Utils.findRequiredViewAsType(source, R.id.textViewDontHaveAnAccount, "field 'textViewDontHaveAnAccount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WelcomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.view4 = null;
    target.textViewSignInLabel = null;
    target.editTextEmail = null;
    target.editTextPassword = null;
    target.guideline = null;
    target.guideline2 = null;
    target.guideline3 = null;
    target.guideline4 = null;
    target.textViewForgotPassword = null;
    target.button = null;
    target.view2 = null;
    target.textViewOrConnectWith = null;
    target.guideline5 = null;
    target.guideline6 = null;
    target.cardViewTwitter = null;
    target.cardViewFacebook = null;
    target.cardViewGoogle = null;
    target.clWelcome = null;
    target.group = null;
    target.group2 = null;
    target.guideline7 = null;
    target.textViewSignUp = null;
    target.textViewDontHaveAnAccount = null;

    view7f090168.setOnClickListener(null);
    view7f090168 = null;
    view7f090056.setOnClickListener(null);
    view7f090056 = null;
    view7f090176.setOnClickListener(null);
    view7f090176 = null;
  }
}
