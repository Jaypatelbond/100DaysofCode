package com.example.acrepairpreview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.model.CustomerReview;

import java.util.List;

/**
 * @author Jaypatelbond created on 23-12-2019.
 */

public class CustomerReviewsAdapter extends RecyclerView.Adapter<CustomerReviewsAdapter.ViewHolder> {
    Context context;
    List<CustomerReview> customerReviews;

    public CustomerReviewsAdapter(Context context, List<CustomerReview> customerReviews) {
        this.context = context;
        this.customerReviews = customerReviews;
    }


    @NonNull
    @Override
    public CustomerReviewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomerReviewsAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.review_home, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerReviewsAdapter.ViewHolder holder, int position) {
      holder.imageViewProfile.setImageResource(customerReviews.get(position).getmPhoto());
      holder.textViewAddress.setText(customerReviews.get(position).getmAddress());
      holder.textViewName.setText(customerReviews.get(position).getmName());
      holder.textViewRating.setText(customerReviews.get(position).getmRating());
      holder.textViewReview.setText(customerReviews.get(position).getmReviews());
    }

    @Override
    public int getItemCount() {
        return customerReviews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewAddress, textViewReview, textViewRating;
        ImageView imageViewProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewAddress = itemView.findViewById(R.id.textViewAddress);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewReview = itemView.findViewById(R.id.textViewReview);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            imageViewProfile = itemView.findViewById(R.id.imageViewProfile);

        }
    }
}
