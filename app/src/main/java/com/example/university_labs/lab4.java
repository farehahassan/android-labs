package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lab4 extends AppCompatActivity {

    TextView emailTextView, passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);

        emailTextView = findViewById(R.id.email_display);
        passwordTextView = findViewById(R.id.password_display);


        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        emailTextView.setText("Email: " + email);
        passwordTextView.setText("Passwordd: " + password);
    }
}