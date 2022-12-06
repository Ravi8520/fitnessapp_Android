package com.tfb.fitnessapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.ChatActivity;
import com.tfb.fitnessapp.databinding.MessagesItemviewBinding;
import com.tfb.fitnessapp.models.MessagesModel;

import java.util.ArrayList;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MessagesViewholder> {

    Context mContext;
    ArrayList<MessagesModel> messageslist;

    public MessagesAdapter(Context mContext, ArrayList<MessagesModel> messageslist) {
        this.mContext = mContext;
        this.messageslist = messageslist;
    }

    @NonNull
    @Override
    public MessagesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MessagesItemviewBinding itemviewbinding = MessagesItemviewBinding.inflate(layoutInflater, parent, false);
        return new MessagesViewholder(itemviewbinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesViewholder holder, int position) {

        MessagesModel messagesModel = messageslist.get(position);
        holder.binding.txtUserName.setText(messagesModel.getUserName());
        holder.binding.txtMessageAlert.setText(messagesModel.getMessageAlert());
        holder.binding.profileImage.setImageResource(messagesModel.getImgid());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ChatActivity.class);
                mContext.startActivity(intent);
            }
        });


        holder.binding.btnMore.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                Context myContext = new ContextThemeWrapper(mContext,R.style.menuitem);
                PopupMenu popupMenu = new PopupMenu(myContext, holder.binding.btnMore);
                popupMenu.getMenuInflater().inflate(R.menu.messages_more_setting, popupMenu.getMenu());
                popupMenu.setForceShowIcon(true);


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(mContext, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupMenu.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return messageslist.size();
    }

    public class MessagesViewholder extends RecyclerView.ViewHolder {


        public MessagesItemviewBinding binding;

        public MessagesViewholder(MessagesItemviewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
