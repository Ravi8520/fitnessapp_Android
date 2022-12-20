package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.ClientsGoalsItemviewBinding;
import com.tfb.fitnessapp.models.Goalsmodel;

import java.util.ArrayList;

public class GoalsAdapter extends RecyclerView.Adapter<GoalsAdapter.GoalsItemViewholder> {
    Context context;
    ArrayList<Goalsmodel> clientsGoalslist;

    public GoalsAdapter(Context context, ArrayList<Goalsmodel> clientsGoalsdata) {
        this.context = context;
        this.clientsGoalslist = clientsGoalsdata;
    }

    @NonNull
    @Override
    public GoalsItemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ClientsGoalsItemviewBinding itemviewBinding = ClientsGoalsItemviewBinding.inflate(layoutInflater,parent,false);
        return new GoalsItemViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GoalsItemViewholder holder, int position) {

        Goalsmodel goalsmodel = clientsGoalslist.get(position);
        holder.binding.txtClientGoals.setText(goalsmodel.getClientsGoals());

    }

    @Override
    public int getItemCount() {
        return clientsGoalslist.size();
    }

    public class GoalsItemViewholder extends RecyclerView.ViewHolder {

        public ClientsGoalsItemviewBinding binding;
        public GoalsItemViewholder(ClientsGoalsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
