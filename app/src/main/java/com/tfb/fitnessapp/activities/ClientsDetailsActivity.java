package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.ActivitiesAndReportsAdapter;
import com.tfb.fitnessapp.databinding.ActivityClientsDetailsBinding;
import com.tfb.fitnessapp.models.ActivitiesandRecordsmodel;

import java.util.ArrayList;

public class ClientsDetailsActivity extends AppCompatActivity {

    ActivityClientsDetailsBinding binding;
    private Context mContext;
    ArrayList<ActivitiesandRecordsmodel> recordsdata = new ArrayList<>();

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

        setRecords();
        setRecordsadapter();
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