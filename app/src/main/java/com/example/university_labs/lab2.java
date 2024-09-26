package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class lab2 extends AppCompatActivity {

    int counter = 0;
    TextView counterText;
    FloatingActionButton fab;
    Button resetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
resetBtn = findViewById(R.id.resetBtn);
        counterText = findViewById(R.id.counterText);
        fab = findViewById(R.id.fab);
        
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterText.setText(String.valueOf(counter));
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counter = 0;
                counterText.setText("0");

            }
        });

    }
}