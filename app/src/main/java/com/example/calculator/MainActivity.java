package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);
        Button modulus = (Button) findViewById(R.id.modulus);

        EditText x = (EditText) findViewById(.vaR.idlue1);
        EditText y = (EditText) findViewById(R.id.value2);

        TextView answer = (TextView) findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double v1 = Double.parseDouble(String.valueOf(x.getText()));
                    double v2 = Double.parseDouble(String.valueOf(y.getText()));
                    String ans = "Answer = " + MyCalculator.add(v1, v2);
                    answer.setText(ans);
                }catch (Exception ex)
                {
                    String ans = "Error";
                    answer.setText(ans);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double v1 = Double.parseDouble(String.valueOf(x.getText()));
                    double v2 = Double.parseDouble(String.valueOf(y.getText()));
                    String ans = "Answer = " + MyCalculator.substract(v1, v2);
                    answer.setText(ans);
                }catch (Exception ex)
                {
                    String ans = "Error";
                    answer.setText(ans);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double v1 = Double.parseDouble(String.valueOf(x.getText()));
                    double v2 = Double.parseDouble(String.valueOf(y.getText()));
                    String ans = "Answer = " + MyCalculator.multiple(v1, v2);
                    answer.setText(ans);
                }catch (Exception ex)
                {
                    String ans = "Error";
                    answer.setText(ans);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double v1 = Double.parseDouble(String.valueOf(x.getText()));
                    double v2 = Double.parseDouble(String.valueOf(y.getText()));
                    String ans = "Answer = " + MyCalculator.divide(v1, v2);
                    answer.setText(ans);
                }catch (Exception ex)
                {
                    String ans = "Error";
                    answer.setText(ans);
                }
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double v1 = Double.parseDouble(String.valueOf(x.getText()));
                    double v2 = Double.parseDouble(String.valueOf(y.getText()));
                    String ans = "Answer = " + MyCalculator.modulus(v1, v2);
                    answer.setText(ans);
                }catch (Exception ex)
                {
                    String ans = "Error";
                    answer.setText(ans);
                }
            }
        });
    }
}