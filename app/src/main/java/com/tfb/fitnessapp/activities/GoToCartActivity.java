package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tfb.fitnessapp.adapter.GoToCartAdapter;
import com.tfb.fitnessapp.databinding.ActivityGoToCartBinding;

public class GoToCartActivity extends AppCompatActivity {

    ActivityGoToCartBinding binding;
    GoToCartActivity context;
    GoToCartAdapter goToCartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGoToCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        goToCartAdapter = new GoToCartAdapter(context);
        binding.recyclerSelectedFood.setLayoutManager(new LinearLayoutManager(context));
        binding.recyclerSelectedFood.setAdapter(goToCartAdapter);

    }
}