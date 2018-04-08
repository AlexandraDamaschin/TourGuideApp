package com.example.android.tourguideapp;

import java.util.Date;

public class Event {
    //variables needed
    private String image;
    private String name;
    private String location;
    private Date date;

    //contructor
    public Event(String mImage, String mName, String mLocation, Date mDate) {
        image = mImage;
        name = mName;
        location = mLocation;
        date = mDate;
    }

    //get image
    public String getImage() {
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

    //get date
    public Date getDate() {
        return date;
    }
}
