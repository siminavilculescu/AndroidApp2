package com.example.android.androidapp.FunctiiEntertainment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.androidapp.R;

public class Functie1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertain_functie1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
