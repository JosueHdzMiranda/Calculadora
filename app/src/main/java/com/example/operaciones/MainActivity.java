package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Suma(View view){
        Intent suma = new Intent(this, Suma.class);
        startActivity(suma);
        finish();
    }

    public void Resta(View view){
        Intent resta = new Intent(this, Resta.class);
        startActivity(resta);
        finish();
    }

    public void Multiplicacion(View view){
        Intent multiplicacion = new Intent(this,Multiplicacion.class);
        startActivity(multiplicacion);
        finish();
    }

    public void Division(View view){
        Intent division = new Intent(this,Division.class);
        startActivity(division);
        finish();
    }

}
