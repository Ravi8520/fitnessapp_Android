package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.NotificationAdapter;
import com.tfb.fitnessapp.databinding.ActivityNotificationBinding;
import com.tfb.fitnessapp.models.Notificationmodel;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    ActivityNotificationBinding binding;
    private NotificationActivity mContext;
    ArrayList<Notificationmodel> notificationData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setNotificationInfo();
        setNotificationAdapter();


    }

    private void setNotificationInfo() {

        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));
        notificationData.add(new Notificationmodel("Lara has left you a 5 star rating.",
                "34 minutes ago",R.drawable.user_profilepic));


    }

    private void setNotificationAdapter() {

        DividerItemDecoration divider =
                new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.line_divider));

        NotificationAdapter adapter = new NotificationAdapter(mContext,notificationData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.notificationRV.addItemDecoration(divider);
        binding.notificationRV.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        binding.notificationRV.setLayoutManager(layoutManager);
        binding.notificationRV.setAdapter(adapter);

    }
}