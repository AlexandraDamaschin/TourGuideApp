package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfEvents extends AppCompatActivity {
    private static EventAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //create a list of events
        ArrayList<Event> events = new ArrayList<Event>();

        events.add(new Event(R.drawable.meeting, getResources().getString(R.string.event_1), getResources().getString(R.string.sligo)));
        events.add(new Event(R.drawable.business, getResources().getString(R.string.event_2), getResources().getString(R.string.dublin)));
        events.add(new Event(R.drawable.social, getResources().getString(R.string.event_3), getResources().getString(R.string.cork)));
        events.add(new Event(R.drawable.meeting, getResources().getString(R.string.event_4), getResources().getString(R.string.galway)));
        events.add(new Event(R.drawable.business, getResources().getString(R.string.event_5), getResources().getString(R.string.dublin)));
        events.add(new Event(R.drawable.social, getResources().getString(R.string.event_6), getResources().getString(R.string.boyle)));
        events.add(new Event(R.drawable.meeting, getResources().getString(R.string.event_7), getResources().getString(R.string.dublin)));
        events.add(new Event(R.drawable.business, getResources().getString(R.string.event_8), getResources().getString(R.string.sligo)));
        events.add(new Event(R.drawable.social, getResources().getString(R.string.event_9), getResources().getString(R.string.rosses_point)));
        events.add(new Event(R.drawable.meeting, getResources().getString(R.string.event_10), getResources().getString(R.string.dublin)));
        events.add(new Event(R.drawable.business, getResources().getString(R.string.event_11), getResources().getString(R.string.sligo)));
        events.add(new Event(R.drawable.social, getResources().getString(R.string.event_12), getResources().getString(R.string.dublin)));


        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(events, getApplicationContext());
        listView.setAdapter(adapter);

    }
}