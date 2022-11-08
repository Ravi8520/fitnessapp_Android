package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityChooseAvailabilityBinding;

public class ChooseAvailabilityActivity extends AppCompatActivity {


    ActivityChooseAvailabilityBinding binding;
    private ChooseAvailabilityActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseAvailabilityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}