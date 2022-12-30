package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityCancelBookingBinding;

public class CancelBookingActivity extends AppCompatActivity {

    private CancelBookingActivity mContext;
    ActivityCancelBookingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCancelBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}