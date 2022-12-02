package com.tfb.fitnessapp.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.activities.ChatActivity;
import com.tfb.fitnessapp.activities.MyScheduleDetailsActivity;
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
        MessagesItemviewBinding itemviewbinding = MessagesItemviewBinding.inflate(layoutInflater,parent,false);
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
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(mContext);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);
                dialog.setContentView(R.layout.more_chat_setting_dialogue);
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                dialog.getWindow().setGravity(Gravity.CENTER);


                dialog.show();
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
