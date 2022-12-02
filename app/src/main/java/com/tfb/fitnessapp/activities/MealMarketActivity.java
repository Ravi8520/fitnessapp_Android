package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.tfb.fitnessapp.adapter.MealMarketAdapter;
import com.tfb.fitnessapp.databinding.ActivityMealMarketBinding;

public class MealMarketActivity extends AppCompatActivity {

    ActivityMealMarketBinding binding;
    MealMarketActivity context;
    MealMarketAdapter mealMarketAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMealMarketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mealMarketAdapter = new MealMarketAdapter(context);
        binding.recyclerFood.setLayoutManager(new GridLayoutManager(context, 3));
        binding.recyclerFood.setNestedScrollingEnabled(false);
        binding.recyclerFood.setAdapter(mealMarketAdapter);
    }
}