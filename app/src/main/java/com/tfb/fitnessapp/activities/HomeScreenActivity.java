package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.UpcomingSessionAdapter;
import com.tfb.fitnessapp.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.databinding.ActivityHomeScreenBinding;
import com.tfb.fitnessapp.models.UpcomingSessionmodel;
import com.tfb.fitnessapp.models.WorkoutProgramsmodel;

import java.util.ArrayList;

public class HomeScreenActivity extends AppCompatActivity {


    private ActionBarDrawerToggle toggle;
    ActivityHomeScreenBinding binding;
    private HomeScreenActivity mContext;
    ArrayList<UpcomingSessionmodel> sessionmodelUpcoming = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        setUpcomingsessioninfo();
        setUpcomingsessionAdapter();


        binding.txtViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,NewBookingsAlertsActivity.class));
            }
        });

        setSupportActionBar(binding.toolbar);
        toggle = new ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, R.string.open, R.string.close);

        binding.drawer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.setHomeAsUpIndicator(R.drawable.ic_navbar);


        binding.navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {
                    case R.id.id_myschedule:
                        startActivity(new Intent(mContext, MyScheduleActivity.class));
                        break;
                    case R.id.id_sessions:
                        startActivity(new Intent(mContext, SessionsActivity.class));
                        break;
                    case R.id.id_clients:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_mealmarcket:
                        startActivity(new Intent(mContext, MealMarketActivity.class));
                        break;
                    case R.id.id_myprograms:
                        Toast.makeText(mContext, R.string.lbl_sessions, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_pricing:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(mContext, PricingActivity.class));
                        break;
                    case R.id.id_referrals:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(mContext, InviteLinkActivity.class));
                        break;
                    case R.id.id_booktrainer:
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
    }

    private void setUpcomingsessioninfo() {

        sessionmodelUpcoming.add(new UpcomingSessionmodel("Jame doe","group session","11:30 - 12:30",
                "827 W 41st St, Miami Beach, FL 33140, United States","jan-1-23",R.drawable.user_profilepic));

        sessionmodelUpcoming.add(new UpcomingSessionmodel("Jame doe","group session","11:30 - 12:30",
                "827 W 41st St, Miami Beach, FL 33140, United States","jan-1-23",R.drawable.user_profilepic));

        sessionmodelUpcoming.add(new UpcomingSessionmodel("Jame doe","group session","11:30 - 12:30",
                "827 W 41st St, Miami Beach, FL 33140, United States","jan-1-23",R.drawable.user_profilepic));

        sessionmodelUpcoming.add(new UpcomingSessionmodel("Jame doe","group session","11:30 - 12:30",
                "827 W 41st St, Miami Beach, FL 33140, United States","jan-1-23",R.drawable.user_profilepic));

    }
    private void setUpcomingsessionAdapter() {

        UpcomingSessionAdapter adapter = new UpcomingSessionAdapter(mContext,sessionmodelUpcoming);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.upcomingsessionRV.setLayoutManager(layoutManager);
        binding.upcomingsessionRV.setAdapter(adapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionmenus, menu); //your file name;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id_message:
                Toast.makeText(mContext, "Message", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mContext,MessagesActivity.class));
                return true;
            case R.id.id_notify:
                Toast.makeText(mContext, "Notification", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(mContext,NotificationActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}