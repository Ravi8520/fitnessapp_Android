package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.FindProfessionalTrainerAdapter;
import com.tfb.fitnessapp.adapter.PopularTrainerAdapter;
import com.tfb.fitnessapp.adapter.TodaysClassesAdapter;
import com.tfb.fitnessapp.databinding.ActivityBookaTrainerBinding;

public class BookaTrainerActivity extends AppCompatActivity {

    private Context mContext;
    ActivityBookaTrainerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookaTrainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.rlSearchview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(mContext,SearchforBookTrainerActivity.class));
            }
        });

        setProfessionalTrainerAdapter();
        setTodaysClassesAdapter();
        setPopularTrainerAdapter();
    }

    private void setProfessionalTrainerAdapter() {

        FindProfessionalTrainerAdapter adapter = new FindProfessionalTrainerAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false);
        binding.trainerDetailRV.setLayoutManager(layoutManager);
        binding.trainerDetailRV.setAdapter(adapter);
    }

    private void setTodaysClassesAdapter() {

        TodaysClassesAdapter adapter = new TodaysClassesAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false);
        binding.todaysClassesRV.setLayoutManager(layoutManager);
        binding.todaysClassesRV.setAdapter(adapter);

    }

    private void setPopularTrainerAdapter() {

        PopularTrainerAdapter adapter = new PopularTrainerAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.popularTrainerRV.setLayoutManager(layoutManager);
        binding.popularTrainerRV.setAdapter(adapter);
    }
}