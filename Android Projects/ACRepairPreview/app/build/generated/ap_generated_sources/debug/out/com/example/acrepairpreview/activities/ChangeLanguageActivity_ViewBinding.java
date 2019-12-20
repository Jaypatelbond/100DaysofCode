// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangeLanguageActivity_ViewBinding implements Unbinder {
  private ChangeLanguageActivity target;

  private View view7f0900cd;

  private View view7f090166;

  private View view7f09015e;

  private View view7f09015f;

  private View view7f090054;

  @UiThread
  public ChangeLanguageActivity_ViewBinding(ChangeLanguageActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangeLanguageActivity_ViewBinding(final ChangeLanguageActivity target, View source) {
    this.target = target;

    View view;
    target.view3 = Utils.findRequiredView(source, R.id.view3, "field 'view3'");
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.view = Utils.findRequiredView(source, R.id.view, "field 'view'");
    view = Utils.findRequiredView(source, R.id.imageViewBackButton, "field 'imageViewBackButton' and method 'onViewClicked'");
    target.imageViewBackButton = Utils.castView(view, R.id.imageViewBackButton, "field 'imageViewBackButton'", ImageView.class);
    view7f0900cd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.textViewTitle = Utils.findRequiredViewAsType(source, R.id.textViewTitle, "field 'textViewTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.textViewEnglish, "field 'textViewEnglish' and method 'onViewClicked'");
    target.textViewEnglish = Utils.castView(view, R.id.textViewEnglish, "field 'textViewEnglish'", TextView.class);
    view7f090166 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.textViewArabic, "field 'textViewArabic' and method 'onViewClicked'");
    target.textViewArabic = Utils.castView(view, R.id.textViewArabic, "field 'textViewArabic'", TextView.class);
    view7f09015e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.textViewArabicEnglish, "field 'textViewArabicEnglish' and method 'onViewClicked'");
    target.textViewArabicEnglish = Utils.castView(view, R.id.textViewArabicEnglish, "field 'textViewArabicEnglish'", TextView.class);
    view7f09015f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.view4 = Utils.findRequiredView(source, R.id.view4, "field 'view4'");
    target.imageViewCheckboxEnglish = Utils.findRequiredViewAsType(source, R.id.imageViewCheckboxEnglish, "field 'imageViewCheckboxEnglish'", ImageView.class);
    target.imageViewCheckboxArabic = Utils.findRequiredViewAsType(source, R.id.imageViewCheckboxArabic, "field 'imageViewCheckboxArabic'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.buttonChangeLanguage, "field 'buttonChangeLanguage' and method 'onViewClicked'");
    target.buttonChangeLanguage = Utils.castView(view, R.id.buttonChangeLanguage, "field 'buttonChangeLanguage'", Button.class);
    view7f090054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.clChangeLanguage = Utils.findRequiredViewAsType(source, R.id.clChangeLanguage, "field 'clChangeLanguage'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangeLanguageActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.view3 = null;
    target.toolbar = null;
    target.view = null;
    target.imageViewBackButton = null;
    target.textViewTitle = null;
    target.textViewEnglish = null;
    target.textViewArabic = null;
    target.textViewArabicEnglish = null;
    target.view4 = null;
    target.imageViewCheckboxEnglish = null;
    target.imageViewCheckboxArabic = null;
    target.buttonChangeLanguage = null;
    target.clChangeLanguage = null;

    view7f0900cd.setOnClickListener(null);
    view7f0900cd = null;
    view7f090166.setOnClickListener(null);
    view7f090166 = null;
    view7f09015e.setOnClickListener(null);
    view7f09015e = null;
    view7f09015f.setOnClickListener(null);
    view7f09015f = null;
    view7f090054.setOnClickListener(null);
    view7f090054 = null;
  }
}
