package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.adapter.SpecialBenefitsAdapter;
import com.tfb.fitnessapp.databinding.ActivityOnboardingdetailBinding;

public class OnboardingdetailActivity extends AppCompatActivity {


    ActivityOnboardingdetailBinding binding;
    private OnboardingdetailActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOnboardingdetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        setDetailsAdapter();

        binding.btnOnboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, TrainerContinuewithActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void setDetailsAdapter() {

        SpecialBenefitsAdapter adapter = new SpecialBenefitsAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recyclerDetailsList.setLayoutManager(layoutManager);
        binding.recyclerDetailsList.setAdapter(adapter);
    }
}