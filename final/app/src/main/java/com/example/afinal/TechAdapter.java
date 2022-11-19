package com.example.afinal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TechAdapter extends ArrayAdapter<Tech1> {

    List<Tech1> teclist2;

    public TechAdapter(@NonNull Context context, int resource, @NonNull List<Tech1> objects) {
        super(context, resource, objects);
        teclist2 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_row, parent, false);
        Tech1 currentmusic = teclist2.get(position);
        TextView eventname = v2.findViewById(R.id.eventname);
        TextView eventspecial = v2.findViewById(R.id.eventspeials);
        ImageView eventimage = v2.findViewById(R.id.eventimage);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView eventlocation = v2.findViewById(R.id.eventlocation);
        eventname.setText(currentmusic.getTechname());
        eventspecial.setText(currentmusic.getTechspecial());
        eventimage.setImageResource(currentmusic.getTechimage());
        eventlocation.setText(currentmusic.getTechlocation());


     return v2;

    }
}

