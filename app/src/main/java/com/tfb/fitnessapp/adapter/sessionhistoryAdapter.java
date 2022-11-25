package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.models.Sessionhistorymodel;
import com.tfb.fitnessapp.databinding.SessionhistoryItemviewBinding;

import java.util.ArrayList;

public class sessionhistoryAdapter extends RecyclerView.Adapter<sessionhistoryAdapter.sessionViewholder> {

    Context mContext;
    ArrayList<Sessionhistorymodel> sessiondataList;

    public sessionhistoryAdapter(Context mContext, ArrayList<Sessionhistorymodel> sessiondataList) {
        this.mContext = mContext;
        this.sessiondataList = sessiondataList;
    }

    @NonNull
    @Override
    public sessionhistoryAdapter.sessionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SessionhistoryItemviewBinding itemviewBinding = SessionhistoryItemviewBinding.inflate(layoutInflater,parent,false);
        return new sessionViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull sessionhistoryAdapter.sessionViewholder holder, int position) {

        Sessionhistorymodel sessionhistorymodel = sessiondataList.get(position);
        holder.binding.txtAttendance.setText(sessionhistorymodel.getAttendance());
        holder.binding.txtSessionTime.setText(sessionhistorymodel.getSessionTime());
        holder.binding.txtSessionUser.setText(sessionhistorymodel.getSessionUser());
        holder.binding.txtSetLocation.setText(sessionhistorymodel.getSessionLocation());
        holder.binding.txtAddress.setText(sessionhistorymodel.getSessionAddress());
        holder.binding.txtAttendanceDate.setText(sessionhistorymodel.getAttendanceDate());
        holder.binding.txtArrivalTime.setText(sessionhistorymodel.getArrivalTime());

    }

    @Override
    public int getItemCount() {
        return sessiondataList.size();
    }

    public class sessionViewholder extends RecyclerView.ViewHolder {

        public SessionhistoryItemviewBinding binding;

        public sessionViewholder(@NonNull SessionhistoryItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
