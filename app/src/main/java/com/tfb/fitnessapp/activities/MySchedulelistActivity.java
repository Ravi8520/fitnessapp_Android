package com.tfb.fitnessapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.databinding.ActivityMySchedulelistBinding;

public class MySchedulelistActivity extends AppCompatActivity  {

    ActivityMySchedulelistBinding binding;
    private MySchedulelistActivity mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMySchedulelistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;



    }
}