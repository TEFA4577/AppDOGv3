package com.example.appdogv3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appdogv3.utilidades.Utilidades;

//se hace la coneccion
public class ConectionSQLiteHelper extends SQLiteOpenHelper{


    public ConectionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase AppDog) {
        //genera las tablas
        AppDog.execSQL(Utilidades.TABLE_MASCOTA);
    }

    @Override //Verficacion antigua de la base de datos
    public void onUpgrade(SQLiteDatabase AppDog, int oldVersion, int newVersion) {

        AppDog.execSQL("DROP TABLE IF EXISTS MASCOTA");
        onCreate(AppDog);

    }
}
