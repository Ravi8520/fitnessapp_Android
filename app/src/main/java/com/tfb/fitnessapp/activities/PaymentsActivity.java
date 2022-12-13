package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityPaymentsBinding;

public class PaymentsActivity extends AppCompatActivity {

    ActivityPaymentsBinding binding;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext =this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.layoutNoErrorCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,MyEarningsActivity.class));
            }
        });

    }
}