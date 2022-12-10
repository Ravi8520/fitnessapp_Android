package com.tfb.fitnessapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tfb.fitnessapp.fragments.DemosFragment;
import com.tfb.fitnessapp.fragments.MySchedulefragment_all;
import com.tfb.fitnessapp.fragments.MySchedulefragment_upcoming;
import com.tfb.fitnessapp.fragments.WorkoutsFragment;

public class TrainerViewProfilepageAdapter extends FragmentPagerAdapter {

    int selected_Tab;

    public TrainerViewProfilepageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        selected_Tab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new WorkoutsFragment();
            case 1 : return new DemosFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return selected_Tab;
    }
}
