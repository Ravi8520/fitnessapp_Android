package com.tfb.fitnessapp.activities;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.FoodFilterCategoryAdapter;
import com.tfb.fitnessapp.adapter.MealRecentSearchAdapter;
import com.tfb.fitnessapp.databinding.ActivityMealMarketFilterBinding;

public class MealMarketFilterActivity extends AppCompatActivity {

    ActivityMealMarketFilterBinding binding;
    MealMarketFilterActivity mcontext;
    MealRecentSearchAdapter mealRecentSearchAdapter;
    FoodFilterCategoryAdapter foodFilterCategoryAdapter;

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

        final Dialog dialog = new Dialog(mcontext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.foodcategory_filter_dailog);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().setGravity(Gravity.BOTTOM);

        RecyclerView recyclerView = dialog.findViewById(R.id.recycler_food_category);
        foodFilterCategoryAdapter = new FoodFilterCategoryAdapter(mcontext);
        LinearLayoutManager layoutManager =
                new GridLayoutManager(mcontext, 2, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodFilterCategoryAdapter);

        dialog.show();


    }
}