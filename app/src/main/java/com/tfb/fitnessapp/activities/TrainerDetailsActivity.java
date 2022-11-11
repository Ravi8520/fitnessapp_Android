package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.tfb.fitnessapp.databinding.ActivityTrainerDetailsBinding;

public class TrainerDetailsActivity extends AppCompatActivity {

    ActivityTrainerDetailsBinding binding;
    private TrainerDetailsActivity mContext;
    boolean condition_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrainerDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                condition_flag = b;
                if (b) {
                    Toast.makeText(mContext, "Switch On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "Switch Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(condition_flag) {
                    startActivity(new Intent(mContext, WelcomeProfileTrainerActivity.class));
                }else{
                    Toast.makeText(mContext, "please check terms and condition...", Toast.LENGTH_SHORT).show();
                }
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