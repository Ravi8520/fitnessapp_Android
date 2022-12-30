package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityMealOrderSummaryBinding;

public class MealOrderSummaryActivity extends AppCompatActivity {

    private MealOrderSummaryActivity mContext;
    ActivityMealOrderSummaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMealOrderSummaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, MealMarketActivity.class));
            }
        });


    }
}