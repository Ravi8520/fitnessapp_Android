package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityContinueAsBinding;

public class ContinueAsActivity extends AppCompatActivity {

   private ContinueAsActivity mContext;
   ActivityContinueAsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContinueAsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;





        binding.btnContinuewithPhoneno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext , OTPVerificationNumberActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}