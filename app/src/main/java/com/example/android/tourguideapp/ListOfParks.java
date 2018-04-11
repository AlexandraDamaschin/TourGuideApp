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

        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_1), getResources().getString(R.string.dublin)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_2), getResources().getString(R.string.mayo)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_3), getResources().getString(R.string.galway)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_4), getResources().getString(R.string.cork)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_5), getResources().getString(R.string.donegal)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_6), getResources().getString(R.string.cork)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_7), getResources().getString(R.string.kerry)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_8), getResources().getString(R.string.offlay)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_9), getResources().getString(R.string.dublin)));
        parks.add(new Event(R.drawable.park, getResources().getString(R.string.park_10), getResources().getString(R.string.dublin)));

        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(parks, getApplicationContext());
        listView.setAdapter(adapter);

    }
}
