// Generated code from Butter Knife. Do not modify!
package com.example.acrepairpreview.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.acrepairpreview.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.imageViewNotification = Utils.findRequiredViewAsType(source, R.id.imageViewNotification, "field 'imageViewNotification'", ImageView.class);
    target.textViewLocation = Utils.findRequiredViewAsType(source, R.id.textViewLocation, "field 'textViewLocation'", TextView.class);
    target.rlLayout1 = Utils.findRequiredViewAsType(source, R.id.rlLayout1, "field 'rlLayout1'", RelativeLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager2.class);
    target.rlLayout2 = Utils.findRequiredViewAsType(source, R.id.rlLayout2, "field 'rlLayout2'", RelativeLayout.class);
    target.recyclerViewHome = Utils.findRequiredViewAsType(source, R.id.recyclerViewHome, "field 'recyclerViewHome'", RecyclerView.class);
    target.clActivityMain = Utils.findRequiredViewAsType(source, R.id.clActivityMain, "field 'clActivityMain'", NestedScrollView.class);
    target.indicator = Utils.findRequiredViewAsType(source, R.id.indicator, "field 'indicator'", CircleIndicator3.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.imageViewNotification = null;
    target.textViewLocation = null;
    target.rlLayout1 = null;
    target.viewPager = null;
    target.rlLayout2 = null;
    target.recyclerViewHome = null;
    target.clActivityMain = null;
    target.indicator = null;
  }
}
