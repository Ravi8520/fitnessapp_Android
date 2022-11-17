package com.tfb.fitnessapp.activities.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tfb.fitnessapp.activities.fragments.MySchedulefragment_all;
import com.tfb.fitnessapp.activities.fragments.MySchedulefragment_upcoming;

public class MyScheduleAdapter extends FragmentPagerAdapter {

    int selected_Tab;

    public MyScheduleAdapter(@NonNull FragmentManager fm , int behavior) {
        super(fm , behavior);

        selected_Tab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new MySchedulefragment_upcoming();
            case 1 : return new MySchedulefragment_all();


            default: return null;

        }
    }

    @Override
    public int getCount() {
        return selected_Tab;
    }
}
