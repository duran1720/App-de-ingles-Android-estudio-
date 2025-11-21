package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class preguntas_numeros2 extends AppCompatActivity {

    private MediaPlayer mpPregunta, mpCorrect, mpError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_numeros2);

        mpPregunta = MediaPlayer.create(this, R.raw.five);
        mpCorrect = MediaPlayer.create(this, R.raw.correct);
        mpError = MediaPlayer.create(this, R.raw.error);

        mpPregunta.start();

        findViewById(R.id.btnNum5).setOnClickListener(v -> {
            mpCorrect.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();

            mpCorrect.setOnCompletionListener(mp -> {
                Intent i = new Intent(preguntas_numeros2.this, pregunta_numeros3.class);
                startActivity(i);
                finish();
            });
        });

        View.OnClickListener incorrecto = view -> {
            mpError.start();
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        };
        findViewById(R.id.btnNum4).setOnClickListener(incorrecto);
        findViewById(R.id.btnNum6).setOnClickListener(incorrecto);
    }

    public void auPreguntaNumeros2(View view) {
        if (mpPregunta != null) mpPregunta.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mpPregunta != null) mpPregunta.release();
        if (mpCorrect != null) mpCorrect.release();
        if (mpError != null) mpError.release();
    }
}
