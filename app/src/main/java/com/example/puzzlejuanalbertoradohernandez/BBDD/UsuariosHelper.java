package com.example.puzzlejuanalbertoradohernandez.BBDD;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UsuariosHelper extends SQLiteOpenHelper {
    private final String creaPuzzle1 =
            "CREATE TABLE puzzleUno (\n" +
                    "    idPuzzleUno INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "    nombreUsuario TEXT,\n" +
                    "    puntuacion NUMBER\n" +
                    ");" ;
    private final String creaPuzzle2 =
            "CREATE TABLE puzzleDos (\n" +
                    "    idPuzzleDos INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "    nombreUsuario TEXT,\n" +
                    "    puntuacion NUMBER\n" +
                    ");" ;
    private String[] usuarios = {"ADV","Luke","Leia","Han","Chuwi","Obi wan"};
    private int[] puntuaciones1 = {8,9,7,6,8,5};
    private int[] puntuaciones2 = {20,21,18,15,17,16};
    public UsuariosHelper(@Nullable Context context) {
        super(context, "usuarios", null, 8);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(creaPuzzle1);
        db.execSQL(creaPuzzle2);
        for(int i = 0;i < usuarios.length;i++){
            ContentValues values = new ContentValues();
            values.put("nombreUsuario",usuarios[i]);
            values.put("puntuacion",puntuaciones1[i]);
            db.insert("puzzleUno",null,values);
        }
        for(int i = 0;i < usuarios.length;i++){
            ContentValues values = new ContentValues();
            values.put("nombreUsuario",usuarios[i]);
            values.put("puntuacion",puntuaciones2[i]);
            db.insert("puzzleDos",null,values);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS puzzleUno;");
        db.execSQL("DROP TABLE IF EXISTS puzzleDos;");
        onCreate(db);
    }
}

