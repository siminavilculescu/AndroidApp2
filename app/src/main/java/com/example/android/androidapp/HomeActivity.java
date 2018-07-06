package com.example.android.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.androidapp.Categorii.Entertainment;
import com.example.android.androidapp.Categorii.Performanta;
import com.example.android.androidapp.Categorii.Productivitate;
import com.example.android.androidapp.Categorii.Securitate;

public class HomeActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = findViewById(R.id.productivitate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductivitate();
            }
        });

        button = findViewById(R.id.performanta);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerformanta();
            }
        });

        button = findViewById(R.id.securitate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecuritate();
            }
        });

        button = findViewById(R.id.enterteinment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertainment();
            }
        });

    }

    public void openProductivitate(){
        Intent intent = new Intent(this, Productivitate.class);
        startActivity(intent);
    }

    public void openPerformanta(){
        Intent intent = new Intent(this, Performanta.class);
        startActivity(intent);
    }

    public void openSecuritate(){
        Intent intent = new Intent(this, Securitate.class);
        startActivity(intent);
    }

    public void openEntertainment(){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }
}
