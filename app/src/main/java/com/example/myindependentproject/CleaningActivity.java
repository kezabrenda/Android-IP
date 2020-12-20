package com.example.myindependentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CleaningActivity extends AppCompatActivity {
    private TextView mLocationTextView;
    private String[] restaurants = new String[] {"Shalom Dry cleaner", "Simply Clean",
            "Crystal Clean", "Squicky Clear", "Le Neat", "Clean Car",
            "PROPRE", "Miss Cleanliness", "Freshies"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the cleaning places near: " + location);
    }
}