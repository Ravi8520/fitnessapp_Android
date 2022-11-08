package com.tfb.fitnessapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    private LoginActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;

        binding.txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, DashBoardActivity.class));
            }
        });

        binding.txtForgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext, ForgetPasswordActivity.class));
            }
        });

        binding.showPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowHidePass(view);
            }
        });
    }

    public void ShowHidePass(View view) {

        if (view.getId() == R.id.show_pass_btn) {
            if (binding.editPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibility);
                //Show Password
                binding.editPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                binding.editPassword.setSelection(binding.editPassword.getText().length());
            } else {
                ((ImageView) (view)).setImageResource(R.drawable.ic_password_visibleoff);
                //Hide Password
                binding.editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                binding.editPassword.setSelection(binding.editPassword.getText().length());
            }
        }
    }
}