package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class gameComplet extends AppCompatActivity {
    private MediaPlayer completeau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_complet);
        completeau = MediaPlayer.create(this, R.raw.complete);

        completeau.start();

    }
    public void irmenu(View View){
        Intent siguiente = new Intent(gameComplet.this, menu_app.class);
        startActivity(siguiente);
    }
    public void irHome(View View){
        Intent siguiente = new Intent(gameComplet.this, MainActivity.class);
        startActivity(siguiente);
    }
}