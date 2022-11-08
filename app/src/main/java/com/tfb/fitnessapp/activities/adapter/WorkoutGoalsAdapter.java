package com.tfb.fitnessapp.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;

public class WorkoutGoalsAdapter extends RecyclerView.Adapter<WorkoutGoalsAdapter.WorkoutgoalsViewHolder> {

    Context context;

    public WorkoutGoalsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public WorkoutGoalsAdapter.WorkoutgoalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_workoutgoals_list, parent, false);
        return new WorkoutgoalsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutGoalsAdapter.WorkoutgoalsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class WorkoutgoalsViewHolder extends RecyclerView.ViewHolder {

        CheckBox checkBox;
        public WorkoutgoalsViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkb);
        }
    }
}
