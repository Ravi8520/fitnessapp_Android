package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityInviteLinkBinding;

public class InviteLinkActivity extends AppCompatActivity {

    private InviteLinkActivity mContext;
    ActivityInviteLinkBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInviteLinkBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


    }
}