package com.example.acrepairpreview.model;

import java.util.List;

/**
 * @author Jaypatelbond created on 23-12-2019.
 */

public class CustomerReview {
    public String mRating, mReviews, mName, mAddress;
    public int mPhoto;

    public List<CustomerReview> getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(List<CustomerReview> customerReviews) {
        this.customerReviews = customerReviews;
    }

    public List<CustomerReview> customerReviews;

    public CustomerReview(String mRating, String mReviews, String mName, String mAddress, int mPhoto) {
        this.mRating = mRating;
        this.mReviews = mReviews;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhoto = mPhoto;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmReviews() {
        return mReviews;
    }

    public void setmReviews(String mReviews) {
        this.mReviews = mReviews;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public int getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(int mPhoto) {
        this.mPhoto = mPhoto;
    }
}
