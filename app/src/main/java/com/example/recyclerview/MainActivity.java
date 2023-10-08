package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView usuarioRecyclerView;
    private UsuarioAdapter usuarioAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "Pérez", 30));
        usuarios.add(new Usuario("María", "García", 25));
        usuarios.add(new Usuario("Pedro", "López", 40));

        usuarioRecyclerView = findViewById(R.id.usuarioRecyclerView);
        usuarioAdapter = new UsuarioAdapter(usuarios);
        usuarioRecyclerView.setAdapter(usuarioAdapter);
    }
}