package com.tfb.fitnessapp.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.models.Equipmentmodel;
import com.tfb.fitnessapp.activities.models.Injuriesmodel;

import java.util.ArrayList;

public class EquipmentsAdapters extends RecyclerView.Adapter<EquipmentsAdapters.equipmentViewholder> {

    private ArrayList<Equipmentmodel> equipmentArraylist;
    private Context mcontext;

    public EquipmentsAdapters(ArrayList<Equipmentmodel> equipmentArraylist, Context mcontext) {
        this.equipmentArraylist = equipmentArraylist;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public EquipmentsAdapters.equipmentViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.equipment_itemview,parent,false);
        return new equipmentViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipmentsAdapters.equipmentViewholder holder, int position) {


        Equipmentmodel equipmentData = equipmentArraylist.get(position);
        holder.equipmentsTV.setText(equipmentData.getTitle());
        holder.equipmentsIV.setImageResource(equipmentData.getImgid());
    }

    @Override
    public int getItemCount() {
        return equipmentArraylist.size();
    }

    public class equipmentViewholder extends RecyclerView.ViewHolder {

        private ImageView equipmentsIV;
        private AppCompatTextView equipmentsTV;

        public equipmentViewholder(@NonNull View itemView) {
            super(itemView);

            equipmentsIV = itemView.findViewById(R.id.equipmentsIV);
            equipmentsTV = itemView.findViewById(R.id.equipmentsTV);
        }
    }
}
