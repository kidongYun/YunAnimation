package com.yun.example.yunanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.yun.yunanimation.YunAnimationController;
import com.yun.yunanimation.YunScaleAnimation;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayout animationTarget;
    LinearLayout controller;

    YunAnimationController yunAnimationController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationTarget = findViewById(R.id.animation_target);
        controller = findViewById(R.id.controller);


        yunAnimationController = new YunAnimationController(controller);
        // craete a contructor included controller view.

        yunAnimationController.addAnimation(
                // SCROLL UP
                new YunScaleAnimation(animationTarget, 0, 300, 0, 0),
                // SCROLL DOWN
                new YunScaleAnimation(animationTarget, 0, 0, 0, 300),
                // SCROLL LEFT
                null,
                // SCROLL RIGHT
                null);

        yunAnimationController.start();
    }
}
