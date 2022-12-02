package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityMessagesDetailsBinding;

public class MessagesDetailsActivity extends AppCompatActivity {

    ActivityMessagesDetailsBinding binding;
    private MessagesDetailsActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMessagesDetailsBinding.inflate(getLayoutInflater());
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