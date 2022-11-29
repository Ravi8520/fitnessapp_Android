package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.WorkoutProgramsAdapter;
import com.tfb.fitnessapp.databinding.ActivityMyScheduleDetailsBinding;
import com.tfb.fitnessapp.databinding.EnterOtpDialogueBinding;
import com.tfb.fitnessapp.models.WorkoutProgramsmodel;

import java.util.ArrayList;

public class MyScheduleDetailsActivity extends AppCompatActivity {

    ActivityMyScheduleDetailsBinding binding;
    private MyScheduleDetailsActivity mContext;
    ArrayList<WorkoutProgramsmodel> workoutProgramData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyScheduleDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.txtEnterOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showEnterOtpDialogue();
            }

        });


        binding.workoutProgramsRV.setNestedScrollingEnabled(false);
        setworkoutProgramsInfo();
        setworkoutProgramsAdapter();

    }

    private void showEnterOtpDialogue() {

        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.enter_otp_dialogue);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().setGravity(Gravity.CENTER);

        PinView pinview = dialog.findViewById(R.id.Pinview);
        Button btn = dialog.findViewById(R.id.btn_enter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String otp = pinview.getText().toString();
                Log.e("otp","otp=="+pinview.getText());

                if(otp.length()<6){
                    Toast.makeText(mContext,"please enter 6 digit otp",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext,"Success",Toast.LENGTH_SHORT).show();
                }
            }
        });

        dialog.show();
    }

    private void setworkoutProgramsInfo() {

        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));
        workoutProgramData.add(new WorkoutProgramsmodel("merengue","20-40Kcal"));

    }

    private void setworkoutProgramsAdapter() {

        WorkoutProgramsAdapter adapter = new WorkoutProgramsAdapter(mContext,workoutProgramData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        binding.workoutProgramsRV.setLayoutManager(layoutManager);
        binding.workoutProgramsRV.setAdapter(adapter);

    }
}