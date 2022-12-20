package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.tfb.fitnessapp.databinding.ActivityBookSessionDetailBinding;

public class BookSessionDetailActivity extends AppCompatActivity {

    Context mContext;
    ActivityBookSessionDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookSessionDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;
    }
}