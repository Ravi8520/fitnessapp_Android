package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.ActivitiesAndReportsAdapter;
import com.tfb.fitnessapp.adapter.GoalsAdapter;
import com.tfb.fitnessapp.databinding.ActivityClientsDetailsBinding;
import com.tfb.fitnessapp.models.ActivitiesandRecordsmodel;
import com.tfb.fitnessapp.models.Goalsmodel;

import java.util.ArrayList;

public class ClientsDetailsActivity extends AppCompatActivity {

    ActivityClientsDetailsBinding binding;
    private ClientsDetailsActivity mContext;
    ArrayList<ActivitiesandRecordsmodel> recordsdata = new ArrayList<>();
    ArrayList<Goalsmodel> goalsdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientsDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.lblViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,ClientsActivityandRecordsActivity.class));
            }
        });

        setGoals();
        setGoalsadapter();

        setRecords();
        setRecordsadapter();
    }

    private void setGoals() {

        goalsdata.add(new Goalsmodel("Weight Loss"));
        goalsdata.add(new Goalsmodel("Muscle Gain"));
        goalsdata.add(new Goalsmodel("Weight Loss"));
        goalsdata.add(new Goalsmodel("Muscle Gain"));
        goalsdata.add(new Goalsmodel("Weight Loss"));

    }

    private void setGoalsadapter() {

        GoalsAdapter adapter = new GoalsAdapter(mContext,goalsdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false);
        binding.goalsRV.setLayoutManager(layoutManager);
        binding.goalsRV.setAdapter(adapter);

    }

    private void setRecords() {

        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov","12","mindfullness","8 Exercises"));
    }

    private void setRecordsadapter() {

        ActivitiesAndReportsAdapter adapter = new ActivitiesAndReportsAdapter(mContext,recordsdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recentWorkoutsRV.setLayoutManager(layoutManager);
        binding.recentWorkoutsRV.setAdapter(adapter);

    }
}