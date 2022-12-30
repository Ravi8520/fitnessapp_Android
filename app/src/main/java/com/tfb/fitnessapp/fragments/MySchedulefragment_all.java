package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.adapter.AllScheduleAdapter;
import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.databinding.FragmentMyScheduleallBinding;

import java.util.ArrayList;


public class MySchedulefragment_all extends Fragment {

    private FragmentMyScheduleallBinding binding;
    private Context mContext;
    ArrayList<MySchedulemodel> scheduleData = new ArrayList<>();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        binding =  FragmentMyScheduleallBinding.inflate(inflater, container, false);


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

        AllScheduleAdapter adapter = new AllScheduleAdapter(mContext,scheduleData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.allScheduleRV.setLayoutManager(layoutManager);
        binding.allScheduleRV.setAdapter(adapter);
    }
}