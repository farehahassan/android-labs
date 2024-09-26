package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lab3 extends AppCompatActivity {

    EditText num1text , num2text;
    Button calc;
    TextView total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1text.getText();
                num2text.getText();
                int num1 = Integer.parseInt(String.valueOf(num1text));
                int num2 = Integer.parseInt(String.valueOf(num2text));
               total.setText(num1 + num2);
            }
        });

    }
}