package com.tfb.fitnessapp.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;

public class SpecialBenefitsAdapter extends RecyclerView.Adapter<SpecialBenefitsAdapter.specialbenefitsViewHolder> {

    Context context;

    public SpecialBenefitsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SpecialBenefitsAdapter.specialbenefitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custome_details_list,parent,false);
        return new specialbenefitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialBenefitsAdapter.specialbenefitsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class specialbenefitsViewHolder extends RecyclerView.ViewHolder {


        AppCompatTextView txt_detailsdata, txt_detailsno;

        public specialbenefitsViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_detailsdata = itemView.findViewById(R.id.txt_detailsdata);
            txt_detailsno = itemView.findViewById(R.id.txt_detailsno);

        }
    }
}
