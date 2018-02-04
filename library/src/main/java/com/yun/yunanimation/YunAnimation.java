package com.yun.yunanimation;

import android.util.Log;
import android.view.View;

/**
 * Created by yun on 2018. 2. 4..
 */

public class YunAnimation {
    protected View targetView;
    protected int SENSITIVITY = 5;

    public YunAnimation(View targetView) {
        this.targetView = targetView;
    }

    public void start() {
        Log.i("WKU", "YunAnimation -> start()!!!");
    }

    // OCCUR THIS FUNCTION WHEN YOU DITACH YOUR HAND ON DISPLAY
    public void actionUp() {
        Log.i("WKU", "YunAnimation -> actionUp()!!!");
    }

    public void setAnimationSensitivity(int sensitivity) {
        this.SENSITIVITY = sensitivity;
    }
}