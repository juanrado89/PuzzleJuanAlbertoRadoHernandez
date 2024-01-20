package com.example.puzzlejuanalbertoradohernandez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.puzzlejuanalbertoradohernandez.adapters.UsuarioAdapter;
import com.example.puzzlejuanalbertoradohernandez.datos.UsuariosDatos;
import com.example.puzzlejuanalbertoradohernandez.models.UsuarioPuzzle;

import java.util.List;

public class puntuaciones extends AppCompatActivity {

    RecyclerView puntuacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuaciones);
        puntuacion = findViewById(R.id.puntuacion1);
        UsuariosDatos ud = new UsuariosDatos(this,"puzzle_uno");
        List<UsuarioPuzzle> puntuaciones = ud.getAllUsuarios();
        if(!puntuaciones.isEmpty()){
            puntuacion.setLayoutManager(new LinearLayoutManager(this));
            puntuacion.setAdapter(new UsuarioAdapter( puntuaciones,this));
        }
    }
}