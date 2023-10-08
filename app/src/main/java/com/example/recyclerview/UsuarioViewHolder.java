package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UsuarioViewHolder extends RecyclerView.ViewHolder {
    public TextView nombreTextView;
    public TextView apellidoTextView;
    public TextView edadTextView;

    public UsuarioViewHolder(View itemView) {
        super(itemView);
        nombreTextView = itemView.findViewById(R.id.nombreTextView);
        apellidoTextView = itemView.findViewById(R.id.apellidoTextView);
        edadTextView = itemView.findViewById(R.id.edadTextView);
    }
}