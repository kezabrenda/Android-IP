package com.example.myindependentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.findPlacesButton) private Button mFindPlacesButton;
    @BindView(R.id.placeLocationEditText) private EditText mPlaceLocationEditText;
    @BindView(R.id.appNameTextView) private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

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