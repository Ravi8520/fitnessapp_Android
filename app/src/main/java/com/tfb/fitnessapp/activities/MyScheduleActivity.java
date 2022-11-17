package com.tfb.fitnessapp.activities;

import static com.google.android.material.tabs.TabLayout.GRAVITY_FILL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.adapter.MyScheduleAdapter;
import com.tfb.fitnessapp.databinding.ActivityMyScheduleBinding;

public class MyScheduleActivity extends AppCompatActivity {

    private MyScheduleActivity mContext;
    private ActivityMyScheduleBinding binding;
    MyScheduleAdapter myScheduleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyScheduleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.tab_upcoming)));
        binding.tablayout.addTab(binding.tablayout.newTab().setText(getResources().getText(R.string.tab_all)));
        binding.tablayout.setTabGravity(GRAVITY_FILL);

        myScheduleAdapter = new MyScheduleAdapter(getSupportFragmentManager(), binding.tablayout.getTabCount());
        binding.tabViewPager.setAdapter(myScheduleAdapter);

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

      /* binding.tabViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
               myScheduleAdapter.getItem(position);
           }

           @Override
           public void onPageSelected(int position) {

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });*/
        binding.tabViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}