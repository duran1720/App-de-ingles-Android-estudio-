package com.example.myapplicationduran.controller;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationduran.R;
import com.example.myapplicationduran.model.ConexionBd;

public class datosUser extends AppCompatActivity {
    ConexionBd conexionBd;
    SQLiteDatabase db;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_datos_user);
        conexionBd= new ConexionBd(datosUser.this);
        db= conexionBd.getWritableDatabase();
        Toast.makeText(this, "Base de datos creada", Toast.LENGTH_SHORT).show();



    }
    public void irdatosmenu(View View){
        Intent siguiente = new Intent(datosUser.this, menu_app.class);
        startActivity(siguiente);
    }
}