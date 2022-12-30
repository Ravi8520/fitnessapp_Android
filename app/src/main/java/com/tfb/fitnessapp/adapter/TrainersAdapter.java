package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.TrainersDetailItemviewBinding;

public class TrainersAdapter extends RecyclerView.Adapter<TrainersAdapter.TrainersViewholder> {

    private Context mContext;

    public TrainersAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public TrainersViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        TrainersDetailItemviewBinding itemviewBinding = TrainersDetailItemviewBinding.inflate(layoutInflater,parent,false);
        return new TrainersViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainersViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class TrainersViewholder extends RecyclerView.ViewHolder {

        public TrainersDetailItemviewBinding binding;
        public TrainersViewholder(TrainersDetailItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
