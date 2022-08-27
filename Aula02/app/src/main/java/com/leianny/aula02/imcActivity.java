package com.leianny.aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class imcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
    }

    public void fechar(View v){
        finish();
    }

    public void calcular(View v){
        EditText peso = findViewById(R.id.edtPeso);
        EditText altura = findViewById(R.id.edtAltura);
        TextView valor = (TextView) findViewById(R.id.txtValor);

        // calculo = peso/altura²
        Float total = Float.parseFloat(peso.getText().toString()) / (Float.parseFloat(altura.getText().toString()) * Float.parseFloat(altura.getText().toString()));
        valor.setText(String.format("%.2f",total));

    }
}