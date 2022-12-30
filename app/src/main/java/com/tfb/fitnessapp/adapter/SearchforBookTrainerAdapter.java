package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.ClientsGoalsItemviewBinding;

public class SearchforBookTrainerAdapter extends RecyclerView.Adapter<SearchforBookTrainerAdapter.SearchforBooktrainerViewHolder> {

    private Context mContext;

    public SearchforBookTrainerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SearchforBooktrainerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ClientsGoalsItemviewBinding itemviewBinding = ClientsGoalsItemviewBinding.inflate(layoutInflater,parent,false);
        return new SearchforBooktrainerViewHolder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchforBooktrainerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class SearchforBooktrainerViewHolder extends RecyclerView.ViewHolder {

        public ClientsGoalsItemviewBinding binding;

        public SearchforBooktrainerViewHolder(ClientsGoalsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
