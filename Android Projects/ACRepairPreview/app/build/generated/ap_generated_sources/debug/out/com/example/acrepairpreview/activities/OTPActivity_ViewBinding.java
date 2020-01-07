// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Guideline;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OTPActivity_ViewBinding implements Unbinder {
  private OTPActivity target;

  private View view7f0900c6;

  @UiThread
  public OTPActivity_ViewBinding(OTPActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OTPActivity_ViewBinding(final OTPActivity target, View source) {
    this.target = target;

    View view;
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.buttonSubmit = Utils.findRequiredViewAsType(source, R.id.buttonSubmit, "field 'buttonSubmit'", Button.class);
    view = Utils.findRequiredView(source, R.id.imageBackButton, "field 'imageView2' and method 'onViewClicked'");
    target.imageView2 = Utils.castView(view, R.id.imageBackButton, "field 'imageView2'", ImageView.class);
    view7f0900c6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.textView = Utils.findRequiredViewAsType(source, R.id.textViewEditProfile, "field 'textView'", TextView.class);
    target.textView2 = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView2'", TextView.class);
    target.edittextField1 = Utils.findRequiredViewAsType(source, R.id.edittextField1, "field 'edittextField1'", EditText.class);
    target.edittextField2 = Utils.findRequiredViewAsType(source, R.id.edittextField2, "field 'edittextField2'", EditText.class);
    target.edittextField3 = Utils.findRequiredViewAsType(source, R.id.edittextField3, "field 'edittextField3'", EditText.class);
    target.edittextField4 = Utils.findRequiredViewAsType(source, R.id.edittextField4, "field 'edittextField4'", EditText.class);
    target.guideline1 = Utils.findRequiredViewAsType(source, R.id.guideline1, "field 'guideline1'", Guideline.class);
    target.guideline = Utils.findRequiredViewAsType(source, R.id.guideline, "field 'guideline'", Guideline.class);
    target.textView3 = Utils.findRequiredViewAsType(source, R.id.textView3, "field 'textView3'", TextView.class);
    target.textViewResendCode = Utils.findRequiredViewAsType(source, R.id.textViewResendCode, "field 'textViewResendCode'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OTPActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.toolbar = null;
    target.buttonSubmit = null;
    target.imageView2 = null;
    target.textView = null;
    target.textView2 = null;
    target.edittextField1 = null;
    target.edittextField2 = null;
    target.edittextField3 = null;
    target.edittextField4 = null;
    target.guideline1 = null;
    target.guideline = null;
    target.textView3 = null;
    target.textViewResendCode = null;

    view7f0900c6.setOnClickListener(null);
    view7f0900c6 = null;
  }
}
