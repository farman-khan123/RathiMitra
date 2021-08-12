package com.example.rathimitra.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.rathimitra.MainActivity;
import com.example.rathimitra.R;

public class LoginActivity extends AppCompatActivity {
    RelativeLayout rel_register;
    TextView forget_password_tv;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rel_register = findViewById(R.id.rel_register);
        forget_password_tv = findViewById(R.id.forget_password_tv);
        btnLogin = findViewById(R.id.btnLogin);

        rel_register.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });

        forget_password_tv.setOnClickListener(v -> {
            Intent intent = new Intent(this, ChangePasswordActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });




    }
}