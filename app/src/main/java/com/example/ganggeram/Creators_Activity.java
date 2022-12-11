package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Creators_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creators);

        ImageView ImageView= findViewById(R.id.image_arrow_back);
        ImageView.setOnClickListener(v->{

            startActivity(new Intent(Creators_Activity.this,LoginActivity.class));
        });
    }
}