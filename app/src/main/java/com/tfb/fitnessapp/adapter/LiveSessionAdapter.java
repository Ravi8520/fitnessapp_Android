package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.LiveSessionsItemviewBinding;

public class LiveSessionAdapter extends RecyclerView.Adapter<LiveSessionAdapter.LiveSessionViewholder> {

    private Context mContext;

    public LiveSessionAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public LiveSessionViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        LiveSessionsItemviewBinding itemviewBinding = LiveSessionsItemviewBinding.inflate(layoutInflater,parent,false);

        return new LiveSessionViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LiveSessionViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class LiveSessionViewholder extends RecyclerView.ViewHolder {

        public  LiveSessionsItemviewBinding binding;
        public LiveSessionViewholder(LiveSessionsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
