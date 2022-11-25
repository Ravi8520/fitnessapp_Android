package com.tfb.fitnessapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.databinding.ActivityMealMarketBinding;

public class MealMarketActivity extends AppCompatActivity {

    ActivityMealMarketBinding binding;
    MealMarketActivity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMealMarketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;
    }
}