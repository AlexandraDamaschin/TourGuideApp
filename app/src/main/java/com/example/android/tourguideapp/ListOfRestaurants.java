package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfRestaurants extends AppCompatActivity {
    private static EventAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //create a list of events
        ArrayList<Event> restaurants = new ArrayList<Event>();

        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_1), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_2), getResources().getString(R.string.temple_bar)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_3), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_4), getResources().getString(R.string.dame_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_5), getResources().getString(R.string.ranelagh)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_6), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_7), getResources().getString(R.string.southside)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_8), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_9), getResources().getString(R.string.grafton_street)));
        restaurants.add(new Event(R.drawable.restautant_yellow, getResources().getString(R.string.restaurant_10), getResources().getString(R.string.city_center)));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(restaurants, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
