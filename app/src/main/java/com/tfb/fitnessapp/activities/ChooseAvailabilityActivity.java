package com.tfb.fitnessapp.activities;

import android.content.Intent;
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
        mContext = this;


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext , ChooseTimeSlotsActivity.class));
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

                }
                flag =true;
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

        binding.txtWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    flag = false;
                    binding.txtWednesday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtWednesday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtWednesday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtWednesday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;
                }
            }
        });

        binding.txtThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    flag = false;
                    binding.txtThursday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtThursday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtThursday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtThursday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;
                }
            }
        });

        binding.txtFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    flag = false;
                    binding.txtFriday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtFriday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtFriday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtFriday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;
                }
            }
        });

        binding.txtSaturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    flag = false;
                    binding.txtSaturday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtSaturday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtSaturday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtSaturday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;
                }
            }
        });

        binding.txtSunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    flag = false;
                    binding.txtSunday.setBackground(getResources().getDrawable(R.drawable.coustom_button_border));
                    binding.txtSunday.setTextColor(getResources().getColor(R.color.black));
                } else {
                    binding.txtSunday.setBackground(getResources().getDrawable(R.drawable.custome_edittext));
                    binding.txtSunday.setTextColor(getResources().getColor(R.color.white));
                    flag = true;
                }
            }
        });
    }
}