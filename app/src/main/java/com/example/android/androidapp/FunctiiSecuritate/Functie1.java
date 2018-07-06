package com.example.android.androidapp.FunctiiSecuritate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.androidapp.R;

public class Functie1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.securit_functie1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
