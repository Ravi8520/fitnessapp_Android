package com.tfb.fitnessapp.activities;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityConfirmPasswordBinding;

public class ConfirmPasswordActivity extends AppCompatActivity {

    ActivityConfirmPasswordBinding binding;
    private ConfirmPasswordActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConfirmPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.showPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowHidePass(view);
            }
        });

        binding.showConfpassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConfirmShowHidePass(view);
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void ShowHidePass(View view) {

        if (view.getId() == R.id.show_pass_btn) {
            if (binding.editPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                //Show Password
                binding.editPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                binding.editPassword.setSelection(binding.editPassword.getText().length());
                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibility);
            } else {
                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibleoff);
                binding.editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                binding.editPassword.setSelection(binding.editPassword.getText().length());
            }
        }
    }

    private void ConfirmShowHidePass(View view) {

        if (view.getId() == R.id.show_confpass_btn) {
            if (binding.editConfpassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                binding.editConfpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                binding.editConfpassword.setSelection(binding.editConfpassword.getText().length());
                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibility);
            } else {

                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibleoff);
                binding.editConfpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                binding.editConfpassword.setSelection(binding.editConfpassword.getText().length());

            }
        }
    }
}
