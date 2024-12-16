package com.example.schoolapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        // Initialize the ImageView
        imageView = findViewById(R.id.imageView);

        // Set the ImageView visibility (optional, as it's visible by default)
        imageView.setVisibility(ImageView.VISIBLE);

        // Create an Intent to start MainActivity
        Intent iHome = new Intent(SplashActivity.this, MainActivity.class);

        // Use Handler to delay the transition to MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish(); // Finish SplashActivity so it's removed from the back stack
            }
        }, 3000); // Delay in milliseconds (3000ms = 3 seconds)
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Optional: Clean up any resources if needed
    }
}
