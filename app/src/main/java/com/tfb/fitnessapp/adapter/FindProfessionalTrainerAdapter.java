package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.activities.BookProfessionalTrainerActivity;
import com.tfb.fitnessapp.activities.SearchforBookTrainerActivity;
import com.tfb.fitnessapp.databinding.ProfessionalTrainerItemviewBinding;

public class FindProfessionalTrainerAdapter extends RecyclerView.Adapter<FindProfessionalTrainerAdapter.ProfessionalTrainerViewholder> {

    private Context mContext;

    public FindProfessionalTrainerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FindProfessionalTrainerAdapter.ProfessionalTrainerViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ProfessionalTrainerItemviewBinding itemviewBinding = ProfessionalTrainerItemviewBinding.inflate(layoutInflater,parent,false);
        return new ProfessionalTrainerViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FindProfessionalTrainerAdapter.ProfessionalTrainerViewholder holder, int position) {

        holder.binding.btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, BookProfessionalTrainerActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ProfessionalTrainerViewholder extends RecyclerView.ViewHolder {

        public ProfessionalTrainerItemviewBinding binding;

        public ProfessionalTrainerViewholder(ProfessionalTrainerItemviewBinding itemView) {
            super(itemView.getRoot());

            this.binding = itemView;
        }
    }
}
