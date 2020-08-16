package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    EditText text1, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        btn = (Button)findViewById(R.id.okayButton);
        text1 = (EditText)findViewById(R.id.num1);
        text2 = (EditText)findViewById(R.id.num2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence message = "Sending message...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                //toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);


                Intent intent= new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("input1",text1.getText().toString());
                intent.putExtra("input2",text2.getText().toString());
                startActivity(intent);
            }
        });
    }
}