package com.tfb.fitnessapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.FragmentDemosBinding;


public class DemosFragment extends Fragment {

    private DemosFragment mContext;
    private FragmentDemosBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDemosBinding.inflate(inflater,container,false);
        mContext = this;




        return binding.getRoot();
    }
}