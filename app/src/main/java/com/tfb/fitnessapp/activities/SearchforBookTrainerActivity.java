package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.tfb.fitnessapp.adapter.FoodDishesAdapter;
import com.tfb.fitnessapp.adapter.LiveSessionAdapter;
import com.tfb.fitnessapp.adapter.SearchforBookTrainerAdapter;
import com.tfb.fitnessapp.adapter.TrainersAdapter;
import com.tfb.fitnessapp.databinding.ActivitySearchforBookTrainerBinding;
import com.tfb.fitnessapp.databinding.LiveSessionsItemviewBinding;

public class SearchforBookTrainerActivity extends AppCompatActivity {

    private SearchforBookTrainerActivity mContext;
    ActivitySearchforBookTrainerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchforBookTrainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setSearchCategoryAdapter();
        setTrainersAdapter();
        setLiveSessionsAdapter();
        setFoodDishesAdapter();
    }




    private void setTrainersAdapter() {

        TrainersAdapter adapter = new TrainersAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        binding.trainerDetailRV.setLayoutManager(layoutManager);
        binding.trainerDetailRV.setAdapter(adapter);
    }

    private void setSearchCategoryAdapter() {


        SearchforBookTrainerAdapter adapter = new SearchforBookTrainerAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        binding.searchCategoryRV.setLayoutManager(layoutManager);
        binding.searchCategoryRV.setAdapter(adapter);
    }

    private void setLiveSessionsAdapter() {

        LiveSessionAdapter adapter = new LiveSessionAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        binding.liveSessionsRV.setLayoutManager(layoutManager);
        binding.liveSessionsRV.setAdapter(adapter);

    }

    private void setFoodDishesAdapter() {

        FoodDishesAdapter adapter = new FoodDishesAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        binding.foodDishesRV.setLayoutManager(layoutManager);
        binding.foodDishesRV.setAdapter(adapter);
    }
}