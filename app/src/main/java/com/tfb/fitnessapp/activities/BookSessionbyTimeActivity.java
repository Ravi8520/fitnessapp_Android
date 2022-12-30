package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.BookSessionTimeAdapter;
import com.tfb.fitnessapp.databinding.ActivityBookSessionbyTimeBinding;
import com.tfb.fitnessapp.models.BookSessionTimemodel;

import java.util.ArrayList;

public class BookSessionbyTimeActivity extends AppCompatActivity {

    ActivityBookSessionbyTimeBinding binding;
    private BookSessionbyTimeActivity mContext;
    ArrayList<BookSessionTimemodel> morningsessionTimeSlots = new ArrayList<>();
    ArrayList<BookSessionTimemodel> noonsessionTimeSlots = new ArrayList<>();
    ArrayList<BookSessionTimemodel> eveningsessionTimeSlots = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookSessionbyTimeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, BookSessionDetailActivity.class));
            }
        });


            MorningTimeSchedules();
            noonTimeSchedules();
            eveningTimeSchedules();

    }

    private void MorningTimeSchedules() {

        morningsessionTimeSlots.add(new BookSessionTimemodel("07:00 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("07:30 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("08:00 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("08:30 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("09:00 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("09:30 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("10:00 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("10:30 am"));
        morningsessionTimeSlots.add(new BookSessionTimemodel("11:00 am"));


        BookSessionTimeAdapter adapter = new BookSessionTimeAdapter(mContext,morningsessionTimeSlots);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext,3);
        binding.morningTimeSchedulesRV.setLayoutManager(layoutManager);
        binding.morningTimeSchedulesRV.setAdapter(adapter);

    }

    private void noonTimeSchedules() {
        noonsessionTimeSlots.add(new BookSessionTimemodel("12:00 pm"));
        noonsessionTimeSlots.add(new BookSessionTimemodel("12:30 pm"));
        noonsessionTimeSlots.add(new BookSessionTimemodel("03:00 pm"));
        noonsessionTimeSlots.add(new BookSessionTimemodel("04:30 pm"));
        noonsessionTimeSlots.add(new BookSessionTimemodel("04:00 pm"));
        noonsessionTimeSlots.add(new BookSessionTimemodel("04:30 pm"));


        BookSessionTimeAdapter adapter = new BookSessionTimeAdapter(mContext,noonsessionTimeSlots);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext,3);
        binding.noonTimeSchedulesRV.setLayoutManager(layoutManager);
        binding.noonTimeSchedulesRV.setAdapter(adapter);

    }

    private void eveningTimeSchedules() {

        eveningsessionTimeSlots.add(new BookSessionTimemodel("05:30 am"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("06:00 am"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("06:30 am"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("07:00 pm"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("07:30 pm"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("08:00 pm"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("08:30 pm"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("09:00 pm"));
        eveningsessionTimeSlots.add(new BookSessionTimemodel("09:30 pm"));


        BookSessionTimeAdapter adapter = new BookSessionTimeAdapter(mContext,eveningsessionTimeSlots);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext,3);
        binding.eveningTimeSchedulesRV.setLayoutManager(layoutManager);
        binding.eveningTimeSchedulesRV.setAdapter(adapter);
    }
}