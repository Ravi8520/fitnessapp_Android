package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.activities.models.WorkoutProgramsmodel;
import com.tfb.fitnessapp.databinding.ActivityAddNewWorkoutprogrammsBinding;

import java.util.ArrayList;
import java.util.List;

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

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        List<String> categories = new ArrayList<String>();
        categories.add("Indoors");
        categories.add("Outdoors");
        categories.add("Gyms");

        binding.spinnerSessionType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,R.id.txt_name, categories);
        dataAdapter.setDropDownViewResource(R.layout.spinner_listitem);
        binding.spinnerSessionType.setAdapter(dataAdapter);

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