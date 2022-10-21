package com.example.trenazerfragmenty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detail_frag);
        frag.setWorkoutId(1);
        //TODO zamienić id na wartość z listy treningów
    }
}