package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class preguntas_frutas extends AppCompatActivity {

    private MediaPlayer au_preguntafrutas, audioCorrecto, audioError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_frutas);

        au_preguntafrutas = MediaPlayer.create(this, R.raw.grape);

        audioCorrecto = MediaPlayer.create(this, R.raw.correct);
        audioError = MediaPlayer.create(this, R.raw.error);

        au_preguntafrutas.start();

        findViewById(R.id.btnPreguntacebra).setOnClickListener(v -> {
            audioCorrecto.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();

            audioCorrecto.setOnCompletionListener(mp -> {
                Intent i = new Intent(preguntas_frutas.this, preguntas_colores.class);
                startActivity(i);
                finish();
            });
        });

        View.OnClickListener incorrecto = v -> {
            audioError.start();
            Toast.makeText(this, "Incorrect fruit!", Toast.LENGTH_SHORT).show();
        };

        findViewById(R.id.btnPreguntaleon).setOnClickListener(incorrecto);
        findViewById(R.id.btnPreguntaelefante).setOnClickListener(incorrecto);
    }

    public void aupreguntaFrutas(View view) {
        au_preguntafrutas.start();
    }
}
