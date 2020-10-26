package com.example.practicano1_felisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    private EditText ediTextNombre;
    private EditText editTextEdad;
    private EditText editTextColor;
    private Button buttonGuardar;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        ediTextNombre=findViewById(R.id.ediTextNombre);
        editTextColor=findViewById(R.id.editTextColor);
        editTextEdad=findViewById(R.id.editTextEdad);
        buttonGuardar=findViewById(R.id.buttonGuardar);
    }
    public void onClickButtonGuardar(View view) {

        usuario = new Usuario(
                ediTextNombre.getText().toString(),
                Integer.parseInt(editTextEdad.getText().toString()),
                editTextColor.getText().toString()
        );
        usuario.setStatus(true);

        Intent dataUserIntent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("dataUserClass", usuario);
        dataUserIntent.putExtras(bundle);
        setResult(RESULT_OK, dataUserIntent);
        finish();
    }



}