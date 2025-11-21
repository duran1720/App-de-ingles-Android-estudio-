package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void irdatos(View View){
    Intent siguiente = new Intent(MainActivity.this, datosUser.class);
    startActivity(siguiente);
    }

}