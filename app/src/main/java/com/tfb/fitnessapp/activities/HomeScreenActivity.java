package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import com.google.android.material.navigation.NavigationView;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityHomeScreenBinding;

public class HomeScreenActivity extends AppCompatActivity {


    private ActionBarDrawerToggle toggle;
    ActivityHomeScreenBinding binding;
    private HomeScreenActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        setSupportActionBar(binding.toolbar);
        toggle = new ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, R.string.open, R.string.close);

        binding.drawer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));


        binding.navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {
                    case R.id.id_myschedule:
                        startActivity(new Intent(mContext,MyScheduleActivity.class));
                        break;
                    case R.id.id_sessions:
                        Toast.makeText(mContext, R.string.lbl_sessions, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_clients:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_mealmarcket:
                        Toast.makeText(mContext, R.string.lbl_myschedule, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_myprograms:
                        Toast.makeText(mContext, R.string.lbl_sessions, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_pricing:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_referrals:
                        Toast.makeText(mContext, R.string.lbl_clients, Toast.LENGTH_SHORT).show();
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
                return true;
            case R.id.id_notify:
                Toast.makeText(mContext, "Notification", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}