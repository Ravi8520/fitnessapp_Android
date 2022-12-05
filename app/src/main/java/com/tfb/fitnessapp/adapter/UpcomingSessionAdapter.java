package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Visibility;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.UpcomingSessionsItemviewBinding;
import com.tfb.fitnessapp.models.UpcomingSessionmodel;

import java.util.ArrayList;

public class UpcomingSessionAdapter extends RecyclerView.Adapter<UpcomingSessionAdapter.SessionViewHolder> {

    Context context;
    ArrayList<UpcomingSessionmodel> upcomingsessionlist;


    public UpcomingSessionAdapter(Context context, ArrayList<UpcomingSessionmodel> upcomingsessionlist) {
        this.context = context;
        this.upcomingsessionlist = upcomingsessionlist;
    }

    @NonNull
    @Override
    public SessionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        UpcomingSessionsItemviewBinding itemviewBinding = UpcomingSessionsItemviewBinding.inflate(layoutInflater,parent,false);
        return new SessionViewHolder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull SessionViewHolder holder, int position) {

        UpcomingSessionmodel model = upcomingsessionlist.get(position);
        holder.binding.txtSessionDate.setText(model.getSession_date());
        holder.binding.ivProfilepic.setImageResource(model.getImgid());
        holder.binding.txtSessionType.setText(model.getSession_Type());
        holder.binding.txtUserName.setText(model.getName());
        holder.binding.txtSessionDuration.setText(model.getSession_time());
        holder.binding.txtUserAddress.setText(model.getAddress());

        holder.binding.btnEnterOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(holder.binding.layoutPinview.getVisibility() == View.GONE){
                    holder.binding.layoutPinview.setVisibility(View.VISIBLE);
                    holder.binding.btnEnterOtp.setVisibility(View.GONE);
                }else {
                    holder.binding.layoutPinview.setVisibility(View.GONE);
                    holder.binding.btnEnterOtp.setVisibility(View.VISIBLE);
                }

            }
        });

        holder.binding.btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.binding.btnEnterOtp.getVisibility() == View.GONE){
                    holder.binding.layoutPinview.setVisibility(View.GONE);
                    holder.binding.btnEnterOtp.setVisibility(View.VISIBLE);
                }else{
                    holder.binding.layoutPinview.setVisibility(View.VISIBLE);
                    holder.binding.btnEnterOtp.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return upcomingsessionlist.size();
    }

    public class SessionViewHolder extends RecyclerView.ViewHolder {

        public UpcomingSessionsItemviewBinding binding;

        public SessionViewHolder(UpcomingSessionsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
