package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.BookingAdapter;
import com.tfb.fitnessapp.databinding.ActivityBookingBinding;
import com.tfb.fitnessapp.models.Bookingmodel;

import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {

    ActivityBookingBinding binding;
    private BookingActivity mContext;
    ArrayList<Bookingmodel> bookingworkoutslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setBookingworkouts();
        setBookingworkoutsAdapter();

    }

    private void setBookingworkouts() {
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
        bookingworkoutslist.add(new Bookingmodel("Merengue","40-50Kcal"));
    }

    private void setBookingworkoutsAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        BookingAdapter bookingAdapter = new BookingAdapter(mContext,bookingworkoutslist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.workoutProgramsRV.addItemDecoration(divider);
        binding.workoutProgramsRV.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        binding.workoutProgramsRV.setLayoutManager(layoutManager);
        binding.workoutProgramsRV.setAdapter(bookingAdapter);

    }
}