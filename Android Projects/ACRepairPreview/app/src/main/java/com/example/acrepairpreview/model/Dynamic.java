package com.example.acrepairpreview.model;

import com.example.acrepairpreview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaypatelbond created on 19-12-2019.
 */

public class Dynamic {

    public List<Dynamic> getDynamic() {
        getOurServicesLists();
        getTopOffersLists();
        return dynamic;
    }

    public void setDynamic(List<Dynamic> dynamic) {
        this.dynamic = dynamic;
    }

    List<Dynamic> dynamic = null;

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

    public void setOurServicesLists(List<OurServicesList> ourServicesLists) {
        this.ourServicesLists = ourServicesLists;
    }

    public List<TopOffersList> getTopOffersLists() {
        List<TopOffersList> topOffersLists = new ArrayList<>();
        topOffersLists.add(new TopOffersList("AC Installation / Remove", "at Home", "@Rs 199/-"));
        topOffersLists.add(new TopOffersList("Repairing", "at Home", "@Rs 299/-"));
        return topOffersLists;
    }

    public void setTopOffersLists(List<TopOffersList> topOffersLists) {
        this.topOffersLists = topOffersLists;
    }

    List<OurServicesList> ourServicesLists;

    List<TopOffersList> topOffersLists;


}
