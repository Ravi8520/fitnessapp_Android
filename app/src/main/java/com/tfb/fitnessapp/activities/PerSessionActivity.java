package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.activities.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.activities.models.MySchedulemodel;
import com.tfb.fitnessapp.activities.models.WorkoutProgramsmodel;
import com.tfb.fitnessapp.databinding.ActivityPerSessionBinding;
import com.tfb.fitnessapp.databinding.ActivityPerSessionBinding;

import java.util.ArrayList;

public class PerSessionActivity extends AppCompatActivity {

    ActivityPerSessionBinding binding;
    private PerSessionActivity mContext;
    ArrayList<WorkoutProgramsmodel> workoutProgramData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerSessionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnSaveContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,PricingActivity.class));
            }
        });

        binding.workoutProgramsRV.setNestedScrollingEnabled(false);
        setworkoutProgramsInfo();
        setworkoutProgramsAdapter();

    }

    private void setworkoutProgramsInfo() {

        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));

    }

    private void setworkoutProgramsAdapter() {

        WorkoutProgramsAdapter adapter = new WorkoutProgramsAdapter(mContext,workoutProgramData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.workoutProgramsRV.setLayoutManager(layoutManager);
        binding.workoutProgramsRV.setAdapter(adapter);

    }


}