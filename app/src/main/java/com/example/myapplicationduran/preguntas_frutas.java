package com.example.myapplicationduran;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class preguntas_frutas extends AppCompatActivity {
    private MediaPlayer au_preguntafrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_preguntas_frutas);
        au_preguntafrutas = MediaPlayer.create(preguntas_frutas.this,R.raw.grape);

    }
    public void aupreguntaFrutas (View View){
        au_preguntafrutas.start();
    }
}