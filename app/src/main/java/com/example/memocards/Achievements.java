package com.example.memocards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Achievements extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        this.backButton = this.findViewById(R.id.back_button);

        // When user click "Back" button.
        this.backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Back to main Activity.
                Intent intent = new Intent (Achievements.this, MainActivity.class );
                startActivity(intent);
            }
        });
    }
}