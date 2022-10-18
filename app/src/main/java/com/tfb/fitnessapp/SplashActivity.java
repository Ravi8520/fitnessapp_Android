package com.tfb.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;
    SplashActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(activity, MainActivity.class));
            }
        }, 3000);

    }
}