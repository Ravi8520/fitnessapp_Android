package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tfb.fitnessapp.databinding.ActivityBookingBinding;

public class BookingActivity extends AppCompatActivity {

    ActivityBookingBinding binding;
    private BookingActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


    }
}