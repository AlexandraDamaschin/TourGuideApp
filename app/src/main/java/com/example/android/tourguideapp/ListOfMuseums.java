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

        museums.add(new Event(R.drawable.museum, "Kilmainham Gaol", "Dublin"));
        museums.add(new Event(R.drawable.museum, "The Art House ", "Dunfanaghy"));
        museums.add(new Event(R.drawable.museum, "Michael Davitt Museum ", "Foxford"));
        museums.add(new Event(R.drawable.museum, "Irish Military War Museum & Family Park ", "Starinagh"));
        museums.add(new Event(R.drawable.museum, "Old Irish Ways", "Bruff"));
        museums.add(new Event(R.drawable.museum, "EPIC The Irish Emigration Museum", "Dublin"));
        museums.add(new Event(R.drawable.museum, "Derryglad Folk & Heritage Museum", "Athlone"));
        museums.add(new Event(R.drawable.museum, "Croke Park Stadium Tour & GAA Museum", "Dublin"));
        museums.add(new Event(R.drawable.museum, "Irish Whiskey Museum", "Dublin"));
        museums.add(new Event(R.drawable.museum, "Nano Nagle Place ", "Cork"));
        museums.add(new Event(R.drawable.museum, "The Little Museum of Dublin", "Dublin"));
        museums.add(new Event(R.drawable.museum, "Leahys Open Farm ", "Cork"));


        ListView listView = findViewById(R.id.list);
        adapter = new EventAdapter(museums, getApplicationContext());
        listView.setAdapter(adapter);

    }

}
