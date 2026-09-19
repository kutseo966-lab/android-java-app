package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStatus;
    private TextView textViewTime;
    private Button buttonClick;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textViewStatus = findViewById(R.id.textViewStatus);
        textViewTime = findViewById(R.id.textViewTime);
        buttonClick = findViewById(R.id.buttonClick);

        // Set initial time
        updateTime();

        // Button click listener
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                String message = "Clicked " + clickCount + " times!";
                textViewStatus.setText(message);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                updateTime();
            }
        });
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String currentTime = sdf.format(new Date());
        textViewTime.setText("Last update: " + currentTime);
    }
}
