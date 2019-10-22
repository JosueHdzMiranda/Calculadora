package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacion extends AppCompatActivity {

    EditText num5, num6;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        num5 = (EditText) findViewById(R.id.txtnum5);
        num6 = (EditText) findViewById(R.id.txtnum6);
        resultado = (TextView) findViewById(R.id.lbl3);
    }

    public void hacerMultiplicacion(View v){
        int x,y,r;
        x = Integer.parseInt(num5.getText().toString());
        y = Integer.parseInt(num6.getText().toString());
        r = x*y;
        resultado.setText(String.valueOf(r));
    }


    public void Inicio(View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
    }

}
