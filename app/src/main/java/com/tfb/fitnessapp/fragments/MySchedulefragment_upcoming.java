package com.tfb.fitnessapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.adapter.UpcomingScheduleAdapter;
import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.databinding.FragmentMyScheduleupcomingBinding;

import java.util.ArrayList;


public class MySchedulefragment_upcoming extends Fragment {


    private FragmentMyScheduleupcomingBinding binding;
    private MySchedulefragment_upcoming mContext;
    ArrayList<MySchedulemodel> scheduleData = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMyScheduleupcomingBinding.inflate(inflater, container, false);
        mContext = this;

        setScheduleInfo();
        setScheduleAdapter();

        return binding.getRoot();
    }


    private void setScheduleInfo() {


        scheduleData.add(new MySchedulemodel("abc","beginner","rajkot","alpha",
                "12:34","december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc","beginner","rajkot","alpha",
                "12:34","december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc","beginner","rajkot","alpha",
                "12:34","december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc","beginner","rajkot","alpha",
                "12:34","december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc","beginner","rajkot","alpha",
                "12:34","december 22,2022", 2));
    }

    private void setScheduleAdapter() {

        UpcomingScheduleAdapter adapter = new UpcomingScheduleAdapter(getActivity(),scheduleData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.myupcomingscheduleRV.setLayoutManager(layoutManager);
        binding.myupcomingscheduleRV.setAdapter(adapter);
    }

}