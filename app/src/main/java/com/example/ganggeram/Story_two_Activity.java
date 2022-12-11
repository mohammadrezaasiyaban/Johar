package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class Story_two_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_two);


        ImageView ImageView1= findViewById(R.id.back_story_2_b);
        ImageView1.setOnClickListener(v->{

            startActivity(new Intent(Story_two_Activity.this,List_stori_Activity.class));
        });



    }



}