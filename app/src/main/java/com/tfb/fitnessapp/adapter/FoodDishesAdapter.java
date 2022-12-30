package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.FoodDishesItemviewBinding;

public class FoodDishesAdapter extends RecyclerView.Adapter<FoodDishesAdapter.FoodDishesViewholder> {

    private Context context;

    public FoodDishesAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FoodDishesAdapter.FoodDishesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        FoodDishesItemviewBinding itemviewBinding = FoodDishesItemviewBinding.inflate(layoutInflater,parent,false);

        return new FoodDishesViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodDishesAdapter.FoodDishesViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class FoodDishesViewholder extends RecyclerView.ViewHolder {

        public FoodDishesItemviewBinding binding;
        public FoodDishesViewholder(FoodDishesItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
