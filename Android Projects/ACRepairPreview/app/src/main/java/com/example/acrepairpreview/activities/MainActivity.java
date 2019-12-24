package com.example.acrepairpreview.activities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.adapters.BannerAdapter;
import com.example.acrepairpreview.adapters.HomeListAdapter;
import com.example.acrepairpreview.model.Dynamic;
import com.tmall.ultraviewpager.UltraViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Jaypatelbond
 * @apiNote @https://github.com/alibaba/UltraViewPager
 * @implNote Checkout the @link for implementation of View.OnClickListener, CompoundButton.OnCheckedChangeListener
 */

public class MainActivity extends BaseActivity {
    Context context = this;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.imageViewNotification)
    ImageView imageViewNotification;
    @BindView(R.id.textViewLocation)
    TextView textViewLocation;
    @BindView(R.id.rlLayout1)
    RelativeLayout rlLayout1;
    @BindView(R.id.viewPager)
    UltraViewPager viewPager;
    @BindView(R.id.rlLayout2)
    RelativeLayout rlLayout2;
    @BindView(R.id.recyclerViewHome)
    RecyclerView recyclerViewHome;
    @BindView(R.id.clActivityMain)
    NestedScrollView clActivityMain;
    Dynamic dynamic = new Dynamic();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        HomeListAdapter adapter = new HomeListAdapter(context, dynamic.getDynamic());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerViewHome.setLayoutManager(linearLayoutManager);
        recyclerViewHome.setItemAnimator(new DefaultItemAnimator());
        recyclerViewHome.setAdapter(adapter);

        initBannerViewPager();
    }

    public void initBannerViewPager() {
        viewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        //Initilizing the  BannerAdapter，and adding child view to UltraViewPager
        PagerAdapter pagerAdapter = new BannerAdapter(true);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(3);
        //Setting the multiscreen images.
        viewPager.setMultiScreen(0.8f);
        //viewPager.setItemRatio(1.0f);
        //viewPager.setAutoMeasureHeight(true);

        //initialize built-in indicator
        viewPager.initIndicator();
        //Set style of indicators
        viewPager.getIndicator()
                .setOrientation(UltraViewPager.Orientation.HORIZONTAL)
                .setFocusColor(Color.GRAY)
                .setNormalColor(Color.BLACK)
                .setRadius((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics()));
        //Setting the Alignment in the Bottom of the ViewPager(
        viewPager.getIndicator().setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
        //Setting the Margin (Top)
        viewPager.getIndicator().setMargin(0, 45, 0, 0);
        //Construct built-in indicator, and add it to  UltraViewPager
        viewPager.getIndicator().build();

        //Set an Infinite loop
        viewPager.setInfiniteLoop(true);
        //Enable auto-scroll mode
        viewPager.setAutoScroll(3000);
    }


}