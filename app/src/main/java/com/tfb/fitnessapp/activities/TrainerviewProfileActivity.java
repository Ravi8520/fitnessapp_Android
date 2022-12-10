package com.tfb.fitnessapp.activities;



import static com.google.android.material.tabs.TabLayout.GRAVITY_FILL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.tfb.fitnessapp.R;

import com.tfb.fitnessapp.adapter.TrainerViewProfilepageAdapter;
import com.tfb.fitnessapp.databinding.ActivityTrainerviewProfileBinding;

public class TrainerviewProfileActivity extends AppCompatActivity {

    ActivityTrainerviewProfileBinding binding;
    private TrainerviewProfileActivity mContext;
    TrainerViewProfilepageAdapter trainerViewProfilepageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrainerviewProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.lbl_workouts)));
        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.lbl_demos)));
        binding.tablayout.setTabGravity(GRAVITY_FILL);

        trainerViewProfilepageAdapter = new TrainerViewProfilepageAdapter(getSupportFragmentManager(), binding.tablayout.getTabCount());
        binding.tabViewPager.setAdapter(trainerViewProfilepageAdapter);

        binding.tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));

        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.tabViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}