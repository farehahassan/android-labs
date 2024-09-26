package com.example.university_labs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class lab3 extends AppCompatActivity {

    EditText emailField, passwordField;
    Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

        emailField = findViewById(R.id.email_field);
        passwordField = findViewById(R.id.password_field);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(lab3.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Navigate to the next activity and pass the data
                    Intent intent = new Intent(lab3.this, lab4.class);
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }
}