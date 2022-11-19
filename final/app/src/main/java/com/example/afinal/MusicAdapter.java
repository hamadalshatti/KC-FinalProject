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

public class MusicAdapter extends ArrayAdapter<Music1> {
    List<Music1> music1List2;

    public MusicAdapter (@NonNull Context context, int resource, @NonNull List<Music1> objects) {
        super(context, resource, objects);
        music1List2 = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_row, parent, false);
        Music1 currentmusic = music1List2.get(position);
        TextView eventname = v.findViewById(R.id.eventname);
        TextView eventspecial = v.findViewById(R.id.eventspeials);
        ImageView eventimage = v.findViewById(R.id.eventimage);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView eventlocation=v.findViewById(R.id.eventlocation);

        eventname.setText(currentmusic.getMusicname());
        eventspecial.setText(currentmusic.getMusicspecial());
        eventimage.setImageResource(currentmusic.getMusicimage());
        eventlocation.setText(currentmusic.getMusiclocation());
        return v;
    }
}