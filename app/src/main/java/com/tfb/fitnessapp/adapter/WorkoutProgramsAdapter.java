package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.models.WorkoutProgramsmodel;
import com.tfb.fitnessapp.databinding.WorkoutprogramsItemviewBinding;

import java.util.ArrayList;

public class WorkoutProgramsAdapter extends RecyclerView.Adapter<WorkoutProgramsAdapter.ProgramViewholder> {

    Context mContext;
    ArrayList<WorkoutProgramsmodel> workoutprogramList;

    public WorkoutProgramsAdapter(Context mContext, ArrayList<WorkoutProgramsmodel> workoutprogramList) {
        this.mContext = mContext;
        this.workoutprogramList = workoutprogramList;
    }

    @NonNull
    @Override
    public ProgramViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        WorkoutprogramsItemviewBinding itemviewBinding = WorkoutprogramsItemviewBinding.inflate(layoutInflater, parent, false);
        return new ProgramViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewholder holder, int position) {

        WorkoutProgramsmodel workoutProgramsmodel = workoutprogramList.get(position);
        holder.binding.txtProgram.setText(workoutProgramsmodel.getProgram());
        holder.binding.txtCalaryCount.setText(workoutProgramsmodel.getCalary_count());

    }

    @Override
    public int getItemCount() {
        return workoutprogramList.size();
    }

    public class ProgramViewholder extends RecyclerView.ViewHolder {

        public WorkoutprogramsItemviewBinding binding;

        public ProgramViewholder(@NonNull WorkoutprogramsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
