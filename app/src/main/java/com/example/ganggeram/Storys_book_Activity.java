package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Storys_book_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storys_book);

        AppCompatButton appCompatButton= findViewById(R.id.story_1a);
        appCompatButton.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story1_Activity.class));

        });



        ImageView ImageView1= findViewById(R.id.image_arrow_back_meno);
        ImageView1.setOnClickListener(v->{

            startActivity(new Intent(Storys_book_Activity.this,LoginActivity.class));
        });

        AppCompatButton appCompatButton21= findViewById(R.id.story_2b);
        appCompatButton21.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,story_tow_tow_Activity.class));

        });

        AppCompatButton appCompatButton31= findViewById(R.id.story_3c);
        appCompatButton31.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Sorys_three_tow_Activity.class));

        });

        AppCompatButton appCompatButton41= findViewById(R.id.story_4d);
        appCompatButton41.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_four_tow_Activity.class));

        });

        AppCompatButton appCompatButton51= findViewById(R.id.story_5e);
        appCompatButton51.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_five_tow_Activity.class));

        });
        AppCompatButton appCompatButton11= findViewById(R.id.story_1a);
        appCompatButton11.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,story_one_tow_Activity.class));

        });


        AppCompatButton appCompatButton61= findViewById(R.id.story_6f);
        appCompatButton61.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_six_tow_Activity.class));

        });

        AppCompatButton appCompatButton71= findViewById(R.id.story_7g);
        appCompatButton71.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_seven_tow_Activity.class));

        });
        AppCompatButton appCompatButton81= findViewById(R.id.story_8h);
        appCompatButton81.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_eight_tow_Activity.class));


        });


        AppCompatButton appCompatButton91= findViewById(R.id.story_9i);
        appCompatButton91.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_naine_tow_Activity.class));

        });

        AppCompatButton appCompatButton101= findViewById(R.id.story_10k);
        appCompatButton101.setOnClickListener(view -> {
            startActivity(new Intent(Storys_book_Activity.this,Story_ten_tow_Activity.class));

        });


    }
}