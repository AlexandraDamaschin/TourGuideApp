package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParkFragment extends Fragment {

    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        
        //create a list of events
       final ArrayList<Event> parks = new ArrayList<Event>();

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


        EventAdapter adapter = new EventAdapter(parks, getContext());
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
