package com.example.homeio;

import static android.content.ContentValues.TAG;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.text.DecimalFormat;
import java.util.AbstractCollection;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {
    String userName ;
    OkHttpClient httpclient = new OkHttpClient();
    String url1="";
    Request request = new okhttp3.Request.Builder().url(url1).build();
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = "John";

        //Greeting message
        TextView greet = findViewById(R.id.greet);
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            greet.setText("Good Morning, "+userName+"!");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            greet.setText("Good Afternoon, "+userName+"!");
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            greet.setText("Good Evening, "+userName+"!");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greet.setText("Good Night, "+userName+"!");
        }


        Button kitchen = findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k_int = new Intent(getApplicationContext(), Kitchen.class);
                startActivity(k_int);
                finish();
            }
        });

        Button bedroom1 = findViewById(R.id.bdroom1);
        bedroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bed1_int = new Intent(getApplicationContext(), Bedroom1.class);
                startActivity(bed1_int);
                finish();
            }
        });

        Button bedroom2 = findViewById(R.id.bdroom2);

    }
}