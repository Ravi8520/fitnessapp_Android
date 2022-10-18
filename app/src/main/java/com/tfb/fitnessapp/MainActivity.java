package com.tfb.fitnessapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;
    }
}