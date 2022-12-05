package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.databinding.ClientsListItemviewBinding;
import com.tfb.fitnessapp.models.Clientsmodel;

import java.util.ArrayList;

public class ClientslistAdapter extends RecyclerView.Adapter<ClientslistAdapter.ClientsViewholder> {

    Context context;
    ArrayList<Clientsmodel> clientslist;

    public ClientslistAdapter(Context context, ArrayList<Clientsmodel> clientslist) {
        this.context = context;
        this.clientslist = clientslist;
    }

    @NonNull
    @Override
    public ClientsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ClientsListItemviewBinding itemviewbinding = ClientsListItemviewBinding.inflate(layoutInflater,parent,false);
        return new ClientsViewholder(itemviewbinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientsViewholder holder, int position) {

        Clientsmodel clientsmodel = clientslist.get(position);
        holder.binding.profileImage.setImageResource(clientsmodel.getImg());
        holder.binding.txtUserName.setText(clientsmodel.getSession_user());
        holder.binding.txtMapAddress.setText(clientsmodel.getUser_address());
        holder.binding.txtFitnessType.setText(clientsmodel.getFitness_type());
        holder.binding.txtPlan.setText(clientsmodel.getSelected_plan());


    }

    @Override
    public int getItemCount() {
        return clientslist.size();
    }

    public class ClientsViewholder extends RecyclerView.ViewHolder {

        public ClientsListItemviewBinding binding;

        public ClientsViewholder(ClientsListItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
