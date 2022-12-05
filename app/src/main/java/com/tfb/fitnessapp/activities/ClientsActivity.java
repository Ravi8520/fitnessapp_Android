package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.ClientslistAdapter;
import com.tfb.fitnessapp.databinding.ActivityClientsBinding;
import com.tfb.fitnessapp.models.Clientsmodel;

import java.util.ArrayList;

public class ClientsActivity extends AppCompatActivity {

    ActivityClientsBinding binding;
    private Context mContext;
    ArrayList<Clientsmodel> clientslistdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityClientsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setClientsInfo();
        setClientslistAdapter();

    }

    private void setClientsInfo() {
        clientslistdata.add(new Clientsmodel(R.drawable.user_profilepic,"John Doe","901 S Miami Ave, Miami",
                "Crossfit","Starter Pack $50"));
        clientslistdata.add(new Clientsmodel(R.drawable.user_profilepic,"John Doe","901 S Miami Ave, Miami",
                "Crossfit","Starter Pack $50"));
        clientslistdata.add(new Clientsmodel(R.drawable.user_profilepic,"John Doe","901 S Miami Ave, Miami",
                "Crossfit","Starter Pack $50"));
        clientslistdata.add(new Clientsmodel(R.drawable.user_profilepic,"John Doe","901 S Miami Ave, Miami",
                "Crossfit","Starter Pack $50"));

    }

    private void setClientslistAdapter() {

        ClientslistAdapter clientslistAdapter = new ClientslistAdapter(mContext,clientslistdata);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.clientslistRV.setLayoutManager(layoutManager);
        binding.clientslistRV.setAdapter(clientslistAdapter);

    }
}