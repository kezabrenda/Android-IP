package com.example.myindependentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class LocateMeActivity extends AppCompatActivity {
    @BindView(R.id.findPlacesButton) private Button mCleaningPlacesButton;
    @BindView(R.id.findPlacesButton) private Button mMobileAgentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_me);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
    }
}