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

        restaurants.add(new Event(R.drawable.meeting, "Chez Max", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.business, "THE PORT HOUSE PINTXOS", "TEMPLE BAR"));
        restaurants.add(new Event(R.drawable.social, "PABLO PICANTE'S", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.meeting, "CRACKBIRD", "Dame Street"));
        restaurants.add(new Event(R.drawable.business, "KINARA KITCHEN", "RANELAGH"));
        restaurants.add(new Event(R.drawable.social, "GREEN NINETEEN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.meeting, "PAULIE'S PIZZA", "SOUTHSIDE SUBURBS"));
        restaurants.add(new Event(R.drawable.business, "JO'BURGER TOWN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.social, "BUNSEN", "GRAFTON STREET AND ENVIRONS"));
        restaurants.add(new Event(R.drawable.meeting, "NEON", "CITY CENTRE"));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(restaurants, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
