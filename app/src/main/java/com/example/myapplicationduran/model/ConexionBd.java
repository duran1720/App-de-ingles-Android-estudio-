package com.example.myapplicationduran.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class ConexionBd extends SQLiteOpenHelper {


    public ConexionBd(@Nullable Context context) {
        super(context, Constantes.NAME_BD, null, Constantes.VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DATOS(NOMBRE TEXT, APODO TEXT, COLEGIO TEXT,EDAD INT, GENERO TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

