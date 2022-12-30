package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.FragmentClientHomescreenfragmentBinding;

import java.net.ContentHandler;


public class ClientHomescreenfragment extends Fragment {

    private FragmentClientHomescreenfragmentBinding binding;
    private Context mContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentClientHomescreenfragmentBinding.inflate(inflater,container,false);




        return binding.getRoot();
    }
}