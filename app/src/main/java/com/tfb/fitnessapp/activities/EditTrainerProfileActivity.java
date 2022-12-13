package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.WorkExperienceAdapter;
import com.tfb.fitnessapp.databinding.ActivityEditTrainerProfileBinding;
import com.tfb.fitnessapp.models.WorkExperiencemodel;

import java.util.ArrayList;
import java.util.List;

public class EditTrainerProfileActivity extends AppCompatActivity {

    ActivityEditTrainerProfileBinding binding;
    private EditTrainerProfileActivity mContext;
    ArrayList<WorkExperiencemodel> workExperiencedata= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityEditTrainerProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        List<String> categories = new ArrayList<String>();
        categories.add("Male");
        categories.add("Female");
        categories.add("Others");

        binding.spinnerGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,R.id.txt_name, categories);
        dataAdapter.setDropDownViewResource(R.layout.spinner_listitem);
        binding.spinnerGender.setAdapter(dataAdapter);


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setWorkExperienceinfo();
        setWorkExperienceAdapter();
    }

    private void setWorkExperienceinfo() {

        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));
        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));
        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));
        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));
        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));
        workExperiencedata.add(new WorkExperiencemodel("XYZ GYM","Fitness Trainer, 2 Years"));

    }
    private void setWorkExperienceAdapter() {

        WorkExperienceAdapter workXpAdapter = new WorkExperienceAdapter(mContext,workExperiencedata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.workExperienceRV.setLayoutManager(layoutManager);
        binding.workExperienceRV.setAdapter(workXpAdapter);

    }

}