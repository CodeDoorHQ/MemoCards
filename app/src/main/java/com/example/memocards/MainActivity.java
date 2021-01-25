package com.example.memocards;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play =(Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPage();
            }
        });


    }

    public void playPage() {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }

    public void launchAchievements(View view) {
        Log.d(LOG_TAG, "Achievement Button Clicked!");
        Intent intent = new Intent(this, Achievements.class);
        startActivity(intent);
    }
}