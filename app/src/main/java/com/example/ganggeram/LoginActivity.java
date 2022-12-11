package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView imageView= findViewById(R.id.button_login);
        imageView.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,List_stori_Activity.class));

        });



        ImageView imageView1= findViewById(R.id.button_login_setinge);
        imageView1.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,Creators_Activity.class));


        });

        ImageView imageView2= findViewById(R.id.book_story2);
        imageView2.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,Storys_book_Activity.class));

        });

        ImageView imageView3= findViewById(R.id.musics_image);
        imageView3.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,Music_Activity.class));

        });

        ImageView button=findViewById(R.id.gmalime);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1WxvuQ9jmu-HNdCViBZfkTFArSEub_RHNBlIJ2yweFe0/edit?usp=drivesdk"));
                startActivity(browserIntent);

            }
        });
    }
}