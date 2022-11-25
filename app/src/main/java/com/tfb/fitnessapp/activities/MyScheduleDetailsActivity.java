package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.databinding.ActivityMyScheduleDetailsBinding;
import com.tfb.fitnessapp.models.WorkoutProgramsmodel;

import java.util.ArrayList;

public class MyScheduleDetailsActivity extends AppCompatActivity {

    ActivityMyScheduleDetailsBinding binding;
    private MyScheduleDetailsActivity mContext;
    ArrayList<WorkoutProgramsmodel> workoutProgramData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyScheduleDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


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