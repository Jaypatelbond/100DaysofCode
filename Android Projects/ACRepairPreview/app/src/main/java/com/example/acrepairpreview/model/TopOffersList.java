package com.example.acrepairpreview.model;

import java.util.List;

public class TopOffersList {
    public String mTitle, mPlace;
    public String mPrice;

    public List<TopOffersList> topOffersLists;

    public TopOffersList(String mTitle, String mPlace, String mPrice) {
        this.mTitle = mTitle;
        this.mPlace = mPlace;
        this.mPrice = mPrice;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public List<TopOffersList> getTopOffersList() {
        return topOffersLists;
    }
}
