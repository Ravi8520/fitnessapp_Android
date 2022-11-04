package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityWelcomeProfileTrainerBinding;

public class WelcomeProfileTrainerActivity extends AppCompatActivity {

    private WelcomeProfileTrainerActivity mContext;
    ActivityWelcomeProfileTrainerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityWelcomeProfileTrainerBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        mContext = this;
        binding.btnMale.setBackground(ContextCompat.getDrawable(mContext,R.drawable.item_male_btn));

        binding.btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnMale.setBackground(ContextCompat.getDrawable(mContext,R.drawable.item_male_btn));
                binding.btnFemale.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_btn));

            }
        });

        binding.btnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnFemale.setBackground(ContextCompat.getDrawable(mContext,R.drawable.item_female_btn));
                binding.btnMale.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_btn));
            }
        });


        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,PreferWorkoutActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}