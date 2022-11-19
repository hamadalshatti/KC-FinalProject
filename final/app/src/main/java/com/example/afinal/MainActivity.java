package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout musiclayout=findViewById(R.id.musiclayout);
        musiclayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,Music.class);
                startActivity(in1);

            }
        });
        RelativeLayout techlayout=findViewById(R.id.techlayout);
        techlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,tech.class);
                startActivity(in2);

            }
        });
        RelativeLayout culturallayout=findViewById(R.id.culturallayout);
        culturallayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(MainActivity.this,cultural.class);
                startActivity(in3);
            }
        });
        RelativeLayout sports=findViewById(R.id.sportslayout);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(MainActivity.this,sportsoon.class);
                startActivity(in4);

            }
        });
    }
}