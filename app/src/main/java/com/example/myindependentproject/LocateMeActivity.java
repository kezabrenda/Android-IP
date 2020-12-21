package com.example.myindependentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocateMeActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.cleaningPlacesButton) private Button mCleaningPlacesButton;
    @BindView(R.id.mobileAgentButton) private Button mMobileAgentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_me);
        ButterKnife.bind(this);

        mCleaningPlacesButton.setOnClickListener(this);
        mMobileAgentButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == mCleaningPlacesButton) {
            Intent intent = new Intent(LocateMeActivity.this, CleaningActivity.class);
            String location = intent.getStringExtra("location");
            startActivity(intent);
        }
    }
}