package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ValorDolar, Dolar;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ValorDolar = findViewById(R.id.ValorDolar);
        Dolar = findViewById(R.id.Dolar);

        Result = findViewById(R.id.Result);
    }

    public void calcular(View view) {

        double quantDolar = Double.parseDouble(ValorDolar.getText().toString());
        double totalDolar = Double.parseDouble(Dolar.getText().toString());
        double total = quantDolar * totalDolar;

        Result.setText("R$: " + total);

    }


}