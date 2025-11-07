package com.example.myapplicationduran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuAprender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_aprender);
    }


    public static class Colores extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_colores);

        }
    }
    public void iranimales(View View){
        Intent animales= new Intent(MenuAprender.this,Animales.class);
        startActivity(animales);
    }
    public void ircolores(View View){
        Intent colores= new Intent(MenuAprender.this,Coloress.class);
        startActivity(colores);
    }
    public void irfrutas(View View){
        Intent frutas= new Intent(MenuAprender.this,Frutas.class);
        startActivity(frutas);
    }
    public void irnumeros(View View){
        Intent numeros= new Intent(MenuAprender.this,Numeros.class);
        startActivity(numeros);
    }
}