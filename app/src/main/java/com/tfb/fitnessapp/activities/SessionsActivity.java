package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.sessionhistoryAdapter;
import com.tfb.fitnessapp.activities.models.Sessionhistorymodel;
import com.tfb.fitnessapp.databinding.ActivitySessionsBinding;

import java.util.ArrayList;

public class SessionsActivity extends AppCompatActivity {

    private SessionsActivity mContext;
    private ActivitySessionsBinding binding;
    ArrayList<Sessionhistorymodel> sessionhistoryData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySessionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext =this;

        setSessionInfo();
        setSessionAdapter();


        binding.layoutSessionTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,ChooseDateActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void setSessionInfo() {

        sessionhistoryData.add(new Sessionhistorymodel("attended","08:30AM-09:00AM","Group session","Home",
                "901 S Miami Ave, Miami","26th NOV","08:25 AM"));
        sessionhistoryData.add(new Sessionhistorymodel("attended","08:30AM-09:00AM","Group session","Home",
                "901 S Miami Ave, Miami","26th NOV","08:25 AM"));
        sessionhistoryData.add(new Sessionhistorymodel("attended","08:30AM-09:00AM","Group session","Home",
                "901 S Miami Ave, Miami","26th NOV","08:25 AM"));
        sessionhistoryData.add(new Sessionhistorymodel("attended","08:30AM-09:00AM","Group session","Home",
                "901 S Miami Ave, Miami","26th NOV","08:25 AM"));
        sessionhistoryData.add(new Sessionhistorymodel("attended","08:30AM-09:00AM","Group session","Home",
                "901 S Miami Ave, Miami","26th NOV","08:25 AM"));
    }

    private void setSessionAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        sessionhistoryAdapter adapter = new sessionhistoryAdapter(mContext,sessionhistoryData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.sessionHistoryRV.addItemDecoration(divider);
        binding.sessionHistoryRV.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        binding.sessionHistoryRV.setLayoutManager(layoutManager);
        binding.sessionHistoryRV.setAdapter(adapter);
    }
}