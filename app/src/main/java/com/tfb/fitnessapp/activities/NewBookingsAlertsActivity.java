package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.adapter.UpcomingScheduleAdapter;
import com.tfb.fitnessapp.databinding.ActivityNewBookingsAlertsBinding;
import com.tfb.fitnessapp.models.MySchedulemodel;

import java.util.ArrayList;

public class NewBookingsAlertsActivity extends AppCompatActivity {

    ActivityNewBookingsAlertsBinding binding;
    private NewBookingsAlertsActivity mContext;
    ArrayList<MySchedulemodel> newBookingsData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewBookingsAlertsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        setNewBookingsInfo();
        setupcomingAdapter();

    }

    private void setNewBookingsInfo() {

        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        newBookingsData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));

    }

    private void setupcomingAdapter() {

        UpcomingScheduleAdapter adapter = new UpcomingScheduleAdapter(mContext, newBookingsData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.newbookingRV.setLayoutManager(layoutManager);
        binding.newbookingRV.setAdapter(adapter);

    }
}