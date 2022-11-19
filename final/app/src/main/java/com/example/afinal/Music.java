package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Music extends AppCompatActivity {
    ArrayList<Music1> musics= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
     //(String musicname, String musicspecial, int musicimage)
        Music1 m4=new Music1("امسية طربية.","مع المحبوب النجم ماجد المهندس.",R.drawable.almohandes,"Arena,360 mall");
        Music1 m1=new Music1("ليلة تذكر الزمن الحميل.","بإستخدام تقنية الهولوغرام نقدم لكم اجمل ماقدمه ابو بكر سالم.",R.drawable.abo_bakar,"ارض المعارض،قاعة 4");
        Music1 m2=new Music1("للطرب عنوان.","امسيه جميلة مع عبدالمجيد عبدالله.",R.drawable.majed,"مركز جابر الاحمد الثقافي");
        Music1 m3=new Music1("طربيات","استمع لأجمل اغاني الفنان راشد الماجد",R.drawable.rashed,"حديقة الشهيد");
        Music1 k=new Music1("","",R.drawable.rashed,"");
        //Music1 m4=new Music1("امسية طربية.","مع المحبوب النجم ماجد المهندس.",R.drawable.almohandes);

        musics.add(m4);
        musics.add(m1);
      musics.add(m2);
      musics.add(m3);
      musics.add(k);
      //musics.add(m4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView musiclist= findViewById(R.id.musiclist);

        MusicAdapter musicAdapter= new MusicAdapter(this,0,musics);


        musiclist.setAdapter(musicAdapter);



             musiclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
                 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                     Music1 currentitem= musics.get(position);

                     Intent in2 = new Intent(Music.this ,Musicdis.class);
                     in2.putExtra("hamad",currentitem);
                     startActivity(in2);

                 }
             });





            }
}