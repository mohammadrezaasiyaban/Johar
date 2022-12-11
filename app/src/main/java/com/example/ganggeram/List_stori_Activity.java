package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class List_stori_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stori);

        AppCompatButton appCompatButton= findViewById(R.id.story_1a);
        appCompatButton.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story1_Activity.class));

        });


        ImageView ImageView1= findViewById(R.id.image_arrow_back_meno);
        ImageView1.setOnClickListener(v->{

            startActivity(new Intent(List_stori_Activity.this,LoginActivity.class));
        });

        AppCompatButton appCompatButton21= findViewById(R.id.story_2b);
        appCompatButton21.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_two_Activity.class));

        });

        AppCompatButton appCompatButton31= findViewById(R.id.story_3c);
        appCompatButton31.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_three_Activity.class));

        });

        AppCompatButton appCompatButton41= findViewById(R.id.story_4d);
        appCompatButton41.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_four_Activity.class));

        });

        AppCompatButton appCompatButton51= findViewById(R.id.story_5e);
        appCompatButton51.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_five_Activity.class));

        });


        AppCompatButton appCompatButton61= findViewById(R.id.story_6f);
        appCompatButton61.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_five_Activity.class));

        });

        AppCompatButton appCompatButton71= findViewById(R.id.story_7g);
        appCompatButton71.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_seven_Activity.class));

        });
        AppCompatButton appCompatButton81= findViewById(R.id.story_8h);
        appCompatButton81.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Sory_eight_Activity.class));

        });


        AppCompatButton appCompatButton91= findViewById(R.id.story_9i);
        appCompatButton91.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_nine_Activity.class));

        });

        AppCompatButton appCompatButton101= findViewById(R.id.story_10k);
        appCompatButton101.setOnClickListener(view -> {
            startActivity(new Intent(List_stori_Activity.this,Story_ten_Activity.class));

        });








    }
}