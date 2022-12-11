package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Story_eight_tow_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_eight_tow);
        ImageView imageView = findViewById(R.id.back_story_1_a);
        imageView.setOnClickListener(view -> {
            startActivity(new Intent(Story_eight_tow_Activity.this,Storys_book_Activity.class));
        });
    }
}