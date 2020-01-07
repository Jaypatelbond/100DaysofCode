package com.example.acrepairpreview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.BannerItem;

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
       if(position == bannerItems.size()){
           notifyDataSetChanged();
       }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public int getCount(){
        return Integer.MAX_VALUE;
    }

    public int getRealCount(){
        return bannerItems.size();
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.banner_image);
        }

        void setRoundedImageView(BannerItem bannerItem){
            imageView.setImageResource(bannerItem.getImages());
        }
    }
}