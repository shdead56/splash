package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    VideoView vw;
    public static final long SPLASH_SCREEN_DELAY=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vw=findViewById(R.id.);
        TimerTask time= new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent().setClass(MainActivity.this,ssplash.class);
            startActivity(intent);
            finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}























