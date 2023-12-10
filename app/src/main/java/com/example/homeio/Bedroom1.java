package com.example.homeio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bedroom1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedroom);

        FloatingActionButton b1_backbtn = findViewById(R.id.bed1_backbtn);
        b1_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k_back= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(k_back);
                finish();
            }
        });
    }


}