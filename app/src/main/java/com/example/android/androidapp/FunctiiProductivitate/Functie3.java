package com.example.android.androidapp.FunctiiProductivitate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.androidapp.R;

public class Functie3 extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    public void onBackPressed() {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.prod_function3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
