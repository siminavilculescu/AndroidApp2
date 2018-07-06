package com.example.android.androidapp.Categorii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.androidapp.FunctiiEntertainment.Functie1;
import com.example.android.androidapp.FunctiiEntertainment.Functie2;
import com.example.android.androidapp.FunctiiEntertainment.Functie3;
import com.example.android.androidapp.FunctiiEntertainment.Functie4;
import com.example.android.androidapp.FunctiiEntertainment.Functie5;

import com.example.android.androidapp.R;

public class Entertainment extends AppCompatActivity {
    private ImageView imgview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertainment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgview = findViewById(R.id.entertain_function1);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertain_function1();
            }
        });

        imgview = findViewById(R.id.entertain_function2);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertain_function2();
            }
        });

        imgview = findViewById(R.id.entertain_function3);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertain_function3();
            }
        });

        imgview = findViewById(R.id.entertain_function4);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertain_function4();
            }
        });

        imgview = findViewById(R.id.entertain_function5);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertain_function5();
            }
        });
    }

    public void openEntertain_function1(){
        Intent intent = new Intent(this, Functie1.class);
        startActivity(intent);
    }

    public void openEntertain_function2(){
        Intent intent = new Intent(this, Functie2.class);
        startActivity(intent);
    }

    public void openEntertain_function3(){
        Intent intent = new Intent(this, Functie3.class);
        startActivity(intent);
    }

    public void openEntertain_function4(){
        Intent intent = new Intent(this, Functie4.class);
        startActivity(intent);
    }

    public void openEntertain_function5(){
        Intent intent = new Intent(this, Functie5.class);
        startActivity(intent);
    }
}
