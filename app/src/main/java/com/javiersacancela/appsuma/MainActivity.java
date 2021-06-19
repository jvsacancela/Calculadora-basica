package com.javiersacancela.appsuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

    }

       //Metodo para ejecutar el boton
        public void btnSuma(View view){
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int add = n1 + n2;
            String res = String.valueOf(add);
            result.setText(res);
        }

        public void btnResta(View view){
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int add = n1 - n2;
            String res = String.valueOf(add);
            result.setText(res);
        }

        public void btnMultiplicar(View view){
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int add = n1 * n2;
            String res = String.valueOf(add);
            result.setText(res);
        }

        public void btnDividir(View view){
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int add = n1 / n2;
            String res = String.valueOf(add);
            result.setText(res);
    }
}
