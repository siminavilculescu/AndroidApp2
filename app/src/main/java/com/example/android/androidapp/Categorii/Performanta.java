package com.example.android.androidapp.Categorii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.androidapp.FunctiiPerformanta.Functie2.Functie2;
import com.example.android.androidapp.FunctiiPerformanta.Functie3;
import com.example.android.androidapp.FunctiiPerformanta.Functie1.MainActivity;
import com.example.android.androidapp.R;

public class Performanta extends AppCompatActivity {
    private ImageView imgview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.performanta);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgview = findViewById(R.id.perform_function1);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerform_function1();
            }
        });

        imgview = findViewById(R.id.perform_function2);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerform_function2();
            }
        });

        imgview = findViewById(R.id.perform_function3);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerform_function3();
            }
        });
    }

    public void openPerform_function1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPerform_function2(){
        Intent intent = new Intent(this, Functie2.class);
        startActivity(intent);
    }

    public void openPerform_function3(){
        Intent intent = new Intent(this, Functie3.class);
        startActivity(intent);
    }
}
