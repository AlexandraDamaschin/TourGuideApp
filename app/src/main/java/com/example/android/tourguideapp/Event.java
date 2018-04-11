package com.example.android.tourguideapp;

public class Event {
    //variables needed
    private int nImage;
    private String mName;
    private String mLocation;

    //contructor
    public Event(int image, String name, String location) {
        nImage = image;
        mName = name;
        mLocation = location;
    }

    //get image
    public int getImage() {
        return nImage;
    }

    //get name
    public String getName() {
        return mName;
    }

    //get location
    public String getLocation() {
        return mLocation;
    }

}
