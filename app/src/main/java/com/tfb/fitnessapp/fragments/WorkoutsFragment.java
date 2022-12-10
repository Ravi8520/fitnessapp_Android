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

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.AllScheduleAdapter;
import com.tfb.fitnessapp.databinding.FragmentWorkoutsBinding;
import com.tfb.fitnessapp.models.MySchedulemodel;

import java.util.ArrayList;


public class WorkoutsFragment extends Fragment {

    private FragmentWorkoutsBinding binding;
    private Context mContext;
    ArrayList<MySchedulemodel> scheduleData = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_workouts, container, false);

        recyclerView=view.findViewById(R.id.allSchedule_RV);
        setScheduleInfo();
        //setScheduleAdapter();
        AllScheduleAdapter adapter = new AllScheduleAdapter(mContext, scheduleData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
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


    }
}