package com.example.homeio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Kitchen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        Button k_light1 = findViewById(R.id.k_light1);
        k_light1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k_light1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        FloatingActionButton k_backbtn = findViewById(R.id.kit_backbtn);
        k_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k_back= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(k_back);
                finish();
            }
        });
    }

}