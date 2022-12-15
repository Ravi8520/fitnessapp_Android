package com.tfb.fitnessapp.activities;


import static com.google.android.material.tabs.TabLayout.GRAVITY_FILL;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import com.google.android.material.tabs.TabLayout;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.TrainerViewProfilepageAdapter;
import com.tfb.fitnessapp.databinding.ActivityTrainerviewProfileBinding;

public class TrainerviewProfileActivity extends AppCompatActivity {

    ActivityTrainerviewProfileBinding binding;
    private TrainerviewProfileActivity mContext;
    TrainerViewProfilepageAdapter trainerViewProfilepageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrainerviewProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.layoutNoErrorCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, PaymentDetailsActivity.class));
            }
        });
        binding.btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Context myContext = new ContextThemeWrapper(mContext,R.style.AppTheme);
                    PopupMenu popupMenu = new PopupMenu(myContext, binding.btnEditProfile);
                    popupMenu.getMenuInflater().inflate(R.menu.edit_profile, popupMenu.getMenu());

                    popupMenu.setForceShowIcon(true);

                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            Log.e("menuItem", "menuItem==" + menuItem.getItemId());
                            Toast.makeText(mContext, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                            if(menuItem.getItemId()==R.id.edit_profile){
                                startActivity(new Intent(mContext,EditTrainerProfileActivity.class));
                            }

                            return true;
                        }
                    });
                    popupMenu.show();
                } catch (Exception e) {

                }
            }
        });

        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.lbl_workouts)));
        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.lbl_demos)));
        binding.tablayout.setTabGravity(GRAVITY_FILL);

        trainerViewProfilepageAdapter = new TrainerViewProfilepageAdapter(getSupportFragmentManager(), binding.tablayout.getTabCount());
        binding.tabViewPager.setAdapter(trainerViewProfilepageAdapter);

        binding.tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));

        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.tabViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}