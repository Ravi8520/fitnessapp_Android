package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityPercentageDiscountsDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class PercentageDiscountsDetailsActivity extends AppCompatActivity {

    ActivityPercentageDiscountsDetailsBinding binding;
    private PercentageDiscountsDetailsActivity mCOntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPercentageDiscountsDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mCOntext = this;

        shownewClientDiscount();
        showrecurringClientDiscount();

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnSaveContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mCOntext,PricingActivity.class));
            }
        });

    }

    private void shownewClientDiscount() {

        List<String> newDiscount = new ArrayList<String>();
        newDiscount.add("5%");
        newDiscount.add("10%");
        newDiscount.add("15%");
        newDiscount.add("20%");
        newDiscount.add("25%");
        newDiscount.add("30%");
        newDiscount.add("35%");

        binding.newClientSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,R.id.txt_name, newDiscount);
        dataAdapter.setDropDownViewResource(R.layout.spinner_listitem);
        binding.newClientSpin.setAdapter(dataAdapter);

    }

    private void showrecurringClientDiscount() {

        List<String> recurringDiscount = new ArrayList<String>();
        recurringDiscount.add("2%");
        recurringDiscount.add("4%");
        recurringDiscount.add("6%");
        recurringDiscount.add("8%");
        recurringDiscount.add("10%");
        recurringDiscount.add("12%");
        recurringDiscount.add("14%");

        binding.recurringClientSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item,R.id.txt_name, recurringDiscount);
        dataAdapter2.setDropDownViewResource(R.layout.spinner_listitem);
        binding.recurringClientSpin.setAdapter(dataAdapter2);
    }
}