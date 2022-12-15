package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.SelectSessionAdapter;
import com.tfb.fitnessapp.databinding.ActivitySelectSessionBinding;
import com.tfb.fitnessapp.models.SelectSessionmodel;

import java.util.ArrayList;

public class SelectSessionActivity extends AppCompatActivity {

    ActivitySelectSessionBinding binding;
    private Context mContext;
    ArrayList<SelectSessionmodel> selectSessionData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectSessionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setSelectSessioninfo();
        setSelectSessonAdapter();


    }

    private void setSelectSessioninfo() {

        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg1,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg2,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg3,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg1,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg2,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg3,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg1,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg2,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg3,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg1,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg2,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
        selectSessionData.add(new SelectSessionmodel(R.drawable.trainerimg3,"wellness","Breathe and Tune in","30 min","Meghan Clarke"));
    }


    private void setSelectSessonAdapter() {

        SelectSessionAdapter sessionAdapter = new SelectSessionAdapter(mContext,selectSessionData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.selectSessionRV.setLayoutManager(layoutManager);
        binding.selectSessionRV.setAdapter(sessionAdapter);

    }
}