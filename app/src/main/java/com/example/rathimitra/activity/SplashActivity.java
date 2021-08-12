package com.example.rathimitra.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.Utlis.AppConstant;
import com.example.rathimitra.R;

import static com.example.Utlis.AppConstant.REQUEST_PERMISSION_CODE;

public class SplashActivity extends AppCompatActivity {
    public static final String TAG = SplashActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    intent.putExtra(AppConstant.FROM,SplashActivity.TAG);
                    startActivity(intent);
                    finish();
                }

        },REQUEST_PERMISSION_CODE);
    }
}