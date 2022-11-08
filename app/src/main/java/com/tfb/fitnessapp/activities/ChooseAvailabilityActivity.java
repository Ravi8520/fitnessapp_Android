package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityChooseAvailabilityBinding;

public class ChooseAvailabilityActivity extends AppCompatActivity {


    ActivityChooseAvailabilityBinding binding;
    private ChooseAvailabilityActivity mContext;

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseAvailabilityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.txtMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag) {

                    flag = false;
                    binding.txtMonday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtMonday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtMonday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtMonday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;

                }
            }
        });
        binding.txtTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag) {

                    flag = false;
                     binding.txtTuesday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                     binding.txtTuesday.setTextColor(getResources().getColor(R.color.black));
                } else {

                     binding.txtTuesday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                     binding.txtTuesday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;

                }
            }
        });


    }
}