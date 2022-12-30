package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.FragmentMealmarcketfragmentBinding;


public class Mealmarcketfragment extends Fragment {

    private FragmentMealmarcketfragmentBinding binding;
    private  Context mContext;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMealmarcketfragmentBinding.inflate(inflater,container,false);




        return binding.getRoot();
    }
}