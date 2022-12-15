package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.TransactionHistoryItemviewBinding;
import com.tfb.fitnessapp.models.TransactionHistorymodel;

import java.util.ArrayList;

public class TransactionHistoryAdapter extends RecyclerView.Adapter<TransactionHistoryAdapter.TransactionhistoryViewholder> {

    Context mContext;
    ArrayList<TransactionHistorymodel> transactionsData;

    public TransactionHistoryAdapter(Context mContext, ArrayList<TransactionHistorymodel> transactionsDatalist) {
        this.mContext = mContext;
        this.transactionsData = transactionsDatalist;
    }

    @NonNull
    @Override
    public TransactionhistoryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        TransactionHistoryItemviewBinding itemviewBinding = TransactionHistoryItemviewBinding.inflate(layoutInflater,parent,false);
        return new TransactionhistoryViewholder(itemviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionhistoryViewholder holder, int position) {

        TransactionHistorymodel transactionmodel = transactionsData.get(position);
        holder.binding.txtTransactionNote.setText(transactionmodel.getTransactionNote());
        holder.binding.txtAccountNumber.setText(transactionmodel.getAccNumber());

    }

    @Override
    public int getItemCount() {
        return transactionsData.size();
    }

    public class TransactionhistoryViewholder extends RecyclerView.ViewHolder {

        public TransactionHistoryItemviewBinding binding;
        public TransactionhistoryViewholder(TransactionHistoryItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
