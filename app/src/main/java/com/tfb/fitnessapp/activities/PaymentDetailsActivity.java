package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityPaymentsDetailsBinding;
import com.tfb.fitnessapp.databinding.ActivityPaymentsDetailsBinding;

public class PaymentDetailsActivity extends AppCompatActivity {

    ActivityPaymentsDetailsBinding binding;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentsDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext =this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.layoutNoErrorCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,MyEarningsActivity.class));
            }
        });

        binding.layoutWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,BankDetailActivity.class));
            }
        });

        binding.lblBookASession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,SelectSessionActivity.class));
            }
        });

    }
}