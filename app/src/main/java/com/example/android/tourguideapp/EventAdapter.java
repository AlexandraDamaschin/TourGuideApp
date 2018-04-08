package com.example.android.tourguideapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {
    private ArrayList<Event> event;
    Context context;

    public EventAdapter(ArrayList<Event> mEvent, Context mContext) {
        super(mContext, R.layout.list_item, mEvent);
        this.event = mEvent;
        this.context = mContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Event currentEvent = getItem(position);

        //get image
        ImageView eventImage = listItemView.findViewById(R.id.image);
        eventImage.setImageResource(currentEvent.getImage());

        //get name
        TextView eventName = listItemView.findViewById(R.id.name);
        eventName.setText(currentEvent.getName());

        //get location
        TextView eventLocation = listItemView.findViewById(R.id.location);
        eventLocation.setText(currentEvent.getLocation());

        return listItemView;
    }
}
