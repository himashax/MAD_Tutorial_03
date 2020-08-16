package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView no1,no2,  calculation;
    Button addition, substraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        addition=(Button)findViewById(R.id.addition);
        substraction=(Button)findViewById(R.id.substraction);
        multiplication=(Button)findViewById(R.id.multiplication);
        division=(Button)findViewById(R.id.division);

        no1 = (TextView)findViewById(R.id.no1);
        no2 = (TextView)findViewById(R.id.no2);
        calculation = (TextView)findViewById(R.id.calc);

        String number1 = getIntent().getExtras().getString("input1","");
        String number2 = getIntent().getExtras().getString("input2", "");

        no1.setText(number1);
        no2.setText(number2);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1_value = Integer.valueOf(no1.getText().toString());
                int no2_value = Integer.valueOf(no2.getText().toString());
                int answer = no1_value + no2_value;
                calculation.setText(no1_value + " + " +no2_value+ " = " + String.valueOf(answer));
            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1_value = Integer.valueOf(no1.getText().toString());
                int no2_value = Integer.valueOf(no2.getText().toString());
                int answer = no1_value - no2_value;
                calculation.setText(no1_value + " - " +no2_value+ " = " + String.valueOf(answer));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1_value = Integer.valueOf(no1.getText().toString());
                int no2_value = Integer.valueOf(no2.getText().toString());
                int answer = no1_value * no2_value;
                calculation.setText(no1_value + " * " +no2_value+ " = " + String.valueOf(answer));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1_value = Integer.valueOf(no1.getText().toString());
                int no2_value = Integer.valueOf(no2.getText().toString());
                int answer = no1_value/no2_value;
                calculation.setText(no1_value + " / " +no2_value+ " = " + String.valueOf(answer));
            }
        });
    }
}