package com.yun.yunanimation;

import android.util.Log;
import android.view.View;

/**
 * Created by yun on 2018. 2. 4..
 */

public class YunScaleAnimation extends YunAnimation {
    private int fromWidth;
    private int fromHeight;
    private int toWidth;
    private int toHeight;

    private int HEIGHT_SENSITIVITY;
    private int WIDTH_SENSITIVITY;

    public YunScaleAnimation(View targetView, int fromWidth, int fromHeight, int toWidth, int toHeight) {
        super(targetView);

        this.fromWidth = fromWidth;
        this.fromHeight = fromHeight;
        this.toWidth = toWidth;
        this.toHeight = toHeight;

        this.WIDTH_SENSITIVITY = super.SENSITIVITY;
        this.HEIGHT_SENSITIVITY = super.SENSITIVITY;
    }

    public void start() {
        android.view.ViewGroup.LayoutParams targetViewLayoutParams = targetView.getLayoutParams();

        if(fromHeight > toHeight) {
            if(targetViewLayoutParams.height >= toHeight + HEIGHT_SENSITIVITY) {
                targetViewLayoutParams.height = targetViewLayoutParams.height - HEIGHT_SENSITIVITY;
            } else if(targetViewLayoutParams.height < (toHeight + HEIGHT_SENSITIVITY) && targetViewLayoutParams.height > toHeight) {
                targetViewLayoutParams.height = toHeight;
            }
        } else {
            if(targetViewLayoutParams.height <= toHeight - HEIGHT_SENSITIVITY) {
                targetViewLayoutParams.height = targetViewLayoutParams.height + HEIGHT_SENSITIVITY;
            } else if(targetViewLayoutParams.height > (toHeight + HEIGHT_SENSITIVITY) && targetViewLayoutParams.height < toHeight) {
                targetViewLayoutParams.height = toHeight;
            }
        }

        if(fromWidth > toWidth) {
            if(targetViewLayoutParams.width >= toWidth + WIDTH_SENSITIVITY) {
                targetViewLayoutParams.width = targetViewLayoutParams.width - WIDTH_SENSITIVITY;
            } else if(targetViewLayoutParams.width < (toWidth + WIDTH_SENSITIVITY) && targetViewLayoutParams.width > toWidth) {
                targetViewLayoutParams.width = toWidth;
            }
        } else {
            if(targetViewLayoutParams.width <= toWidth - WIDTH_SENSITIVITY) {
                targetViewLayoutParams.width = targetViewLayoutParams.width + WIDTH_SENSITIVITY;
            } else if(targetViewLayoutParams.width > (toWidth + WIDTH_SENSITIVITY) && targetViewLayoutParams.width < toWidth) {
                targetViewLayoutParams.width = toWidth;
            }
        }

        targetView.setLayoutParams(targetViewLayoutParams);
    }

    public void actionUp() {
        android.view.ViewGroup.LayoutParams targetViewLayoutParams = targetView.getLayoutParams();

        if(fromWidth != toWidth) {
            targetViewLayoutParams.width = toWidth;
        }

        if(fromHeight != toHeight) {
            targetViewLayoutParams.height = toHeight;
        }

        targetView.setLayoutParams(targetViewLayoutParams);
    }

    public void setWidthSensitivity(int sensitivity) {
        this.WIDTH_SENSITIVITY = sensitivity;
    }

    public void setHeightSensitivity(int sensitivity) {
        this.HEIGHT_SENSITIVITY = sensitivity;
    }
}