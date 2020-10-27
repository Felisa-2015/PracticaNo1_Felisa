package com.example.practicano1_felisa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonRegistrar;
    private Button buttonFiguras;
    private Button buttonSeries;
    private static final int REQUEST_CODE = 1;
    private Usuario usuario;
    private TextView lblDatos;
    private TextView lblIncio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRegistrar=findViewById(R.id.buttonDatos);
        buttonFiguras=findViewById(R.id.buttonFiguras);
        buttonSeries=findViewById(R.id.buttonSeries);
        lblDatos=findViewById(R.id.lblDatos);
        lblIncio=findViewById(R.id.lblIncio);
    }


    public void  habilitarBotonoes(){
        if (usuario.isStatus()) {
            buttonRegistrar.setEnabled(false);
            buttonFiguras.setEnabled(true);
            buttonSeries.setEnabled(true);
            lblIncio.setEnabled(true);
            lblDatos.setEnabled(true);
        }

    }

    public void formulario(View view){
        Intent intent=new Intent(this, Formulario.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((this.REQUEST_CODE == requestCode)  && (resultCode == RESULT_OK)) {
            Bundle bundle = data.getExtras();
            if(bundle != null) {
                usuario = (Usuario) bundle.getParcelable("dataUserClass");
                lblDatos.setText(usuario.toString());
                Toast.makeText(this, usuario.toString(), Toast.LENGTH_LONG).show();
                habilitarBotonoes();
            } else {
                Toast.makeText(this, "Error: no se recibieron datos", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void onClickFiguras(View view) {
        // Para mandar un objeto a una activity nueva.
        Intent intent = new Intent(this, FigurasActivity.class);
        intent.putExtra("userClass", usuario);
        startActivity(intent);
    }

}