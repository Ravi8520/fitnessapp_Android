package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.activities.BookingActivity;
import com.tfb.fitnessapp.databinding.ActivityAndRecordsItemviewBinding;
import com.tfb.fitnessapp.models.ActivitiesandRecordsmodel;

import java.util.ArrayList;

public class ActivitiesAndReportsAdapter extends RecyclerView.Adapter<ActivitiesAndReportsAdapter.recordViewholder> {

    Context context;
    ArrayList<ActivitiesandRecordsmodel> recordlist;

    public ActivitiesAndReportsAdapter(Context context, ArrayList<ActivitiesandRecordsmodel> recordlist) {
        this.context = context;
        this.recordlist = recordlist;
    }

    @NonNull
    @Override
    public ActivitiesAndReportsAdapter.recordViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ActivityAndRecordsItemviewBinding itemviewBinding = ActivityAndRecordsItemviewBinding.inflate(layoutInflater,parent,false);
        return new recordViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivitiesAndReportsAdapter.recordViewholder holder, int position) {

        ActivitiesandRecordsmodel activitiesandRecordsmodel = recordlist.get(position);
        holder.binding.txtMonth.setText(activitiesandRecordsmodel.getMonth());
        holder.binding.txtDate.setText(activitiesandRecordsmodel.getDate());
        holder.binding.txtTotalExercises.setText(activitiesandRecordsmodel.getExcercises());
        holder.binding.txtRecentExercices.setText(activitiesandRecordsmodel.getRecentexcercises());

        holder.binding.btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BookingActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recordlist.size();
    }

    public class recordViewholder extends RecyclerView.ViewHolder {

        public ActivityAndRecordsItemviewBinding binding;

        public recordViewholder(ActivityAndRecordsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
