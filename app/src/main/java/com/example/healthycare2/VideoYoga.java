package com.example.healthycare2;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoYoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_yoga);
        VideoView video = (VideoView) findViewById(R.id.video_yoga);
        MediaController media = new MediaController(this);
        Uri lokasivideo = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.yoga);
        video.setVideoURI(lokasivideo);
        video.setMediaController(media);
        video.start();
        video.requestFocus();
    }
}