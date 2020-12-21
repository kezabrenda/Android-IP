package com.example.myindependentproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

public class CleaningOtherDialogFragment extends AppCompatActivity {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_cleaning_other, container, false);
        getDialog().setTitle("Simple Dialog");
        return rootView;
    }
}
