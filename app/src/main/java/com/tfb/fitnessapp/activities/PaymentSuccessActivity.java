package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.databinding.ActivityPaymentSuccessBinding;

public class PaymentSuccessActivity extends AppCompatActivity {

    private PaymentSuccessActivity mContext;
    ActivityPaymentSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,PaymentDetailsActivity.class));
            }
        });

        binding.txtViewOrderSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,OrderSummeryActivity.class));
            }
        });



    }
}