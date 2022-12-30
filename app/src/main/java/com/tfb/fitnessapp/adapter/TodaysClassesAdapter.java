package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.TodaysClassesItemviewBinding;

public class TodaysClassesAdapter extends RecyclerView.Adapter<TodaysClassesAdapter.ClassesViewholder> {

    private Context mContext;


    public TodaysClassesAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ClassesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        TodaysClassesItemviewBinding itemviewBinding = TodaysClassesItemviewBinding.inflate(layoutInflater,parent,false);
        return new ClassesViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassesViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ClassesViewholder extends RecyclerView.ViewHolder {

        public TodaysClassesItemviewBinding binding;
        public ClassesViewholder(TodaysClassesItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
