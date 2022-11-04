package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.EquipmentsAdapters;
import com.tfb.fitnessapp.activities.adapter.InjuriesAdapter;
import com.tfb.fitnessapp.activities.models.Equipmentmodel;
import com.tfb.fitnessapp.activities.models.Injuriesmodel;
import com.tfb.fitnessapp.databinding.ActivityGymAccessBinding;

import java.util.ArrayList;

public class GymAccessActivity extends AppCompatActivity {

    private GymAccessActivity mContext;
    ActivityGymAccessBinding binding;

    private ArrayList<Equipmentmodel> equipmetsdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGymAccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,InviteLinkActivity.class));
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        equipmetsdata = new ArrayList<>();

        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));


        EquipmentsAdapters adapter = new EquipmentsAdapters(equipmetsdata,this);
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        binding.equipmentsRV.setLayoutManager(layoutManager);
        binding.equipmentsRV.setAdapter(adapter);


    }
}