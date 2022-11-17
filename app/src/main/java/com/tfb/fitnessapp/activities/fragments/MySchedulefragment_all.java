package com.tfb.fitnessapp.activities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.FragmentMyScheduleallBinding;


public class MySchedulefragment_all extends Fragment {

    private FragmentMyScheduleallBinding binding;
    private MySchedulefragment_all mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        binding =  FragmentMyScheduleallBinding.inflate(inflater, container, false);
        mContext = this;

        binding.txt.setText("fragment All");

        return binding.getRoot();

    }
}