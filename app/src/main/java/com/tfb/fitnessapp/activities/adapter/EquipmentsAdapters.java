package com.tfb.fitnessapp.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.models.Equipmentmodel;

import java.util.ArrayList;

public class EquipmentsAdapters extends RecyclerView.Adapter<EquipmentsAdapters.equipmentViewholder> {

    private ArrayList<Equipmentmodel> equipmentArraylist;
    private Context mcontext;
    int pos = -1;
    boolean isSelected=false;
    private ArrayList<Equipmentmodel> selectedarrayList =new ArrayList<>();

    public EquipmentsAdapters(ArrayList<Equipmentmodel> equipmentArraylist, Context mcontext) {
        this.equipmentArraylist = equipmentArraylist;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public EquipmentsAdapters.equipmentViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.equipment_itemview, parent, false);
        return new equipmentViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipmentsAdapters.equipmentViewholder holder, int position) {

        Equipmentmodel equipmentData = equipmentArraylist.get(position);
        holder.equipmentsTV.setText(equipmentData.getTitle());
        holder.equipmentsIV.setImageResource(equipmentData.getImgid());

        if (pos == position) {
            holder.equipmentsIV.setBackground(mcontext.getDrawable(R.drawable.ic_circle_blue));
            holder.equipmentsIV.setColorFilter(mcontext.getResources().getColor(R.color.black));
        } else {
            holder.equipmentsIV.setBackground(mcontext.getDrawable(R.drawable.circle_bg));
            holder.equipmentsIV.setColorFilter(mcontext.getResources().getColor(R.color.light_sky));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos = position;
                notifyDataSetChanged();
            }
        });
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
