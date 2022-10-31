package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.InjuriesAdapter;
import com.tfb.fitnessapp.activities.models.Injuriesmodel;
import com.tfb.fitnessapp.databinding.ActivityInjuriesBinding;

import java.util.ArrayList;

public class InjuriesActivity extends AppCompatActivity {

    private InjuriesActivity mContext;
    ActivityInjuriesBinding binding;

    private RecyclerView injuries_recyclerView;
    private ArrayList<Injuriesmodel> injuriesDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInjuriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        injuriesDataArrayList = new ArrayList<>();

        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_asthma),R.drawable.asthma));
        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_Fractures),R.drawable.fractures));
        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_joint_dislocation),R.drawable.joint_dislocation));
        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_sprains),R.drawable.sprains));
        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_tendonitis),R.drawable.tendonitis));
        injuriesDataArrayList.add(new Injuriesmodel(getResources().getString(R.string.lbl_Muscle_pulls),R.drawable.muscles_pulls));

        InjuriesAdapter adapter=new InjuriesAdapter(injuriesDataArrayList,this);

        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        binding.injuriesRV.setLayoutManager(layoutManager);
        binding.injuriesRV.setAdapter(adapter);

    }
}