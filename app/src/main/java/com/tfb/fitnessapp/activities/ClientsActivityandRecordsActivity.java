package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.tfb.fitnessapp.databinding.ActivityClientsActivityandRecordsBinding;

public class ClientsActivityandRecordsActivity extends AppCompatActivity {

    ActivityClientsActivityandRecordsBinding binding;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientsActivityandRecordsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

    }
}