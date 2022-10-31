package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityCaloryIntakeBinding;

public class CaloryIntakeActivity extends AppCompatActivity {

    private CaloryIntakeActivity mContext;
    ActivityCaloryIntakeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCaloryIntakeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;




        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,InjuriesActivity.class));
            }
        });


    }
}