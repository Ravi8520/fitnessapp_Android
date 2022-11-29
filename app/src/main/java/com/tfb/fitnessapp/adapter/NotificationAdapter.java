package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.NotificationItemviewBinding;
import com.tfb.fitnessapp.models.Notificationmodel;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewholder> {

    Context mcontext;
    ArrayList<Notificationmodel> notificationlist = new ArrayList<>();

    public NotificationAdapter(Context mcontext, ArrayList<Notificationmodel> notificationlist) {
        this.mcontext = mcontext;
        this.notificationlist = notificationlist;
    }

    @NonNull
    @Override
    public NotificationViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NotificationItemviewBinding itemviewBinding = NotificationItemviewBinding.inflate(layoutInflater,parent,false);

        return new NotificationViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewholder holder, int position) {

        Notificationmodel notificationmodel = notificationlist.get(position);
        holder.binding.txtNotification.setText(notificationmodel.getNotification_sub());
        holder.binding.txtNotificationTime.setText(notificationmodel.getNotificationTime());
        holder.binding.profileImage.setImageResource(notificationmodel.getImgid());

    }

    @Override
    public int getItemCount() {
        return notificationlist.size();
    }

    public class NotificationViewholder extends RecyclerView.ViewHolder {

        private NotificationItemviewBinding binding;

        public NotificationViewholder(NotificationItemviewBinding itemView) {

            super(itemView.getRoot());
            this.binding  =  itemView;
        }
    }
}
