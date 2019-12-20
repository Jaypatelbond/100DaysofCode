package com.example.acrepairpreview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.acrepairpreview.R;

import org.jetbrains.annotations.NotNull;

public class BannerAdapter extends PagerAdapter {
    private boolean isMultiScr;

    public BannerAdapter(boolean isMultiScr) {
        this.isMultiScr = isMultiScr;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position){
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.banner_layout, null);
        //new LinearLayout(container.getContext());
        ImageView image_banner = (ImageView) view.findViewById(R.id.image_banner);


        view.setId(R.id.item_id);
        switch (position) {
            case 0:
                image_banner.setImageResource(R.drawable.banner_1);
                break;
            case 1:
                image_banner.setImageResource(R.drawable.banner_2);
                break;
            case 2:
                image_banner.setImageResource(R.drawable.banner_3);
                break;
            case 3:
                image_banner.setImageResource(R.drawable.banner_2);
                break;
            case 4:
                image_banner.setImageResource(R.drawable.banner_3);
                break;
        }
        container.addView(view);
//        linearLayout.getLayoutParams().width = (int)
//        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 180, container.getContext().getResources().getDisplayMetrics());
//        linearLayout.getLayoutParams().height =
//        (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 400, container.getContext().getResources().getDisplayMetrics());
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        RelativeLayout view = (RelativeLayout) object;
        container.removeView(view);
    }
}