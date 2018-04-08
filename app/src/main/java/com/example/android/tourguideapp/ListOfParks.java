package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfParks extends AppCompatActivity {
    private static EventAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //create a list of events
        ArrayList<Event> parks = new ArrayList<Event>();

        parks.add(new Event(R.drawable.park, "Ardgillan", "Dublin"));
        parks.add(new Event(R.drawable.park, "Ballycroy National Park", "Mayo"));
        parks.add(new Event(R.drawable.park, "Coole Park", "Galway"));
        parks.add(new Event(R.drawable.park, "Doneraile Park", "Cork"));
        parks.add(new Event(R.drawable.park, "Glenveagh National Park ", "Donegal"));
        parks.add(new Event(R.drawable.park, "Gougane Barra ", "Cork"));
        parks.add(new Event(R.drawable.park, "Killarney National Park", "Kerry"));
        parks.add(new Event(R.drawable.park, "Lough Boora", "Offaly"));
        parks.add(new Event(R.drawable.park, "The Phoenix Park", "Dublin"));
        parks.add(new Event(R.drawable.park, "St Stephen’s Green", ""));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(parks, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
