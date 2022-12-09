package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.FoodfilterCategoryItemBinding;
public class FoodFilterCategoryAdapter extends RecyclerView.Adapter<FoodFilterCategoryAdapter.MealMarketViewholder> {

    Context mContext;
    private int isselected = -1;

    public FoodFilterCategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MealMarketViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        FoodfilterCategoryItemBinding itemviewBinding = FoodfilterCategoryItemBinding.inflate(layoutInflater, parent, false);
        return new MealMarketViewholder(itemviewBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull MealMarketViewholder holder, int position) {

        if (isselected == position) {
            holder.binding.radioButton.setChecked(true);
        } else {
            holder.binding.radioButton.setChecked(false);
        }

        holder.binding.radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isselected = holder.getAdapterPosition();
                notifyDataSetChanged();
            }
        });
       /* holder.binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                isselected = holder.getAdapterPosition();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MealMarketViewholder extends RecyclerView.ViewHolder {

        public FoodfilterCategoryItemBinding binding;

        public MealMarketViewholder(@NonNull FoodfilterCategoryItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
