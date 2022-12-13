package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.TrainerworkoutsItemviewBinding;
import com.tfb.fitnessapp.models.MySchedulemodel;
import com.tfb.fitnessapp.models.WorkoutProgramsmodel;

import java.util.ArrayList;

public class TrainerWorkoutsAdapter extends RecyclerView.Adapter<TrainerWorkoutsAdapter.WorkoutViewholder>{

    Context mContext;
    ArrayList<WorkoutProgramsmodel> workoutsListdata;

    public TrainerWorkoutsAdapter(Context mContext, ArrayList<WorkoutProgramsmodel> workoutsListdata) {
        this.mContext = mContext;
        this.workoutsListdata = workoutsListdata;
    }

    @NonNull
    @Override
    public WorkoutViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        TrainerworkoutsItemviewBinding itemviewBinding = TrainerworkoutsItemviewBinding.inflate(layoutInflater,parent,false);

        return new WorkoutViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewholder holder, int position) {
        WorkoutProgramsmodel workoutProgramsmodel = workoutsListdata.get(position);
        holder.binding.txtProgram.setText(workoutProgramsmodel.getProgram());
        holder.binding.txtCalaryCount.setText(workoutProgramsmodel.getCalary_count());
    }

    @Override
    public int getItemCount() {
        return workoutsListdata.size();
    }

    public class WorkoutViewholder extends RecyclerView.ViewHolder {

        public  TrainerworkoutsItemviewBinding binding;

        public WorkoutViewholder(TrainerworkoutsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
