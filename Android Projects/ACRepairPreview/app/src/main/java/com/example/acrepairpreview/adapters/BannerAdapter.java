package com.example.acrepairpreview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.BannerItem;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.BannerViewHolder>{
   private List<BannerItem> bannerItems;
   private ViewPager2 viewPager2;

    public BannerAdapter(List<BannerItem> bannerItems, ViewPager2 viewPager2) {
        this.viewPager2 = viewPager2;
        this.bannerItems = bannerItems;
    }


    @NonNull
    @Override
    public BannerAdapter.BannerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BannerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.BannerViewHolder holder, int position) {
       holder.setRoundedImageView(bannerItems.get(position));
       if(position == bannerItems.size() - 2){
           viewPager2.post(runnable);
       }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView roundedImageView;

        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView = itemView.findViewById(R.id.banner_image);
        }

        void setRoundedImageView(BannerItem bannerItem){
            roundedImageView.setImageResource(bannerItem.getImages());
        }
    }

    private  Runnable runnable = new Runnable() {
        @Override
        public void run() {
            bannerItems.addAll(bannerItems);
            notifyDataSetChanged();
        }
    };
}