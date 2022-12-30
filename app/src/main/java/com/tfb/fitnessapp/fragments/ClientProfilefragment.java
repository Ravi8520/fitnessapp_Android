package com.tfb.fitnessapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.BookaTrainerActivity;
import com.tfb.fitnessapp.activities.ClientsActivity;
import com.tfb.fitnessapp.activities.InviteLinkActivity;
import com.tfb.fitnessapp.activities.MealMarketActivity;
import com.tfb.fitnessapp.activities.MyScheduleActivity;
import com.tfb.fitnessapp.activities.PricingActivity;
import com.tfb.fitnessapp.activities.SessionsActivity;
import com.tfb.fitnessapp.activities.TrainerviewProfileActivity;
import com.tfb.fitnessapp.adapter.ActivitiesAndReportsAdapter;
import com.tfb.fitnessapp.adapter.GoalsAdapter;
import com.tfb.fitnessapp.databinding.FragmentClientProfilefragmentBinding;
import com.tfb.fitnessapp.models.ActivitiesandRecordsmodel;
import com.tfb.fitnessapp.models.Goalsmodel;

import java.util.ArrayList;


public class ClientProfilefragment extends Fragment {

    private FragmentClientProfilefragmentBinding binding;
    private Context mContext;
    private ActionBarDrawerToggle toggle;
    ArrayList<Goalsmodel> goalsdata = new ArrayList<>();
    ArrayList<ActivitiesandRecordsmodel> recordsdata = new ArrayList<>();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentClientProfilefragmentBinding.inflate(inflater, container, false);
        setGoalsadapter();
        setRecordsadapter();

        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar);

        toggle = new ActionBarDrawerToggle(getActivity(), binding.drawer, binding.toolbar, R.string.open, R.string.close);

        binding.drawer.isDrawerOpen(Gravity.RIGHT);
        binding.drawer.addDrawerListener(toggle);
        toggle.syncState();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        binding.navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {
                    case R.id.account:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.orderHistory:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bookings:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.save:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.wallet:
                        Toast.makeText(mContext, R.string.lbl_sessions, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.notification_Reminders:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.referralsAndVouchers:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.activitiesAndrecordsRV:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.become_aTrainer:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    /*case R.id.id_logout:
                        Toast.makeText(mContext, R.string.lbl_logout, Toast.LENGTH_SHORT).show();
                        break;*/
                    default:
                        return true;
                }
                return false;
            }
        });

        return binding.getRoot();
    }


    private void setGoalsadapter() {

        goalsdata.add(new Goalsmodel("Weight Loss"));
        goalsdata.add(new Goalsmodel("Muscle Gain"));
        goalsdata.add(new Goalsmodel("Weight Loss"));
        goalsdata.add(new Goalsmodel("Muscle Gain"));
        goalsdata.add(new Goalsmodel("Weight Loss"));

        GoalsAdapter adapter = new GoalsAdapter(mContext, goalsdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        binding.goalsRV.setLayoutManager(layoutManager);
        binding.goalsRV.setAdapter(adapter);

    }

    private void setRecordsadapter() {

        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));
        recordsdata.add(new ActivitiesandRecordsmodel("nov", "12", "mindfullness", "8 Exercises"));

        ActivitiesAndReportsAdapter adapter = new ActivitiesAndReportsAdapter(mContext, recordsdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.recentWorkoutsRV.setLayoutManager(layoutManager);
        binding.recentWorkoutsRV.setAdapter(adapter);
    }
}