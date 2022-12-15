package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.adapter.TransactionHistoryAdapter;
import com.tfb.fitnessapp.databinding.ActivityBankDetailBinding;
import com.tfb.fitnessapp.models.TransactionHistorymodel;

import java.util.ArrayList;

public class BankDetailActivity extends AppCompatActivity {

    ActivityBankDetailBinding binding;
    private BankDetailActivity mContext;
    ArrayList<TransactionHistorymodel> datalist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBankDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setTransactionHistoryInfo();
        setTransactionHistoryAdapter();
    }

    private void setTransactionHistoryInfo() {

        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));
        datalist.add(new TransactionHistorymodel("Payment for buying meal for john deo","2344546664453"));

    }

    private void setTransactionHistoryAdapter() {

        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(mContext,datalist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.transactionHistoryRV.setLayoutManager(layoutManager);
        binding.transactionHistoryRV.setAdapter(adapter);

    }
}