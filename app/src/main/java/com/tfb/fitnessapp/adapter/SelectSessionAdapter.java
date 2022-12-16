package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.activities.BookSessionActivity;
import com.tfb.fitnessapp.databinding.SelectSessionItemviewBinding;
import com.tfb.fitnessapp.models.SelectSessionmodel;

import java.util.ArrayList;

public class SelectSessionAdapter extends RecyclerView.Adapter<SelectSessionAdapter.sessionViewholder> {

    Context mcontext;
    ArrayList<SelectSessionmodel> selectSessionlist;

    public SelectSessionAdapter(Context mcontext, ArrayList<SelectSessionmodel> selectSessiondata) {
        this.mcontext = mcontext;
        this.selectSessionlist = selectSessiondata;
    }

    @NonNull
    @Override
    public sessionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SelectSessionItemviewBinding itemviewBinding = SelectSessionItemviewBinding.inflate(layoutInflater,parent,false);
        return new sessionViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull sessionViewholder holder, int position) {

        SelectSessionmodel sessionmodel = selectSessionlist.get(position);
        holder.binding.profilePic.setImageResource(sessionmodel.getTrainerimg());
        holder.binding.txtSessionName.setText(sessionmodel.getSession_name());
        holder.binding.txtSessionTime.setText(sessionmodel.getSessionTime());
        holder.binding.txtYogaName.setText(sessionmodel.getYogaName());
        holder.binding.txtTrainerName.setText(sessionmodel.getTrainerName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mcontext, BookSessionActivity.class);
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return selectSessionlist.size();
    }

    public class sessionViewholder extends RecyclerView.ViewHolder {

        public SelectSessionItemviewBinding binding;

        public sessionViewholder(SelectSessionItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
