package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.activities.MyScheduleDetailsActivity;
import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.databinding.MyscheduleItemviewBinding;

import java.util.ArrayList;

public class UpcomingScheduleAdapter extends RecyclerView.Adapter<UpcomingScheduleAdapter.ScheduleViewholder> {

    Context mContext;
    ArrayList<MySchedulemodel> scheduleList;

    public UpcomingScheduleAdapter(Context mContext, ArrayList<MySchedulemodel> scheduleList) {
        this.mContext = mContext;
        this.scheduleList = scheduleList;
    }

    @NonNull
    @Override
    public UpcomingScheduleAdapter.ScheduleViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MyscheduleItemviewBinding itemCardBinding = MyscheduleItemviewBinding.inflate(layoutInflater, parent, false);
        return new ScheduleViewholder(itemCardBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingScheduleAdapter.ScheduleViewholder holder, int position) {
        MySchedulemodel mySchedulemodel = scheduleList.get(position);
        holder.binding.txtDate.setText(mySchedulemodel.getDate());
        holder.binding.txtExperience.setText(mySchedulemodel.getExperience());
        holder.binding.txtMapAddress.setText(mySchedulemodel.getMapAddress());
        holder.binding.txtExerciseType.setText(mySchedulemodel.getExerciseType());
        holder.binding.txtSlotTime.setText(mySchedulemodel.getSlotTime());
        holder.binding.txtName.setText(mySchedulemodel.getUsername());

        holder.binding.btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MyScheduleDetailsActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }

    public class ScheduleViewholder extends RecyclerView.ViewHolder {

        public MyscheduleItemviewBinding binding;

        public ScheduleViewholder(MyscheduleItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;

        }
    }
}
