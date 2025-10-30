package com.example.myapplicationduran;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Numeros extends AppCompatActivity {
    private MediaPlayer au_zero,au_one,au_two,au_three,au_four,au_five,au_six,au_seven,au_eight,au_nine,au_ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        au_zero=MediaPlayer.create(Numeros.this,R.raw.zero);
        au_one=MediaPlayer.create(Numeros.this,R.raw.one);
        au_two=MediaPlayer.create(Numeros.this,R.raw.two);
        au_three=MediaPlayer.create(Numeros.this,R.raw.three);
        au_four=MediaPlayer.create(Numeros.this,R.raw.four);
        au_five=MediaPlayer.create(Numeros.this,R.raw.five);
        au_six=MediaPlayer.create(Numeros.this,R.raw.six);
        au_seven=MediaPlayer.create(Numeros.this,R.raw.seven);
        au_eight=MediaPlayer.create(Numeros.this,R.raw.eight);
        au_nine=MediaPlayer.create(Numeros.this,R.raw.nine);
        au_ten=MediaPlayer.create(Numeros.this,R.raw.ten);
    }
    public void au_zero (View View){
        au_zero.start();
    }
    public void au_one (View View){
        au_one.start();
    }
    public void au_two (View View){
        au_two.start();
    }
    public void au_three (View View){
        au_three.start();
    }
    public void au_four (View View){
        au_four.start();
    }
    public void au_five (View View){
        au_five.start();
    }
    public void au_six (View View){
        au_six.start();
    }
    public void au_seven (View View){
        au_seven.start();
    }
    public void au_eight (View View){
        au_eight.start();
    }
    public void au_nine (View View){
        au_nine.start();
    }
    public void au_ten (View View){
        au_ten.start();
    }
}