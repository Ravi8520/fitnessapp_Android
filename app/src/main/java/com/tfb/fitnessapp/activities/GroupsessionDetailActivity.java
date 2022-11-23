package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.activities.models.WorkoutProgramsmodel;
import com.tfb.fitnessapp.databinding.ActivityGroupsessionDetailBinding;

import java.util.ArrayList;

public class GroupsessionDetailActivity extends AppCompatActivity {

    ActivityGroupsessionDetailBinding binding;
    private GroupsessionDetailActivity mContext;
    ArrayList<WorkoutProgramsmodel> workoutProgramData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGroupsessionDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        binding.workoutProgramsRV.setNestedScrollingEnabled(false);
        setworkoutProgramsInfo();
        setworkoutProgramsAdapter();


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        binding.txtAddNewWorkoutprogramms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,AddNewWorkoutprogrammsActivity.class));
            }
        });

        binding.btnSaveContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,PricingActivity.class));
            }
        });

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