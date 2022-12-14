package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.GotoCatrItemBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class GoToCartAdapter extends RecyclerView.Adapter<GoToCartAdapter.GoToCartViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;

    public GoToCartAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public GoToCartViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        GotoCatrItemBinding itemviewBinding = GotoCatrItemBinding.inflate(layoutInflater, parent, false);
        return new GoToCartViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GoToCartViewholder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return 6;
    }
    public class GoToCartViewholder extends RecyclerView.ViewHolder {

        public GotoCatrItemBinding binding;

        public GoToCartViewholder(@NonNull GotoCatrItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
