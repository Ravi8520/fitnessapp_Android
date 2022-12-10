package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.databinding.MyscheduleItemviewBinding;

import java.util.ArrayList;

public class AllScheduleAdapter extends RecyclerView.Adapter<AllScheduleAdapter.AllScheduleViewholder> {

    Context mContext;
    ArrayList<MySchedulemodel> scheduleList;

    public AllScheduleAdapter(Context context, ArrayList<MySchedulemodel> scheduleList) {
        this.mContext = context;
        this.scheduleList = scheduleList;
    }

    @NonNull
    @Override
    public AllScheduleViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MyscheduleItemviewBinding itemCardBinding = MyscheduleItemviewBinding.inflate(layoutInflater, parent, false);
        return new AllScheduleViewholder(itemCardBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AllScheduleViewholder holder, int position) {

        MySchedulemodel mySchedulemodel = scheduleList.get(position);
        holder.binding.txtDate.setText(mySchedulemodel.getDate());
        holder.binding.txtExperience.setText(mySchedulemodel.getExperience());
        holder.binding.txtMapAddress.setText(mySchedulemodel.getMapAddress());
        holder.binding.txtExerciseType.setText(mySchedulemodel.getExerciseType());
        holder.binding.txtSlotTime.setText(mySchedulemodel.getSlotTime());
        holder.binding.txtName.setText(mySchedulemodel.getUsername());

    }

    @Override
    public int getItemCount() {
        Log.e("scheduleList","scheduleList=="+scheduleList.size());
        return scheduleList.size();
    }

    public class AllScheduleViewholder extends RecyclerView.ViewHolder {
        MyscheduleItemviewBinding binding;
        public AllScheduleViewholder(MyscheduleItemviewBinding itemView) {
            super(itemView.getRoot());

            this.binding = itemView;
        }
    }
}
