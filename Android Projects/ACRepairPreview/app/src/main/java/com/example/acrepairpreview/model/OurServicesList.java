package com.example.acrepairpreview.model;

import java.util.List;

/**
 * @author Jaypatelbond
 */

public class OurServicesList {
    public String getTitle() {
        return title;
    }

    public OurServicesList(String title, int serviceImage) {
        this.title = title;
        this.serviceImage = serviceImage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String title;

    public int getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(int serviceImage) {
        this.serviceImage = serviceImage;
    }

    public int serviceImage;


    public List<OurServicesList> getOurServiceList() {
        return ourServicesLists;
    }

    public List<OurServicesList> ourServicesLists;
}
