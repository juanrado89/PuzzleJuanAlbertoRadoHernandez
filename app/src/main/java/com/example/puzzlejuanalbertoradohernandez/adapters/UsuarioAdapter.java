package com.example.puzzlejuanalbertoradohernandez.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.puzzlejuanalbertoradohernandez.R;
import com.example.puzzlejuanalbertoradohernandez.models.UsuarioPuzzle;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.ViewHolder>{
    private List<UsuarioPuzzle> lista;
    private Context context;

    public UsuarioAdapter(List<UsuarioPuzzle> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public UsuarioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.usuario_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdapter.ViewHolder holder, int position) {
        UsuarioPuzzle usuario = lista.get(position);
        holder.id.setText(usuario.getId());
        holder.nombre.setText(usuario.getNombreUsuario());
        holder.puntuacion.setText(usuario.getPuntuacion());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id;
        TextView nombre;
        TextView puntuacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.textId);
            nombre = itemView.findViewById(R.id.textNombre);
            puntuacion = itemView.findViewById(R.id.textPuntuacion);

        }
    }
}
