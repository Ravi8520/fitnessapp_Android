package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tfb.fitnessapp.adapter.AllScheduleAdapter;
import com.tfb.fitnessapp.databinding.FragmentWorkoutsBinding;
import com.tfb.fitnessapp.models.MySchedulemodel;

import java.util.ArrayList;


public class WorkoutsFragment extends Fragment {

    private FragmentWorkoutsBinding binding;
    private Context mContext;
    ArrayList<MySchedulemodel> scheduleData = new ArrayList<>();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWorkoutsBinding.inflate(getLayoutInflater());


        setScheduleInfo();
        setScheduleAdapter();



        Log.e("abc", "abc==");
        return binding.getRoot();
    }

    private void setScheduleInfo() {

        scheduleData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
        scheduleData.add(new MySchedulemodel("abc", "beginner", "rajkot", "alpha",
                "12:34", "december 22,2022", 2));
    }

    private void setScheduleAdapter() {

        AllScheduleAdapter adapter = new AllScheduleAdapter(mContext, scheduleData);
        binding.allScheduleRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.allScheduleRV.setAdapter(adapter);
    }
}