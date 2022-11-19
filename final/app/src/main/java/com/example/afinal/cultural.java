package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class cultural extends AppCompatActivity {
     ArrayList<Cultural1>cultural1s=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);
        Cultural1 w1=new Cultural1("مركز الشيخ جابر الاحمد الثقافي","والمعروف بدار الاوبرا ويعتبر من رموز الدولة",R.drawable.aljaber,"شارع الخليج العربي ، مدينة الكويت");
        Cultural1 w2=new Cultural1("مركز الشيخ عبدالله السالم الثقافي"," هو أحد أكبر معالم التطور الثقافي من نوعه حول العالم. يضم المركز عدة متاحف ومنشآت",R.drawable.alsalem,"شارع بغداد،السالمية");
        Cultural1 w3=new Cultural1("مكتبة البابطين المركزية للشعر العربي","هي أول مكتبة في العالم تختص بالشعر العربي. ",R.drawable.babten,"مدينة الكويت");
        Cultural1 w4=new Cultural1("متحف طارق رجب للخط الاسلامي","يضم المتحف مجموعات نادرة من المصاحف ومخطوطات عربية وفخاريات إسلامية وادوات موسيقية واثاث عربي إسلامي قديم",R.drawable.tareq,"شارع1،الجابرية");
        cultural1s.add(w1);
        cultural1s.add(w2);
        cultural1s.add(w3);
        cultural1s.add(w4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView cultural_list=findViewById(R.id.culturallist);
        CulturalAdapter culturalAdapter=new CulturalAdapter(this,0,cultural1s);
        cultural_list.setAdapter(culturalAdapter);


         cultural_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Cultural1 currentitem= cultural1s.get(position);

                 Intent in2 = new Intent(cultural.this ,Culturaldis.class);
                 in2.putExtra("hamad",currentitem);
                 startActivity(in2);
             }
         });



    }
}