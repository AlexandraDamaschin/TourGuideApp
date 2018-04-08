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

        restaurants.add(new Event(R.drawable.restaurant_green, "Chez Max", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.restautant_yellow, "THE PORT HOUSE PINTXOS", "TEMPLE BAR"));
        restaurants.add(new Event(R.drawable.restaurant_green, "PABLO PICANTE'S", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.restautant_yellow, "CRACKBIRD", "Dame Street"));
        restaurants.add(new Event(R.drawable.restaurant_green, "KINARA KITCHEN", "RANELAGH"));
        restaurants.add(new Event(R.drawable.restautant_yellow, "GREEN NINETEEN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.restaurant_green, "PAULIE'S PIZZA", "SOUTHSIDE SUBURBS"));
        restaurants.add(new Event(R.drawable.restautant_yellow, "JO'BURGER TOWN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.restaurant_green, "BUNSEN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.restautant_yellow, "NEON", "CITY CENTRE"));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(restaurants, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
