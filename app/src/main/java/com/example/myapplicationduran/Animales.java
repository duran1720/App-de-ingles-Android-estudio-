package com.example.myapplicationduran;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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