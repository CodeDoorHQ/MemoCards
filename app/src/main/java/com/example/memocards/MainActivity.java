package com.example.memocards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button play;
    private Button achievments;

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

        achievments = findViewById(R.id.achievements);
        achievments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Achievements.class);
                startActivity(intent);
            }
        });


    }

    public void playPage() {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }
}