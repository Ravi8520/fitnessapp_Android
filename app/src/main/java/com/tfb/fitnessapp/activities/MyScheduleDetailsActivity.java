package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityMyScheduleDetailsBinding;

public class MyScheduleDetailsActivity extends AppCompatActivity {

    ActivityMyScheduleDetailsBinding binding;
    private MyScheduleDetailsActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyScheduleDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

    }
}