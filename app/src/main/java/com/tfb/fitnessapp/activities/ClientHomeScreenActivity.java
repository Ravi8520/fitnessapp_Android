package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityClientHomeScreenBinding;
import com.tfb.fitnessapp.fragments.BookTrainerfragment;
import com.tfb.fitnessapp.fragments.ClientHomescreenfragment;
import com.tfb.fitnessapp.fragments.ClientProfilefragment;
import com.tfb.fitnessapp.fragments.Mealmarcketfragment;

public class ClientHomeScreenActivity extends AppCompatActivity {

    ActivityClientHomeScreenBinding binding;
    private ClientHomeScreenActivity mContext;
    ClientHomescreenfragment clientHomescreenfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;
        clientHomescreenfragment = new ClientHomescreenfragment();
        replaceFragment(clientHomescreenfragment);

        binding.bottomNavigation.setSelectedItemId(R.id.clientHomescreen);
        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.clientHomescreen:
                        replaceFragment(clientHomescreenfragment);
                        break;
                    case R.id.bookTrainer:
                        BookTrainerfragment bookTrainerfragment = new BookTrainerfragment();
                        replaceFragment(bookTrainerfragment);
                        break;
                    case R.id.mealmarcket:
                        Mealmarcketfragment mealmarcketfragment = new Mealmarcketfragment();
                        replaceFragment(mealmarcketfragment);
                        break;
                    case R.id.profile:
                        ClientProfilefragment clientProfilefragment = new ClientProfilefragment();
                        replaceFragment(clientProfilefragment);
                        break;
                }
                return true;
            }
        });

    }

    public void replaceFragment(Fragment fragment) {

        try {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }


}