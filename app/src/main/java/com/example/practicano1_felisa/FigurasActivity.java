package com.example.practicano1_felisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FigurasActivity extends AppCompatActivity {
    private Usuario usuario;
    private TextView lblNombre;
    private TextView lblMensaje;
    private ImageView imagenTriangulo;
    private ImageView imagenCirculo;
    private ImageView imagenCuadrado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras);

        lblMensaje=findViewById(R.id.lblMensaje);
        lblNombre=findViewById(R.id.lblNombre);


    }
}