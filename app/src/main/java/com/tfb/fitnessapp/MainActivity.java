package com.tfb.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

import com.tfb.fitnessapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        final ValueAnimator anim = ValueAnimator.ofFloat(1f, 1.5f);
        anim.setDuration(1000);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                binding.imgSplash.setScaleX((Float) animation.getAnimatedValue());
                binding.imgSplash.setScaleY((Float) animation.getAnimatedValue());
            }
        });
        anim.setRepeatCount(1);
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.start();
    }
}