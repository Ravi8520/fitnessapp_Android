package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.activities.models.WorkoutProgramsmodel;
import com.tfb.fitnessapp.databinding.ActivityAddNewWorkoutprogrammsBinding;

import java.util.ArrayList;

public class AddNewWorkoutprogrammsActivity extends AppCompatActivity {

    ActivityAddNewWorkoutprogrammsBinding binding;
    private AddNewWorkoutprogrammsActivity mContext;
    ArrayList<WorkoutProgramsmodel> workoutProgramincludedData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddNewWorkoutprogrammsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        binding.workoutProgramsincludedRV.setNestedScrollingEnabled(false);
        setworkoutProgramsincludedInfo();
        setworkoutProgramsincludedAdapter();
    }

    private void setworkoutProgramsincludedInfo() {
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramincludedData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
    }

    private void setworkoutProgramsincludedAdapter() {

        WorkoutProgramsAdapter adapter = new WorkoutProgramsAdapter(mContext,workoutProgramincludedData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.workoutProgramsincludedRV.setLayoutManager(layoutManager);
        binding.workoutProgramsincludedRV.setAdapter(adapter);

    }
}