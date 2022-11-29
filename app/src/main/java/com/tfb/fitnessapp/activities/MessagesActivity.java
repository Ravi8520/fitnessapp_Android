package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.MessagesAdapter;
import com.tfb.fitnessapp.databinding.ActivityMessagesBinding;
import com.tfb.fitnessapp.models.MessagesModel;
import com.tfb.fitnessapp.models.MySchedulemodel;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    ActivityMessagesBinding binding;
    private MessagesActivity mContext;
    ArrayList<MessagesModel> messageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMessagesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        setmessagesInfo();
        setmessagesAdapter();


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void setmessagesInfo() {

        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
        messageList.add(new MessagesModel("john lee","2 new messages", R.drawable.user_profilepic));
    }

    private void setmessagesAdapter() {



        MessagesAdapter messagesAdapter = new MessagesAdapter(mContext,messageList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.chathistoryRV.setLayoutManager(layoutManager);
        binding.chathistoryRV.setAdapter(messagesAdapter);

    }
}