package com.example.android.tourguideapp;

import java.util.Date;

public class Event {
    //variables needed
    private int image;
    private String name;
    private String location;

    //contructor
    public Event(int mImage, String mName, String mLocation) {
        image = mImage;
        name = mName;
        location = mLocation;
    }

    //get image
    public int getImage() {
        return image;
    }

    //get name
    public String getName() {
        return name;
    }

    //get location
    public String getLocation() {
        return location;
    }

}
