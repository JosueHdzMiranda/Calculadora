package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {

    EditText num3, num4;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        num3 = (EditText) findViewById(R.id.txtnum3);
        num4 = (EditText) findViewById(R.id.txtnum4);
        resultado = (TextView) findViewById(R.id.lbl2);
    }

    public void hacerResta(View v){
        int x,y,r;
        x = Integer.parseInt(num3.getText().toString());
        y = Integer.parseInt(num4.getText().toString());
        r = x-y;
        resultado.setText(String.valueOf(r));
    }

    public void Inicio(View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
        finish();
    }

}
