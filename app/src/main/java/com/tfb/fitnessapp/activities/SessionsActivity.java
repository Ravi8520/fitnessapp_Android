package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivitySessionsBinding;

public class SessionsActivity extends AppCompatActivity {

    private SessionsActivity mContext;
    private ActivitySessionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySessionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext =this;

    }
}