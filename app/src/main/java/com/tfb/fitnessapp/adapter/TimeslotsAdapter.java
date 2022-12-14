package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.models.TimeslotsModel;

import java.util.ArrayList;

public class TimeslotsAdapter extends RecyclerView.Adapter<TimeslotsAdapter.TimeslotsViewholder> {

    private ArrayList<TimeslotsModel> timeslotslist;
    private ArrayList<TimeslotsModel> selectedTimeslotslist = new ArrayList<>();
    boolean isSelected;
    private Context mcontext;
    int pos;

    public TimeslotsAdapter(ArrayList<TimeslotsModel> timeslotslist, Context mcontext) {
        this.timeslotslist = timeslotslist;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public TimeslotsAdapter.TimeslotsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.timeslots_itemview, parent, false);
        return new TimeslotsViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeslotsAdapter.TimeslotsViewholder holder, int position) {

        TimeslotsModel timeslotsModel = timeslotslist.get(position);
        holder.txt_weekdays.setText(timeslotsModel.getDays());


       /* if (pos == position) {
            holder.layout_main.setBackground(mcontext.getResources().getDrawable(R.drawable.coustom_button_border));
            holder.txt_weekdays.setTextColor(mcontext.getResources().getColor(R.color.black));
        } else {
            holder.layout_main.setBackground(mcontext.getResources().getDrawable(R.drawable.custome_edittext));
            holder.txt_weekdays.setTextColor(mcontext.getResources().getColor(R.color.white));
        }*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(selectedTimeslotslist.contains(timeslotslist.get(holder.getAdapterPosition()))){
                   holder.layout_main.setBackground(mcontext.getResources().getDrawable(R.drawable.custome_edittext));
                   holder.txt_weekdays.setTextColor(mcontext.getResources().getColor(R.color.white));
                   selectedTimeslotslist.remove(timeslotslist.get(holder.getAdapterPosition()));

               } else {
                   holder.layout_main.setBackground(mcontext.getResources().getDrawable(R.drawable.coustom_button_border));
                   holder.txt_weekdays.setTextColor(mcontext.getResources().getColor(R.color.black));
                   selectedTimeslotslist.add(timeslotslist.get(holder.getAdapterPosition()));
               }
            }
        });
    }

    @Override
    public int getItemCount() {
        return timeslotslist.size();
    }

    public class TimeslotsViewholder extends RecyclerView.ViewHolder {

        TextView txt_weekdays;
        RelativeLayout layout_main;

        public TimeslotsViewholder(@NonNull View itemView) {
            super(itemView);

            txt_weekdays = itemView.findViewById(R.id.txt_weekdays);
            layout_main = itemView.findViewById(R.id.layout_main);

        }
    }
}
