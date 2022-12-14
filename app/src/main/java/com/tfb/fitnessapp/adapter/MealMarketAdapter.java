package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.MealmarketItmeBinding;
import com.tfb.fitnessapp.databinding.SessionhistoryItemviewBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class MealMarketAdapter extends RecyclerView.Adapter<MealMarketAdapter.SearchMealViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;

    public MealMarketAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SearchMealViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MealmarketItmeBinding itemviewBinding = MealmarketItmeBinding.inflate(layoutInflater,parent,false);
        return new SearchMealViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchMealViewholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class SearchMealViewholder extends RecyclerView.ViewHolder {

        public MealmarketItmeBinding binding;

        public SearchMealViewholder(@NonNull MealmarketItmeBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}