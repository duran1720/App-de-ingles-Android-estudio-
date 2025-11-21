package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class preguntaAnimales extends AppCompatActivity {

    private MediaPlayer au_preguntaAnimales, audioCorrecto, audioError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_animales);

        au_preguntaAnimales = MediaPlayer.create(this, R.raw.zebra);

        audioCorrecto = MediaPlayer.create(this, R.raw.correct);
        audioError = MediaPlayer.create(this, R.raw.error);

        au_preguntaAnimales.start();

        findViewById(R.id.btnPreguntacebra).setOnClickListener(v -> {
            audioCorrecto.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();

            audioCorrecto.setOnCompletionListener(mp -> {
                Intent i = new Intent(preguntaAnimales.this, preguntas_frutas.class);
                startActivity(i);
                finish();
            });
        });

        View.OnClickListener incorrecto = v -> {
            audioError.start();
            Toast.makeText(this, "Incorrect animal!", Toast.LENGTH_SHORT).show();
        };

        findViewById(R.id.btnPreguntaleon).setOnClickListener(incorrecto);
        findViewById(R.id.btnPreguntaelefante).setOnClickListener(incorrecto);
    }

    public void aupreguntaAnimales(View view) {
        au_preguntaAnimales.start();
    }
}
