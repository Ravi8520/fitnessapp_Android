package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.PopularTrainersItemviewBinding;

public class PopularTrainerAdapter extends RecyclerView.Adapter<PopularTrainerAdapter.PopularTrainerViewholder> {

    private Context mContext;

    public PopularTrainerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public PopularTrainerViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        PopularTrainersItemviewBinding itemviewBinding = PopularTrainersItemviewBinding.inflate(layoutInflater);
        return new PopularTrainerViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularTrainerViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class PopularTrainerViewholder extends RecyclerView.ViewHolder {
        public PopularTrainersItemviewBinding binding;
        public PopularTrainerViewholder(PopularTrainersItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
