// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignUpActivity_ViewBinding implements Unbinder {
  private SignUpActivity target;

  private View view7f090167;

  private View view7f0900cd;

  @UiThread
  public SignUpActivity_ViewBinding(SignUpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignUpActivity_ViewBinding(final SignUpActivity target, View source) {
    this.target = target;

    View view;
    target.textViewSignInLabel = Utils.findRequiredViewAsType(source, R.id.textViewSignInLabel, "field 'textViewSignInLabel'", TextView.class);
    target.editTextFirstName = Utils.findRequiredViewAsType(source, R.id.editTextFirstName, "field 'editTextFirstName'", EditText.class);
    target.editTextLastName = Utils.findRequiredViewAsType(source, R.id.editTextLastName, "field 'editTextLastName'", EditText.class);
    target.editTextPhoneNumber = Utils.findRequiredViewAsType(source, R.id.editTextPhoneNumber, "field 'editTextPhoneNumber'", EditText.class);
    target.editTextEmail = Utils.findRequiredViewAsType(source, R.id.editTextEmail, "field 'editTextEmail'", EditText.class);
    target.editTextPassword = Utils.findRequiredViewAsType(source, R.id.editTextPassword, "field 'editTextPassword'", EditText.class);
    target.editTextConfirmPassword = Utils.findRequiredViewAsType(source, R.id.editTextConfirmPassword, "field 'editTextConfirmPassword'", EditText.class);
    target.guideline = Utils.findRequiredViewAsType(source, R.id.guideline, "field 'guideline'", Guideline.class);
    target.guideline2 = Utils.findRequiredViewAsType(source, R.id.guideline2, "field 'guideline2'", Guideline.class);
    target.guideline3 = Utils.findRequiredViewAsType(source, R.id.guideline3, "field 'guideline3'", Guideline.class);
    target.guideline4 = Utils.findRequiredViewAsType(source, R.id.guideline4, "field 'guideline4'", Guideline.class);
    target.buttonSignUp = Utils.findRequiredViewAsType(source, R.id.buttonSignUp, "field 'buttonSignUp'", Button.class);
    target.guideline7 = Utils.findRequiredViewAsType(source, R.id.guideline7, "field 'guideline7'", Guideline.class);
    view = Utils.findRequiredView(source, R.id.textViewLogin, "field 'textViewLogin' and method 'onViewClicked'");
    target.textViewLogin = Utils.castView(view, R.id.textViewLogin, "field 'textViewLogin'", TextView.class);
    view7f090167 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.textViewAlreadyHaveAnAccount = Utils.findRequiredViewAsType(source, R.id.textViewAlreadyHaveAnAccount, "field 'textViewAlreadyHaveAnAccount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.imageViewBackButton, "field 'imageView' and method 'onViewClicked'");
    target.imageView = Utils.castView(view, R.id.imageViewBackButton, "field 'imageView'", ImageView.class);
    view7f0900cd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.clSignUp = Utils.findRequiredViewAsType(source, R.id.clSignUp, "field 'clSignUp'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SignUpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewSignInLabel = null;
    target.editTextFirstName = null;
    target.editTextLastName = null;
    target.editTextPhoneNumber = null;
    target.editTextEmail = null;
    target.editTextPassword = null;
    target.editTextConfirmPassword = null;
    target.guideline = null;
    target.guideline2 = null;
    target.guideline3 = null;
    target.guideline4 = null;
    target.buttonSignUp = null;
    target.guideline7 = null;
    target.textViewLogin = null;
    target.textViewAlreadyHaveAnAccount = null;
    target.imageView = null;
    target.clSignUp = null;

    view7f090167.setOnClickListener(null);
    view7f090167 = null;
    view7f0900cd.setOnClickListener(null);
    view7f0900cd = null;
  }
}
