package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.BookingWorkoutItemviewBinding;
import com.tfb.fitnessapp.models.Bookingmodel;

import java.util.ArrayList;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookinworkoutViewholder> {

    Context mContext;
    ArrayList<Bookingmodel> bookingworkoutlist;

    public BookingAdapter(Context mContext, ArrayList<Bookingmodel> bookingworkoutlist) {
        this.mContext = mContext;
        this.bookingworkoutlist = bookingworkoutlist;
    }

    @NonNull
    @Override
    public BookinworkoutViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        BookingWorkoutItemviewBinding itemviewBinding = BookingWorkoutItemviewBinding.inflate(layoutInflater,parent,false);

        return new BookinworkoutViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookinworkoutViewholder holder, int position) {

        Bookingmodel bookingmodel = bookingworkoutlist.get(position);
        holder.binding.txtWorkoutprogram.setText(bookingmodel.getExcerciseName());
        holder.binding.txtCaloriesburn.setText(bookingmodel.getCaloriesBurn());

    }

    @Override
    public int getItemCount() {
        return bookingworkoutlist.size();
    }

    public class BookinworkoutViewholder extends RecyclerView.ViewHolder {

        public BookingWorkoutItemviewBinding binding;

        public BookinworkoutViewholder(BookingWorkoutItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
