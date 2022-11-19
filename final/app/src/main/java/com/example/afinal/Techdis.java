package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Techdis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techdis);

        Bundle a = getIntent().getExtras();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView b = findViewById(R.id.dislocation2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView c = findViewById(R.id.disname2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView d = findViewById(R.id.dispecial2);
        Tech1 taxi = (Tech1) a.getSerializable("hamad");
        b.setText(taxi.getTechlocation());
        c.setText(taxi.getTechname());
        d.setText(taxi.getTechspecial());
    }
}