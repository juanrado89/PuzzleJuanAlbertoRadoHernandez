package com.example.puzzlejuanalbertoradohernandez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.puzzlejuanalbertoradohernandez.puzzles.Puzzle;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.IntNombre);
        Intent inicio = new Intent(this, Puzzle.class);

        iniciar = findViewById(R.id.inicio);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultadoNombre = nombre.getText().toString();
                if(!resultadoNombre.isEmpty()){
                    inicio.setAction("envio.nombre");
                    inicio.putExtra("nombre",resultadoNombre);
                    startActivity(inicio);
                }else{
                    nombre.setError("Introduce tu nombre para empezar la aplicacion");
                }

            }
        });

    }
}