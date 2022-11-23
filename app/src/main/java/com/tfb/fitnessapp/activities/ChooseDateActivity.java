package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityChooseDateBinding;

public class ChooseDateActivity extends AppCompatActivity {

    private ActivityChooseDateBinding binding;
    private ChooseDateActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseDateBinding.inflate(getLayoutInflater());
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