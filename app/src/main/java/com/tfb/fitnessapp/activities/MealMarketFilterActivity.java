package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tfb.fitnessapp.adapter.MealRecentSearchAdapter;
import com.tfb.fitnessapp.databinding.ActivityMealMarketFilterBinding;

public class MealMarketFilterActivity extends AppCompatActivity {

    ActivityMealMarketFilterBinding binding;
    MealMarketFilterActivity mcontext;
    MealRecentSearchAdapter mealRecentSearchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMealMarketFilterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mcontext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mealRecentSearchAdapter = new MealRecentSearchAdapter(mcontext);
        binding.recyclerRecentSearch.setLayoutManager(new LinearLayoutManager(mcontext, LinearLayoutManager.HORIZONTAL, false));
        binding.recyclerRecentSearch.setAdapter(mealRecentSearchAdapter);

        mealRecentSearchAdapter = new MealRecentSearchAdapter(mcontext);
        binding.recyclerPopularCategory.setLayoutManager(new LinearLayoutManager(mcontext, LinearLayoutManager.HORIZONTAL, false));
        binding.recyclerPopularCategory.setAdapter(mealRecentSearchAdapter);

    }
}