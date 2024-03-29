package com.example.acrepairpreview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.CustomerReview;
import com.example.acrepairpreview.model.Dynamic;
import com.example.acrepairpreview.model.OurServicesList;
import com.example.acrepairpreview.model.TopOffersList;

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
        this.size = getOurServicesLists().size() + getTopOffersLists().size() + getCustomerReview().size();
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
        public RecyclerView recyclerViewDynamic;
        public TextView txtCategoryName;
        private ViewHolderCustomerReviews(View itemView) {
            super(itemView);
            recyclerViewDynamic = itemView.findViewById(R.id.recyclerViewDynamic);
            txtCategoryName = itemView.findViewById(R.id.txtCategoryName);
            recyclerViewDynamic.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));

        }
    }

    public class ViewHolderTopOffers extends RecyclerView.ViewHolder {
        public TextView txtCategoryName;

        private ViewHolderTopOffers(View itemView) {
            super(itemView);
            txtCategoryName = itemView.findViewById(R.id.txtCategoryName);
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
        holder.txtCategoryName.setText(R.string.our_services);
        OurServicesAdapter ourServicesAdapter = new OurServicesAdapter(context, getOurServicesLists());
        holder.recyclerViewDynamic.setAdapter(ourServicesAdapter);
    }

    private void initLayoutTopOffers(ViewHolderTopOffers holder, int position) {
        PagerAdapter pagerAdapter = new TopOfferViewPagerAdapter(true);
    }

    private void initLayoutCustomerReviews(ViewHolderCustomerReviews holder, int position) {
        holder.txtCategoryName.setText(R.string.review_title);
        CustomerReviewsAdapter reviewsAdapter =  new CustomerReviewsAdapter(context, getCustomerReview());
        holder.recyclerViewDynamic.setAdapter(reviewsAdapter);
    }

    private void noLayout(ViewHolderEmpty holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 2) {
            return TYPE_CUSTOMER_REVIEWS;
        } else if (position == 1) {
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

    public List<CustomerReview> getCustomerReview(){
        List<CustomerReview> customerReviews = new ArrayList<>();
        customerReviews.add(new CustomerReview("5.0", "Excellent Service, very polite", "Customer Name", "North Udaipur, 23rd of December", R.drawable.profile));
        customerReviews.add(new CustomerReview("5.0", "Excellent Service, very polite", "Customer Name", "North Udaipur, 23rd of December", R.drawable.profile));
        customerReviews.add(new CustomerReview("5.0", "Excellent Service, very polite", "Customer Name", "North Udaipur, 23rd of December", R.drawable.profile));
        return customerReviews;
    }
}

