package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context mContext, FragmentManager fm) {
        super(fm);
        context = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventFragment();
        } else if (position == 1) {
            return new MuseumFragment();
        } else if (position == 2) {
            return new ParkFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    //total number of pages
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.events);
        } else if (position == 1) {
            return context.getString(R.string.museums);
        } else if (position == 2) {
            return context.getString(R.string.parks);
        } else {
            return context.getString(R.string.restaurants);
        }
    }

}
