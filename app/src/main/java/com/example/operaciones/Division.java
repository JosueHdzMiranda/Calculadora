package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {

    EditText num7, num8;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);


        num7 = (EditText) findViewById(R.id.txtnum7);
        num8 = (EditText) findViewById(R.id.txtnum8);
        resultado = (TextView) findViewById(R.id.lbl4);

    }

    public void hacerDivision(View v){
        int x,y,r;
        x = Integer.parseInt(num7.getText().toString());
        y = Integer.parseInt(num8.getText().toString());
        r = x/y;
        resultado.setText(String.valueOf(r));
    }

    public void Inicio(View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
        finish();
    }

}
