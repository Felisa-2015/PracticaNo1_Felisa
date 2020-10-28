package com.example.practicano1_felisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FigurasActivity extends AppCompatActivity {
    private Usuario usuario;
    private TextView lblNombre;
    private TextView lblMensaje;
    private ImageView imagenTriangulo;
    private ImageView imagenCirculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usuario = getIntent().getParcelableExtra("userClass");

        Toast.makeText(this, usuario.toString(), Toast.LENGTH_LONG);


        setContentView(R.layout.activity_figuras);

        lblMensaje=findViewById(R.id.lblMensaje);
        lblNombre=findViewById(R.id.lblNombre);

        lblNombre.setText(usuario.getNombre());

        Toast.makeText(this, usuario.toString(), Toast.LENGTH_LONG);

    }
}