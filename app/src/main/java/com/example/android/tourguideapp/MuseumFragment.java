package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //create a list of events
        final ArrayList<Event> museums = new ArrayList<Event>();

        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_1), getResources().getString(R.string.dublin)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_2), getResources().getString(R.string.dunfanaghy)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_3), getResources().getString(R.string.foxford)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_4), getResources().getString(R.string.starinagh)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_5), getResources().getString(R.string.bruff)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_6), getResources().getString(R.string.dublin)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_7), getResources().getString(R.string.athlone)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_8), getResources().getString(R.string.dublin)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_9), getResources().getString(R.string.dublin)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_10), getResources().getString(R.string.cork)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_11), getResources().getString(R.string.dublin)));
        museums.add(new Event(R.drawable.museum, getResources().getString(R.string.museum_12), getResources().getString(R.string.cork)));

        EventAdapter adapter = new EventAdapter(museums, getContext());
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
