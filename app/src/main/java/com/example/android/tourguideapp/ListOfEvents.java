package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
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

        events.add(new Event(R.drawable.meeting, "IT Sligo Presentation", "Sligo"));
        events.add(new Event(R.drawable.business, "Internship with us", "Dublin"));
        events.add(new Event(R.drawable.social, "Walk around Cork", "Cork"));
        events.add(new Event(R.drawable.meeting, "Google app development", "Galway"));
        events.add(new Event(R.drawable.business, "IT is for you!", "Dublin"));
        events.add(new Event(R.drawable.social, "Parks and nature", "Boyle"));
        events.add(new Event(R.drawable.meeting, "Trinity college walk", "Dublin"));
        events.add(new Event(R.drawable.business, "What`s next in your career?", "Sligo"));
        events.add(new Event(R.drawable.social, "Relax and enjoy the beach", "Rosses Point"));
        events.add(new Event(R.drawable.meeting, "Github introduction", "Dublin"));
        events.add(new Event(R.drawable.business, "Database presentation", "Sligo"));
        events.add(new Event(R.drawable.social, "Marathon", "Dublin"));


        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(events, getApplicationContext());
        listView.setAdapter(adapter);

    }
}