package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.MealmarketItmeBinding;
import com.tfb.fitnessapp.databinding.SearchMealItemsBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class SearchMealAdapter extends RecyclerView.Adapter<SearchMealAdapter.SearchMealViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;

    public SearchMealAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SearchMealViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SearchMealItemsBinding itemviewBinding = SearchMealItemsBinding.inflate(layoutInflater, parent, false);
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

        public SearchMealItemsBinding binding;

        public SearchMealViewholder(@NonNull SearchMealItemsBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
