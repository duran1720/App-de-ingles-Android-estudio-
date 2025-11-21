package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class preguntas_colores extends AppCompatActivity {

    private MediaPlayer au_preguntaColores, audioCorrecto, audioError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_colores);

        au_preguntaColores = MediaPlayer.create(this, R.raw.red);

        audioCorrecto = MediaPlayer.create(this, R.raw.correct);
        audioError = MediaPlayer.create(this, R.raw.error);

        au_preguntaColores.start();

        findViewById(R.id.btnPreguntarojo).setOnClickListener(v -> {
            audioCorrecto.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();

            audioCorrecto.setOnCompletionListener(mp -> {
                Intent i = new Intent(preguntas_colores.this, preguntas_numeros1.class);
                startActivity(i);
                finish();
            });
        });

        View.OnClickListener incorrecto = v -> {
            audioError.start();
            Toast.makeText(this, "Incorrect color!", Toast.LENGTH_SHORT).show();
        };

        findViewById(R.id.btnPreguntaamarillo).setOnClickListener(incorrecto);
        findViewById(R.id.btnPreguntaazul).setOnClickListener(incorrecto);
    }

    public void aupreguntaAnimales(View view) {
        au_preguntaColores.start();
    }
}
