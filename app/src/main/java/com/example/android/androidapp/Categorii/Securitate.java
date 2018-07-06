package com.example.android.androidapp.Categorii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.androidapp.FunctiiSecuritate.Functie1;
import com.example.android.androidapp.FunctiiSecuritate.Functie2;
import com.example.android.androidapp.R;

public class Securitate extends AppCompatActivity {
    private ImageView imgview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.securitate);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgview = findViewById(R.id.securit_function1);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurit_function1();
            }
        });

        imgview = findViewById(R.id.securit_function2);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecurit_function2();
            }
        });
    }

    public void openSecurit_function1(){
        Intent intent = new Intent(this, Functie1.class);
        startActivity(intent);
    }

    public void openSecurit_function2(){
        Intent intent = new Intent(this, Functie2.class);
        startActivity(intent);
    }
}
