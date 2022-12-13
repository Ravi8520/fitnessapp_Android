package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.WorkExperinceItemviewBinding;
import com.tfb.fitnessapp.models.WorkExperiencemodel;

import java.util.ArrayList;

public class WorkExperienceAdapter extends RecyclerView.Adapter<WorkExperienceAdapter.WorkExperienceViewholder> {

    private Context context;
    ArrayList<WorkExperiencemodel> workExperiencedatalist;

    public WorkExperienceAdapter(Context context, ArrayList<WorkExperiencemodel> workExperiencedata) {
        this.context = context;
        this.workExperiencedatalist = workExperiencedata;
    }

    @NonNull
    @Override
    public WorkExperienceViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        WorkExperinceItemviewBinding itemviewBinding = WorkExperinceItemviewBinding.inflate(layoutInflater,parent,false);
        return new WorkExperienceViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkExperienceViewholder holder, int position) {

        WorkExperiencemodel workXpModel = workExperiencedatalist.get(position);
        holder.binding.txtGymName.setText(workXpModel.getGymName());
        holder.binding.txtWorkExperience.setText(workXpModel.getWorkExperience());

    }

    @Override
    public int getItemCount() {
        return workExperiencedatalist.size();
    }

    public class WorkExperienceViewholder extends RecyclerView.ViewHolder {

        public WorkExperinceItemviewBinding binding;

        public WorkExperienceViewholder(WorkExperinceItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
