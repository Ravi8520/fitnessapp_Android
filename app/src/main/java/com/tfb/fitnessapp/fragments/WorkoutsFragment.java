package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.AllScheduleAdapter;
import com.tfb.fitnessapp.adapter.TrainerWorkoutsAdapter;
import com.tfb.fitnessapp.databinding.FragmentWorkoutsBinding;
import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.models.WorkoutProgramsmodel;

import java.util.ArrayList;


public class WorkoutsFragment extends Fragment {

    private FragmentWorkoutsBinding binding;
    private Context mContext;
    ArrayList<WorkoutProgramsmodel> workoutsData = new ArrayList<>();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentWorkoutsBinding.inflate(inflater,container,false);

        setWorkoutsInfo();
        setWorkoutsAdapter();


        return binding.getRoot();
    }

    private void setWorkoutsInfo() {

        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("Merengue", "300-600Kcal"));
        workoutsData.add(new WorkoutProgramsmodel("abc", "beginner"));
        workoutsData.add(new WorkoutProgramsmodel("abc", "beginner"));
        workoutsData.add(new WorkoutProgramsmodel("abc", "beginner"));
        workoutsData.add(new WorkoutProgramsmodel("abc", "beginner"));
        workoutsData.add(new WorkoutProgramsmodel("abc", "beginner"));

    }

    private void setWorkoutsAdapter() {

        TrainerWorkoutsAdapter adapter = new TrainerWorkoutsAdapter(mContext,workoutsData);
        binding.workoutsRV.setLayoutManager(new GridLayoutManager(mContext,3));
        binding.workoutsRV.setAdapter(adapter);
    }
}