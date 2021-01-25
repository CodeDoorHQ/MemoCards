package com.example.memocards;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Achievements extends AppCompatActivity {

    private static final String LOG_TAG =
            Achievements.class.getSimpleName();

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        // Find Button by its ID
        this.buttonBack =  this.findViewById(R.id.button_back);

        // When User click "Back" button
        this.buttonBack.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) { backToMain(); }

            public void backToMain() {
                Log.d(LOG_TAG, "Back Button Clicked!");
                Intent backToMain = new Intent(Achievements.this, MainActivity.class);
                startActivity(backToMain);
            }
        });


    }

}