package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class tech extends AppCompatActivity {
    ArrayList<Tech1>techs=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        Tech1 a1=new Tech1("الكويت تبرمج","تعليم البرمجة لطلبة الثانوية والصف التاسع",R.drawable.img_1,"جامعة الكويت، الشدادية، المبنى الشمالي");
        Tech1 a2=new Tech1("unicode","تعليم البرمجة لطلبة الجامعة وحديثي التخرج",R.drawable.unicode,"جامعة الكويت، الشدادية، المبنى الشمالي");
        Tech1 a3=new Tech1("coded juniors ","تعليم البرمجة للأطفال بين 11-14 سنة لنشأة جيل مبرمج",R.drawable.img_2,"قريباً..");
       // Tech1 q=new Tech1("","",R.drawable.img,"");
        techs.add(a1);
        techs.add(a2);
        techs.add(a3);
        //techs.add(q);

        ListView techlist=findViewById(R.id.techlist);
        TechAdapter techAdapter= new TechAdapter(this,0,techs);
        techlist.setAdapter(techAdapter);

        techlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tech1  currentitem= techs.get(position);

                Intent in2 = new Intent(tech.this ,Techdis.class);
                in2.putExtra("hamad",currentitem);
                startActivity(in2);
            }
        });



    }
}