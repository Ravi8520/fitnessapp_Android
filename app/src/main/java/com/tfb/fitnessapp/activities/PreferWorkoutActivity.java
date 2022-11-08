package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityPreferWorkoutBinding;

public class PreferWorkoutActivity extends AppCompatActivity {

    private PreferWorkoutActivity mContext;
    ActivityPreferWorkoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPreferWorkoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.btnVirtualSession.setVisibility(View.GONE);
        binding.btnVirtualSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnVirtualSession.setBackground(ContextCompat.getDrawable(mContext, R.drawable.selectedworkbuttonitem));
                binding.btnHome.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnGym.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnOutdoors.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
            }
        });

        binding.btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnHome.setBackground(ContextCompat.getDrawable(mContext, R.drawable.selectedworkbuttonitem));
                binding.btnGym.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnVirtualSession.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnOutdoors.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
            }
        });

        binding.btnGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnGym.setBackground(ContextCompat.getDrawable(mContext, R.drawable.selectedworkbuttonitem));
                binding.btnVirtualSession.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnOutdoors.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnHome.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));

            }
        });

        binding.btnOutdoors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnOutdoors.setBackground(ContextCompat.getDrawable(mContext, R.drawable.selectedworkbuttonitem));
                binding.btnHome.setBackground(ContextCompat.getDrawable(mContext, R.drawable.custome_cardview));
                binding.btnGym.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
                binding.btnVirtualSession.setBackground(ContextCompat.getDrawable(mContext,R.drawable.custome_cardview));
            }
        });


        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,GymAccessActivity.class));
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