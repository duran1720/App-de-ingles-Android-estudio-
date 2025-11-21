package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;

public class preguntas_numeros1 extends AppCompatActivity {

    private MediaPlayer mpPregunta, mpCorrect, mpError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_numeros1);

        mpPregunta = MediaPlayer.create(this, R.raw.two);
        mpCorrect = MediaPlayer.create(this, R.raw.correct);
        mpError = MediaPlayer.create(this, R.raw.error);

        mpPregunta.start();

        findViewById(R.id.btnNum2).setOnClickListener(v -> {
            mpCorrect.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();

            mpCorrect.setOnCompletionListener(mp -> {
                Intent i = new Intent(preguntas_numeros1.this, preguntas_numeros2.class);
                startActivity(i);
                finish();
            });
        });

        View.OnClickListener incorrecto = view -> {
            mpError.start();
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        };
        findViewById(R.id.btnNum1).setOnClickListener(incorrecto);
        findViewById(R.id.btnNum3).setOnClickListener(incorrecto);
    }

    public void auPreguntaNumeros1(View view) {
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
