package com.tfb.fitnessapp.activities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.models.Injuriesmodel;

import java.util.ArrayList;

public class InjuriesAdapter extends RecyclerView.Adapter<InjuriesAdapter.injuriesitemviewHolder> {

    private ArrayList<Injuriesmodel> injuriesArraylist;
    private Context mcontext;

    public InjuriesAdapter(ArrayList<Injuriesmodel> injuriesArraylist, Context mcontext) {
        this.injuriesArraylist = injuriesArraylist;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public InjuriesAdapter.injuriesitemviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mcontext).inflate(R.layout.custome_injuries_itemview,parent,false);
        return new injuriesitemviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InjuriesAdapter.injuriesitemviewHolder holder, int position) {

        Injuriesmodel injuriesData = injuriesArraylist.get(position);
        holder.txt_injuries.setText(injuriesData.getTitle());
        holder.iv_injuries.setImageResource(injuriesData.getImgid());
    }

    @Override
    public int getItemCount() {
        return injuriesArraylist.size();
    }

    public class injuriesitemviewHolder extends RecyclerView.ViewHolder {

        private TextView txt_injuries;
        private ImageView iv_injuries;

        public injuriesitemviewHolder(@NonNull View itemView) {
            super(itemView);

            txt_injuries = itemView.findViewById(R.id.txt_injuries);
            iv_injuries = itemView.findViewById(R.id.iv_injuries);

        }
    }
}
