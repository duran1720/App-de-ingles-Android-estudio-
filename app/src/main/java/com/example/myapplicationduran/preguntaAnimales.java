package com.example.myapplicationduran;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class preguntaAnimales extends AppCompatActivity {

    private MediaPlayer au_preguntaAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_pregunta_animales);
        au_preguntaAnimales=MediaPlayer.create(preguntaAnimales.this,R.raw.zebra);



    }
    public void aupreguntaAnimales (View View){
        au_preguntaAnimales.start();
    }

}