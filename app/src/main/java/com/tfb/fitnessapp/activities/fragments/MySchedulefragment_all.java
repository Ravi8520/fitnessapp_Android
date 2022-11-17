package com.tfb.fitnessapp.activities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.AllScheduleAdapter;
import com.tfb.fitnessapp.activities.adapter.UpcomingScheduleAdapter;
import com.tfb.fitnessapp.activities.models.MySchedulemodel;
import com.tfb.fitnessapp.databinding.FragmentMyScheduleallBinding;

import java.util.ArrayList;


public class MySchedulefragment_all extends Fragment {

    private FragmentMyScheduleallBinding binding;
    private MySchedulefragment_all mContext;
    ArrayList<MySchedulemodel> scheduleData = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        binding =  FragmentMyScheduleallBinding.inflate(inflater, container, false);
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

        AllScheduleAdapter adapter = new AllScheduleAdapter(getActivity(),scheduleData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.allScheduleRV.setLayoutManager(layoutManager);
        binding.allScheduleRV.setAdapter(adapter);
    }
}