package com.example.android.androidapp.Categorii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.androidapp.FunctiiProductivitate.Functie1;
import com.example.android.androidapp.R;

public class Productivitate extends AppCompatActivity {
    private ImageView imgview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productivitate);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgview = findViewById(R.id.function1);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFunction1();
            }
        });

        imgview = findViewById(R.id.function2);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFunction2();
            }
        });

        imgview = findViewById(R.id.function3);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFunction3();
            }
        });
    }

    public void openFunction1(){
        Intent intent = new Intent(this, Functie1.class);
        startActivity(intent);
    }

    public void openFunction2(){
        Intent intent = new Intent(this, Functie1.class);
        startActivity(intent);
    }

    public void openFunction3(){
        Intent intent = new Intent(this, Functie1.class);
        startActivity(intent);
    }
}
