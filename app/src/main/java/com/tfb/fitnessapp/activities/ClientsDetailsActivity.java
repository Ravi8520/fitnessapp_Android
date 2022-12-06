package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.tfb.fitnessapp.databinding.ActivityClientsDetailsBinding;

public class ClientsDetailsActivity extends AppCompatActivity {

    ActivityClientsDetailsBinding binding;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientsDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;
    }
}