package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1  = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        lblresultado = findViewById(R.id.lblresultado);
        }
        public void sumar(View view){
            String valor1=num1.getText().toString();
            String valor2=num2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            //tv1.setText(resu);
            String cadena = "El resultado es: " + resu;
            lblresultado.setText(cadena);

    }
}