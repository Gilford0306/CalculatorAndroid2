package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText number_field_1;
    private EditText number_field_2;

    private Button plus;
    private Button minus;
    private Button mult;
    private Button divid;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            resultTextView = findViewById(R.id.resultTextView);
            number_field_1 = findViewById(R.id.number_field_1);
            number_field_2 = findViewById(R.id.number_field_2);
            plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        divid = findViewById(R.id.div);

            plus.setOnClickListener(v -> {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                float res = num1+num2;
                resultTextView.setText(String.valueOf(res));
            });
        minus.setOnClickListener(v -> {
            float num1 = Float.parseFloat(number_field_1.getText().toString());
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            float res = num1-num2;
            resultTextView.setText(String.valueOf(res));
        });
        mult.setOnClickListener(v -> {
            float num1 = Float.parseFloat(number_field_1.getText().toString());
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            float res = num1*num2;
            resultTextView.setText(String.valueOf(res));
        });
        divid.setOnClickListener(v -> {
            float num1 = Float.parseFloat(number_field_1.getText().toString());
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            if (num2 != 0)
            {
                float res = num1/num2;
                resultTextView.setText(String.valueOf(res));
            }
            else
            {
                resultTextView.setText("Divided by 0");
            }

        });
        };
    }
