package com.example.myapplicationduran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menu_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);

    }
    public void irmenuaprender (View View){
        Intent aprender = new Intent(menu_app.this,MenuAprender.class);
        startActivity(aprender);
    }
    public void irmenujugar (View View){
        Intent jugar = new Intent(menu_app.this,preguntaAnimales.class);
        startActivity(jugar);
    }
}