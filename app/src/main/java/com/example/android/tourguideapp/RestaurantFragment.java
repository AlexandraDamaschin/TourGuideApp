package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //create a list of events
        final ArrayList<Event> restaurants = new ArrayList<Event>();

        restaurants.add(new Event(R.drawable.restaurant_green, getResources().getString(R.string.restaurant_1), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_2), getResources().getString(R.string.temple_bar)));
        restaurants.add(new Event(R.drawable.restaurant_green, getResources().getString(R.string.restaurant_3), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_4), getResources().getString(R.string.dame_street)));
        restaurants.add(new Event(R.drawable.restaurant_green, getResources().getString(R.string.restaurant_5), getResources().getString(R.string.ranelagh)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_6), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restaurant_green, getResources().getString(R.string.restaurant_7), getResources().getString(R.string.southside)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_8), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restaurant_green, getResources().getString(R.string.restaurant_9), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_10), getResources().getString(R.string.city_center)));

        EventAdapter adapter = new EventAdapter(restaurants, getContext());
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
