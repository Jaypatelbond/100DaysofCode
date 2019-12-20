package com.example.acrepairpreview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.TopOffersList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaypatelbond created on 19-12-2019.
 */

public class TopOfferViewPagerAdapter extends PagerAdapter {
    private boolean isMultiScr;

    public TopOfferViewPagerAdapter(boolean isMultiScr) {
        this.isMultiScr = isMultiScr;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.top_offers_layout, null);
//        new LinearLayout(container.getContext());
        ImageView image_banner_top_offers = (ImageView) view.findViewById(R.id.image_banner_top_offers);
        CardView cardViewTopOffers = (CardView) view.findViewById(R.id.cardViewTopOffers);
        TextView textViewACInstallation = (TextView) view.findViewById(R.id.textViewACInstallation);
        TextView textViewAtHome = (TextView) view.findViewById(R.id.textViewAtHome);
        TextView textViewOfferPrice = (TextView) view.findViewById(R.id.textViewOfferPrice);
        view.setId(R.id.item_id);
        switch (position) {
            case 0:
                textViewAtHome.setText(getTopOffersLists().get(position).getmPlace());
                textViewOfferPrice.setText(getTopOffersLists().get(position).getmPrice());
                textViewACInstallation.setText(getTopOffersLists().get(position).getmTitle());
                image_banner_top_offers.setImageResource(R.drawable.offer_1);
                break;
            case 1:
                textViewAtHome.setText(getTopOffersLists().get(position).getmPlace());
                textViewOfferPrice.setText(getTopOffersLists().get(position).getmPrice());
                textViewACInstallation.setText(getTopOffersLists().get(position).getmTitle());
                image_banner_top_offers.setImageResource(R.drawable.offer_2);
                break;
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        CardView view = (CardView) object;
        container.removeView(view);
    }

    public List<TopOffersList> getTopOffersLists() {
        List<TopOffersList> topOffersLists = new ArrayList<>();
        topOffersLists.add(new TopOffersList("AC Installation / Remove", "at Home", "@Rs 199/-"));
        topOffersLists.add(new TopOffersList("Repairing", "at Home", "@Rs 299/-"));
        return topOffersLists;
    }
}