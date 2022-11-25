package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.TimeslotsAdapter;
import com.tfb.fitnessapp.models.TimeslotsModel;
import com.tfb.fitnessapp.databinding.ActivityChooseTimeSlotsBinding;

import java.util.ArrayList;

public class ChooseTimeSlotsActivity extends AppCompatActivity {

    private ChooseTimeSlotsActivity mContext;
    ActivityChooseTimeSlotsBinding binding;

    private ArrayList<TimeslotsModel> weekdaysList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseTimeSlotsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        weekdaysList = new ArrayList<>();

        weekdaysList.add(new TimeslotsModel("Monday"));
        weekdaysList.add(new TimeslotsModel("Tuesday"));
        weekdaysList.add(new TimeslotsModel("Wednesday"));
        weekdaysList.add(new TimeslotsModel("Thursday"));
        weekdaysList.add(new TimeslotsModel("Friday"));
        weekdaysList.add(new TimeslotsModel("Saturday"));
        weekdaysList.add(new TimeslotsModel("Sunday"));

        TimeslotsAdapter adapter = new TimeslotsAdapter(weekdaysList,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        binding.timeslotsRV.setLayoutManager(layoutManager);
        binding.timeslotsRV.setAdapter(adapter);




        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBackPressed();
            }
        });


    }
}