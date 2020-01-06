package com.example.acrepairpreview.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.adapters.BannerAdapter;
import com.example.acrepairpreview.adapters.HomeListAdapter;
import com.example.acrepairpreview.model.BannerItem;
import com.example.acrepairpreview.model.Dynamic;
import com.example.acrepairpreview.utils.InkPageIndicator;

import java.util.ArrayList;
import java.util.List;

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
    ViewPager2 viewPager;
    @BindView(R.id.rlLayout2)
    RelativeLayout rlLayout2;
    @BindView(R.id.recyclerViewHome)
    RecyclerView recyclerViewHome;
    @BindView(R.id.clActivityMain)
    NestedScrollView clActivityMain;
    Dynamic dynamic = new Dynamic();
    List<BannerItem> bannerItems;
    @BindView(R.id.indicator)
    InkPageIndicator indicator;
    private Handler sliderHandler = new Handler();

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
        List<BannerItem> bannerItems = new ArrayList<>();
        bannerItems.add(new BannerItem(R.drawable.banner_1));
        bannerItems.add(new BannerItem(R.drawable.banner_2));
        bannerItems.add(new BannerItem(R.drawable.banner_3));
        bannerItems.add(new BannerItem(R.drawable.banner_2));
        bannerItems.add(new BannerItem(R.drawable.banner_3));
        viewPager.setAdapter(new BannerAdapter(bannerItems, viewPager));
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(1);
        indicator.setViewPager(viewPager);
//        viewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        float pageMargin = getResources().getDimensionPixelOffset(R.dimen.pageMargin);
        float pageOffset = getResources().getDimensionPixelOffset(R.dimen.offset);

        viewPager.setPageTransformer((page, position) -> {
            float myOffset = position * -(2 * pageOffset + pageMargin);
            if (position < -1) {
                page.setTranslationX(-myOffset);
            } else if (position <= 1) {
                float scaleFactor = Math.max(0.7f, 1 - Math.abs(position - 0.14285715f));
                page.setTranslationX(myOffset);
                page.setScaleY(scaleFactor);
                page.setAlpha(scaleFactor);
            } else {
                page.setAlpha(0);
                page.setTranslationX(myOffset);
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 3000);
            }
        });

    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    }
}