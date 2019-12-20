package com.example.acrepairpreview.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.Dynamic;
import com.example.acrepairpreview.model.OurServicesList;
import com.example.acrepairpreview.model.TopOffersList;
import com.tmall.ultraviewpager.UltraViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaypatelbond
 */

public class HomeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_CUSTOMER_REVIEWS = 3;
    private static final int TYPE_TOP_OFFERS = 2;
    private static final int TYPE_OUR_SERVICES = 1;
    Context context;
    List<Dynamic> dynamic;
    private int size = 0;

    public HomeListAdapter(Context context, List<Dynamic> dynamic) {
        this.context = context;
        this.dynamic = dynamic;
        this.size = getOurServicesLists().size() + getTopOffersLists().size();
    }

    public class ViewHolderOurServices extends RecyclerView.ViewHolder {
        public RecyclerView recyclerViewDynamic;
        public TextView txtCategoryName;

        private ViewHolderOurServices(View itemView) {
            super(itemView);
            recyclerViewDynamic = itemView.findViewById(R.id.recyclerViewDynamic);
            txtCategoryName = itemView.findViewById(R.id.txtCategoryName);
            recyclerViewDynamic.setLayoutManager(new GridLayoutManager(context, 3));
        }
    }

    public class ViewHolderCustomerReviews extends RecyclerView.ViewHolder {
        private ViewHolderCustomerReviews(View itemView) {
            super(itemView);

        }
    }

    public class ViewHolderTopOffers extends RecyclerView.ViewHolder {
        public TextView txtCategoryName;
//        public RecyclerView recyclerViewDynamic;
        UltraViewPager ultraViewPagerTopOffer;


        private ViewHolderTopOffers(View itemView) {
            super(itemView);
            txtCategoryName = itemView.findViewById(R.id.txtCategoryName);
//            recyclerViewDynamic = itemView.findViewById(R.id.recyclerViewDynamic);
//            recyclerViewDynamic.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            ultraViewPagerTopOffer = itemView.findViewById(R.id.viewPagerTopOffer);


        }
    }

    public class ViewHolderEmpty extends RecyclerView.ViewHolder {
        private ViewHolderEmpty(View itemView) {
            super(itemView);

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_OUR_SERVICES) {
            return new ViewHolderOurServices(LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_home, parent, false));
        }
        if (viewType == TYPE_CUSTOMER_REVIEWS) {
            return new ViewHolderCustomerReviews(LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_home, parent, false));
        }
        if (viewType == TYPE_TOP_OFFERS) {
            return new ViewHolderTopOffers(LayoutInflater.from(parent.getContext()).inflate(R.layout.top_offer_viewpager, parent, false));
        }

        return new ViewHolderEmpty(LayoutInflater.from(parent.getContext()).inflate(R.layout.empty_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TYPE_OUR_SERVICES:
                initLayoutOurServices((ViewHolderOurServices) holder, position);
                return;
            case TYPE_TOP_OFFERS:
                initLayoutTopOffers((ViewHolderTopOffers) holder, position);
                return;
            case TYPE_CUSTOMER_REVIEWS:
                initLayoutCustomerReviews((ViewHolderCustomerReviews) holder, position);
                return;
            default:
                noLayout((ViewHolderEmpty) holder, position);
        }
    }

    private void initLayoutOurServices(ViewHolderOurServices holder, int position) {
        OurServicesAdapter ourServicesAdapter = new OurServicesAdapter(context, getOurServicesLists());
        holder.recyclerViewDynamic.setAdapter(ourServicesAdapter);
    }

    @SuppressLint("SetTextI18n")
    private void initLayoutTopOffers(ViewHolderTopOffers holder, int position) {
        //Initilizing the  BannerAdapter，and adding child view to UltraViewPager
        PagerAdapter pagerAdapter = new TopOfferViewPagerAdapter(true);
        holder.ultraViewPagerTopOffer.setAdapter(pagerAdapter);
        holder.ultraViewPagerTopOffer.setOffscreenPageLimit(2);
        holder.ultraViewPagerTopOffer.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        //Setting the multiscreen images.
        holder.ultraViewPagerTopOffer.setMultiScreen(0.9f);
        //viewPager.setItemRatio(1.0f);
        holder.txtCategoryName.setText("Top Offers");
    }

    private void initLayoutCustomerReviews(ViewHolderCustomerReviews holder, int position) {
    }

    private void noLayout(ViewHolderEmpty holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 1) {
            return TYPE_TOP_OFFERS;
        } else {
            return TYPE_OUR_SERVICES;
        }

    }

    public List<OurServicesList> getOurServicesLists() {
        List<OurServicesList> ourServicesLists = new ArrayList<>();
        ourServicesLists.add(new OurServicesList("AC Service", R.drawable.ic_air_conditioner));
        ourServicesLists.add(new OurServicesList("AC Repair", R.drawable.ic_air_conditioner));
        ourServicesLists.add(new OurServicesList("AC Installation", R.drawable.ic_bed));
        ourServicesLists.add(new OurServicesList("AC Uninstallation", R.drawable.ic_airconditioner_uninstallation));
        ourServicesLists.add(new OurServicesList("My Booking", R.drawable.ic_booking));
        ourServicesLists.add(new OurServicesList("More", R.drawable.ic_more));
        return ourServicesLists;
    }

    public List<TopOffersList> getTopOffersLists() {
        List<TopOffersList> topOffersLists = new ArrayList<>();
        topOffersLists.add(new TopOffersList("AC Installation / Remove", "at Home", "@Rs 199/-"));
        topOffersLists.add(new TopOffersList("Repairing", "at Home", "@Rs 299/-"));
        return topOffersLists;
    }
}

