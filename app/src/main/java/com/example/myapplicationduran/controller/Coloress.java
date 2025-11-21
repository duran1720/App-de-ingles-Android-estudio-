package com.example.myapplicationduran.controller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class Coloress extends AppCompatActivity {

    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_colores);



    }

    public void aublue (View view){
        sonido = MediaPlayer.create(Coloress.this,R.raw.blue);
        sonido.start();
    }
    public void aured (View view){
        sonido = MediaPlayer.create(Coloress.this,R.raw.red);
        sonido.start();
    }
    public void auyellow (View view){
        sonido = MediaPlayer.create(Coloress.this,R.raw.yellow);
        sonido.start();
    }

}