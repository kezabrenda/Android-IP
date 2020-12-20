package com.example.myindependentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mFindPlacesButton;
    private EditText mPlaceLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlaceLocationEditText = (EditText) findViewById(R.id.placeLocationEditText);
        mFindPlacesButton = (Button)findViewById(R.id.findPlacesButton);
        mFindPlacesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mPlaceLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, LocateMeActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}