package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lab4 extends AppCompatActivity {

    Button webbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);

        webbtn = findViewById(R.id.webbtn);

        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webView= new Intent(getApplicationContext() , web_view.class);
                startActivity(webView);
            }
        });
    }
}