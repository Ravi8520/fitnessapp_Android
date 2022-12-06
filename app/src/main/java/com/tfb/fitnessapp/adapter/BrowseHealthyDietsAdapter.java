package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.BrowseHealthyDietsItemsBinding;
import com.tfb.fitnessapp.models.Sessionhistorymodel;

import java.util.ArrayList;

public class BrowseHealthyDietsAdapter extends RecyclerView.Adapter<BrowseHealthyDietsAdapter.BrowseHealthyDietsViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;
    private OnItemClickListener onItemClickListener;

    public BrowseHealthyDietsAdapter(Context mContext) {
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
    public BrowseHealthyDietsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        BrowseHealthyDietsItemsBinding itemviewBinding = BrowseHealthyDietsItemsBinding.inflate(layoutInflater, parent, false);
        return new BrowseHealthyDietsViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BrowseHealthyDietsViewholder holder, int position) {

        holder.binding.imgMoreOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class BrowseHealthyDietsViewholder extends RecyclerView.ViewHolder {

        public BrowseHealthyDietsItemsBinding binding;

        public BrowseHealthyDietsViewholder(@NonNull BrowseHealthyDietsItemsBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}