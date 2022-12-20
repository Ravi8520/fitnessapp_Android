package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.BookSessionTimeslotsItemviewBinding;
import com.tfb.fitnessapp.models.BookSessionTimemodel;

import java.util.ArrayList;

public class BookSessionTimeAdapter extends RecyclerView.Adapter<BookSessionTimeAdapter.BookSessiontimeViewholder> {

    Context context;
    ArrayList<BookSessionTimemodel> bookSession_Timeslotslist;

    public BookSessionTimeAdapter(Context context, ArrayList<BookSessionTimemodel> bookSession_Timeslots) {
        this.context = context;
        this.bookSession_Timeslotslist = bookSession_Timeslots;
    }

    @NonNull
    @Override
    public BookSessiontimeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        BookSessionTimeslotsItemviewBinding itemviewBinding = BookSessionTimeslotsItemviewBinding.inflate(layoutInflater,parent,false);
        return new BookSessiontimeViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookSessiontimeViewholder holder, int position) {

        BookSessionTimemodel bookSessionTimemodel = bookSession_Timeslotslist.get(position);
        holder.binding.txtTimeSchedules.setText(bookSessionTimemodel.getTimeSchedules());
    }

    @Override
    public int getItemCount() {
        return bookSession_Timeslotslist.size();
    }

    public class BookSessiontimeViewholder extends RecyclerView.ViewHolder {

        public BookSessionTimeslotsItemviewBinding binding;
        public BookSessiontimeViewholder(BookSessionTimeslotsItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
