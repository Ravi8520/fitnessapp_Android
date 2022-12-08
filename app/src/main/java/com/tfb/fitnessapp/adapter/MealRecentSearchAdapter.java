package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.RecentSearchMealItemBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class MealRecentSearchAdapter extends RecyclerView.Adapter<MealRecentSearchAdapter.MealRecentSearViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;
    private OnItemClickListener onItemClickListener;

    public MealRecentSearchAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener myClickListener) {
        this.onItemClickListener = myClickListener;
    }

    @NonNull
    @Override
    public MealRecentSearViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecentSearchMealItemBinding itemviewBinding = RecentSearchMealItemBinding.inflate(layoutInflater, parent, false);
        return new MealRecentSearViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MealRecentSearViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MealRecentSearViewholder extends RecyclerView.ViewHolder {

        public RecentSearchMealItemBinding binding;

        public MealRecentSearViewholder(@NonNull RecentSearchMealItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}