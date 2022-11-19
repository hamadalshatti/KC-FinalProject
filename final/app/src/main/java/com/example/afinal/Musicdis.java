package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Musicdis extends AppCompatActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_musicdis);
                Bundle a = getIntent().getExtras();
              @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView b = findViewById(R.id.dislocation2);
               @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView c = findViewById(R.id.disname2);
                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView d = findViewById(R.id.dispecial2);


                Music1 taxi = (Music1) a.getSerializable("hamad");
                b.setText(taxi.getMusiclocation());
                c.setText(taxi.getMusicname());
                d.setText(taxi.getMusicspecial());
            }
         }