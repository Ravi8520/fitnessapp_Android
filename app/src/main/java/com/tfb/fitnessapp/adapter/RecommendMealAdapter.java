package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.BrowseHealthyDietsItemsBinding;
import com.tfb.fitnessapp.databinding.RecommendMealItemBinding;
import com.tfb.fitnessapp.models.SelectCitymodel;

import java.util.ArrayList;

public class RecommendMealAdapter extends RecyclerView.Adapter<RecommendMealAdapter.RecommendMealViewholder> {

    private Context mcontext;

    public RecommendMealAdapter(Context mcontext) {

        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public RecommendMealViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecommendMealItemBinding itemviewBinding = RecommendMealItemBinding.inflate(layoutInflater, parent, false);
        return new RecommendMealViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendMealViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }


    public class RecommendMealViewholder extends RecyclerView.ViewHolder {

        public RecommendMealItemBinding binding;

        public RecommendMealViewholder(@NonNull RecommendMealItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}

