package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.CartSelectedFoodAdapter;
import com.tfb.fitnessapp.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {

    ActivityCartBinding binding;
    CartActivity context;
    CartSelectedFoodAdapter cartSelectedFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        DividerItemDecoration divider =
                new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));


        cartSelectedFoodAdapter = new CartSelectedFoodAdapter(context);
        binding.recyclerSelectedItem.addItemDecoration(divider);
        binding.recyclerSelectedItem.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        binding.recyclerSelectedItem.setLayoutManager(new LinearLayoutManager(context));
        binding.recyclerSelectedItem.setAdapter(cartSelectedFoodAdapter);
    }
}