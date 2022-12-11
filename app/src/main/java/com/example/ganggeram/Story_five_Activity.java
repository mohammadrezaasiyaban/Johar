package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Story_five_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_five);

        ImageView ImageView1= findViewById(R.id.back_story_1_a);
        ImageView1.setOnClickListener(v->{

            startActivity(new Intent(Story_five_Activity.this,List_stori_Activity.class));
        });

    }
}