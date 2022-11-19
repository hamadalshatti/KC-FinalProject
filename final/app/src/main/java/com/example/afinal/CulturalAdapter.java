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

public class CulturalAdapter extends ArrayAdapter<Cultural1> {

    List<Cultural1> cultural1List;

    public CulturalAdapter(@NonNull Context context, int resource, @NonNull List<Cultural1> objects) {
        super(context, resource, objects);
        cultural1List = objects;}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_row, parent, false);
        Cultural1 currentcult = cultural1List.get(position);
        TextView eventname = v2.findViewById(R.id.eventname);
        TextView eventspecial = v2.findViewById(R.id.eventspeials);
        ImageView eventimage = v2.findViewById(R.id.eventimage);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView eventlocation = v2.findViewById(R.id.eventlocation);
        eventname.setText(currentcult.getCulturalname());
        eventspecial.setText(currentcult.getCulturalspecial());
        eventimage.setImageResource(currentcult.getCulturalimage());
        eventlocation.setText(currentcult.getCulturallocitaion());


        return v2;

    }

}
