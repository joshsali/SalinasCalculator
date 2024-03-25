package com.example.salinascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1;
    EditText num2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.txtResult);
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        addition = findViewById(R.id.btnAdd);
        subtraction = findViewById(R.id.btnMinus);
        multiplication = findViewById(R.id.btnTimes);
        division = findViewById(R.id.btnDivide);
        clear = findViewById(R.id.btnClear);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                result.setText(String.valueOf(sum));
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double difference = number1 - number2;
                result.setText(String.valueOf(difference));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double product = number1 * number2;
                result.setText(String.valueOf(product));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double quotient = number1 / number2;
                result.setText(String.valueOf(quotient));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("0");
            }
        });
    }
}