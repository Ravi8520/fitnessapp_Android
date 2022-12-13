package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.SearchMealAdapter;
import com.tfb.fitnessapp.databinding.ActivitySearchMealsBinding;

public class SearchMealsActivity extends AppCompatActivity {

    private ActivitySearchMealsBinding binding;
    private SearchMealAdapter searchMealAdapter;

    private SearchMealsActivity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchMealsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;
        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        searchMealAdapter = new SearchMealAdapter(context);
        binding.recyclerFood.setLayoutManager(new LinearLayoutManager(context));
        binding.recyclerFood.setAdapter(searchMealAdapter);


        searchMealAdapter.setOnItemClickListener(new SearchMealAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (view.getId() == R.id.layout_add) {
                    startActivity(new Intent(context, GoToCartActivity.class));
                }
            }
        });
    }
}