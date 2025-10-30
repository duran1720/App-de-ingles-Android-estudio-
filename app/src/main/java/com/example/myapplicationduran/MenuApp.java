package com.example.myapplicationduran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);
    }

    public static class Colores extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_colores);

        }
    }
    public void iranimales(View View){
        Intent animales= new Intent(MenuApp.this,Animales.class);
        startActivity(animales);
    }
    public void ircolores(View View){
        Intent colores= new Intent(MenuApp.this,Coloress.class);
        startActivity(colores);
    }
    public void irfrutas(View View){
        Intent frutas= new Intent(MenuApp.this,Frutas.class);
        startActivity(frutas);
    }
    public void irnumeros(View View){
        Intent numeros= new Intent(MenuApp.this,Numeros.class);
        startActivity(numeros);
    }
}