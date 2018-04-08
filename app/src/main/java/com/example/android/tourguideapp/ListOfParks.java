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

        parks.add(new Event(R.drawable.meeting, "Ardgillan", "Dublin"));
        parks.add(new Event(R.drawable.business, "Ballycroy National Park", "Mayo"));
        parks.add(new Event(R.drawable.social, "Coole Park", "Galway"));
        parks.add(new Event(R.drawable.meeting, "Doneraile Park", "Cork"));
        parks.add(new Event(R.drawable.business, "Glenveagh National Park ", "Donegal"));
        parks.add(new Event(R.drawable.social, "Gougane Barra ", "Cork"));
        parks.add(new Event(R.drawable.meeting, "Killarney National Park", "Kerry"));
        parks.add(new Event(R.drawable.business, "Lough Boora", "Offaly"));
        parks.add(new Event(R.drawable.social, "The Phoenix Park", "Dublin"));
        parks.add(new Event(R.drawable.meeting, "St Stephen’s Green", ""));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(parks, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
