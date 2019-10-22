package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        resultado = (TextView) findViewById(R.id.lblresultado);

    }

    public void hacerSuma(View v){
        int x,y,r;
        x = Integer.parseInt(num1.getText().toString());
        y = Integer.parseInt(num2.getText().toString());
        r = x+y;
        resultado.setText(String.valueOf(r));
    }

    public void Inicio(View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
        finish();
    }
}
