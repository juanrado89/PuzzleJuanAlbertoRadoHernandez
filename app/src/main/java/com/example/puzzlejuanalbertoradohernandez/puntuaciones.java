package com.example.puzzlejuanalbertoradohernandez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.puzzlejuanalbertoradohernandez.adapters.UsuarioAdapter;
import com.example.puzzlejuanalbertoradohernandez.datos.UsuariosDatos;
import com.example.puzzlejuanalbertoradohernandez.models.UsuarioPuzzle;

import java.util.List;

public class puntuaciones extends AppCompatActivity {

    RecyclerView puntuacion1;
    RecyclerView puntuacion2;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuaciones);
        puntuacion1 = findViewById(R.id.puntuacion1);
        UsuariosDatos ud = new UsuariosDatos(this,"puzzleUno");
        List<UsuarioPuzzle> puntuaciones1 = ud.getAllUsuarios();
        if(!puntuaciones1.isEmpty()){
            puntuacion1.setLayoutManager(new LinearLayoutManager(this));
            puntuacion1.setAdapter(new UsuarioAdapter( puntuaciones1,this));
        }
        puntuacion2 = findViewById(R.id.puntuacion2);
        UsuariosDatos ud2 = new UsuariosDatos(this,"puzzleDos");
        List<UsuarioPuzzle> puntuaciones2 = ud2.getAllUsuarios();
        if(!puntuaciones2.isEmpty()){
            puntuacion2.setLayoutManager(new LinearLayoutManager(this));
            puntuacion2.setAdapter(new UsuarioAdapter( puntuaciones2,this));
        }
        volver = findViewById(R.id.volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vol = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(vol);
                finish();
            }
        });
    }
}