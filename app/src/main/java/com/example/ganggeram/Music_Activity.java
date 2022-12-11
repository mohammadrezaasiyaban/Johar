package com.example.ganggeram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Music_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        VideoView videoView =findViewById(R.id.video_view);
        Uri uri=Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.vido);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });


        ImageView imageView=findViewById(R.id.back_story_1_a);
        imageView.setOnClickListener(view -> {
            startActivity(new Intent(Music_Activity.this,LoginActivity.class));
        });



        Button button1=findViewById(R.id.Ravaq);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://redcircle.com/shows/ravaq"));
                startActivity(browserIntent);

            }
        });


        Button button2=findViewById(R.id.Ravcast);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ravcast.podbean.com/"));
                startActivity(browserIntent);

            }
        });

        Button button3=findViewById(R.id.three_points);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://anchor.fm/dena-farhang"));
                startActivity(browserIntent);

            }
        });

        Button button4=findViewById(R.id.rosva);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rosvapodcast.podbean.com/"));
                startActivity(browserIntent);

            }
        });
        Button button5=findViewById(R.id.sekke);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sekkepodcast.ir/"));
                startActivity(browserIntent);

            }
        });
        Button button6=findViewById(R.id.channelb);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://channelbpodcast.com/"));
                startActivity(browserIntent);

            }
        });
        Button button7=findViewById(R.id.hellitalk);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hellitalk.podbean.com/"));
                startActivity(browserIntent);

            }
        });

        Button button8=findViewById(R.id.Sokoote_barreha);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sokootebarrehapodcast.podbean.com/"));
                startActivity(browserIntent);

            }
        });
    }


}