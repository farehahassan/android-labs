package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button lab2btn , lab3btn , lab4btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "your aap is on create phase ", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Assign lab2btn to the result of findViewById
        lab2btn = findViewById(R.id.lab2btn); // Correct initialization
        lab3btn = findViewById(R.id.lab3btn);
        lab4btn = findViewById(R.id.lab4btn);

        lab2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilab2 = new Intent(MainActivity.this, lab2.class);
                startActivity(ilab2);
            }
        });

        lab3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lab3 = new Intent(MainActivity.this , com.example.university_labs.lab3.class);
                startActivity(lab3);
            }
        });

        lab4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lab4 = new Intent(MainActivity.this , com.example.university_labs.lab4.class);
                startActivity(lab4);
            }
        });
    }


    protected void rt()
    {
        Toast.makeText(this, "on start calling", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "on restart calling", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }
    @Override
    protected void onPause() {
        Toast.makeText(this, "on pause calling", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "on resume calling", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "on stop calling", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "on destroy calling", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }






}
