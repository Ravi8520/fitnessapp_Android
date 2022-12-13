package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.CartSelectedFoodItemBinding;
import com.tfb.fitnessapp.databinding.GotoCatrItemBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class CartSelectedFoodAdapter extends RecyclerView.Adapter<CartSelectedFoodAdapter.CartSelectedFoodViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;

    public CartSelectedFoodAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CartSelectedFoodViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CartSelectedFoodItemBinding itemviewBinding = CartSelectedFoodItemBinding.inflate(layoutInflater, parent, false);
        return new CartSelectedFoodViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CartSelectedFoodViewholder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return 3;
    }
    public class CartSelectedFoodViewholder extends RecyclerView.ViewHolder {

        public CartSelectedFoodItemBinding binding;

        public CartSelectedFoodViewholder(@NonNull CartSelectedFoodItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}

