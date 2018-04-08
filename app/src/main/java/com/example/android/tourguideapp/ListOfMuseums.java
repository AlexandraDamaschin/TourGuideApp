package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfMuseums extends AppCompatActivity {
    private static EventAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //create a list of events
        ArrayList<Event> museums = new ArrayList<Event>();

        museums.add(new Event(R.drawable.meeting, "Kilmainham Gaol", "Dublin"));
        museums.add(new Event(R.drawable.business, "The Art House ", "Dunfanaghy"));
        museums.add(new Event(R.drawable.social, "Michael Davitt Museum ", "Foxford"));
        museums.add(new Event(R.drawable.meeting, "Irish Military War Museum & Family Park ", "Starinagh"));
        museums.add(new Event(R.drawable.business, "Old Irish Ways", "Bruff"));
        museums.add(new Event(R.drawable.social, "EPIC The Irish Emigration Museum", "Dublin"));
        museums.add(new Event(R.drawable.meeting, "Derryglad Folk & Heritage Museum", "Athlone"));
        museums.add(new Event(R.drawable.business, "Croke Park Stadium Tour & GAA Museum", "Dublin"));
        museums.add(new Event(R.drawable.social, "Irish Whiskey Museum", "Dublin"));
        museums.add(new Event(R.drawable.meeting, "Nano Nagle Place ", "Cork"));
        museums.add(new Event(R.drawable.business, "The Little Museum of Dublin", "Dublin"));
        museums.add(new Event(R.drawable.social, "Leahys Open Farm ", "Cork"));


        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(museums, getApplicationContext());
        listView.setAdapter(adapter);

    }

}
