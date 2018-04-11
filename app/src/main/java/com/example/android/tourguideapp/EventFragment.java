package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        //create a list of events
        final ArrayList<Event> events = new ArrayList<Event>();

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


        EventAdapter adapter = new EventAdapter(events, getContext());
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
