package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.WorkoutGoalsAdapter;
import com.tfb.fitnessapp.databinding.ActivityWorkoutGoalsBinding;

public class WorkoutGoalsActivity extends AppCompatActivity {

    ActivityWorkoutGoalsBinding binding;
    private WorkoutGoalsActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkoutGoalsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        setWorkoutGoalslist();

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,CaloryIntakeActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void setWorkoutGoalslist() {

        DividerItemDecoration divider =
                new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        WorkoutGoalsAdapter adapter = new WorkoutGoalsAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recyclerWorkoutgoals.addItemDecoration(divider);
        binding.recyclerWorkoutgoals.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        binding.recyclerWorkoutgoals.setLayoutManager(layoutManager);
        binding.recyclerWorkoutgoals.setAdapter(adapter);

    }
}