package com.example.myapplicationduran.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class Animales extends AppCompatActivity {
    private MediaPlayer au_lion,au_zebra,au_elefant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
        au_elefant=MediaPlayer.create(Animales.this,R.raw.elefant);
        au_lion=MediaPlayer.create(Animales.this,R.raw.lion);
        au_zebra=MediaPlayer.create(Animales.this,R.raw.zebra);
    }
    public void auelefant (View View){
        au_elefant.start();
    }
    public void aulion (View View){
        au_lion.start();
    }
    public void auzebra (View View){
        au_zebra.start();
    }
}