package com.example.practicano1_felisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Series extends AppCompatActivity {

    private TextView textViewmen;
    private ImageView imageViewTriangulo1;
    private ImageView imageViewTriangulo2;
    private ImageView imageViewTriangulo3;
    private ImageView imageViewCirculo1;
    private ImageView imageViewCirculo2;
    private ImageView imageViewCirculo3;
    private ImageView imageViewCuadrado;
    private TextView textViewSigue;
    private Button buttonRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        textViewmen=findViewById(R.id.textViewmen);
        textViewSigue=findViewById(R.id.textViewSigue);
        imageViewCirculo1=findViewById(R.id.imageViewCirculo1);
        imageViewCirculo2=findViewById(R.id.imageViewCirculo2);
        imageViewCirculo3=findViewById(R.id.imageViewCirculo3);
        imageViewTriangulo1=findViewById(R.id.imageViewTriangulo1);
        imageViewTriangulo2=findViewById(R.id.imageViewTriangulo2);
        imageViewTriangulo3=findViewById(R.id.imageViewTriangulo3);
        imageViewCuadrado=findViewById(R.id.imageViewCuadrado);
        buttonRegresar=findViewById(R.id.buttonRegresar);


    }


    public void onclickRegresar(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}