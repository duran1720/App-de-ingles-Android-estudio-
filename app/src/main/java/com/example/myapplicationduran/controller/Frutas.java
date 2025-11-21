package com.example.myapplicationduran.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class Frutas extends AppCompatActivity {
    private MediaPlayer au_apple,au_watermelon,au_grape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
        au_apple=MediaPlayer.create(Frutas.this,R.raw.apple);
        au_watermelon=MediaPlayer.create(Frutas.this,R.raw.watermelon);
        au_grape=MediaPlayer.create(Frutas.this,R.raw.grape);


    }
    public void au_apple (View View){
        au_apple.start();
    }
    public void au_watermelon (View View){
        au_watermelon.start();
    }
    public void au_grape (View View){
        au_grape.start();
    }
}