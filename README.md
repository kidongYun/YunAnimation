# YunAnimation
Android animation library with scrolling and touching

please follow my sample source code.
and the following is the setting you must do in your project.

1. the object of animation target has a absolute width or height value in your xml code(ex. 300dp)

2. if your controller is made by viewgroup(ex. linearlayout, framelayout...) 
you should add the clickable="true"option in xml code

and  below is total sample code for beginner

activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:id="@+id/animation_target"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:background="#aaaaaa"
        android:gravity="center">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Animation Target"
            android:textStyle="bold"
            android:textSize="8pt"/>
    </LinearLayout>

    <LinearLayout
        android:id="@+id/controller"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="#dddddd"
        android:gravity="center"
        android:clickable="true">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Controller"
            android:textStyle="bold"
            android:textSize="8pt"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Please scroll me"/>
    </LinearLayout>

</LinearLayout>






MainActivity.java

    protected void onCreate(Bundle savedInstanceState) {
    
        LinearLayout animationTarget;
        LinearLayout controller;

        YunAnimationController yunAnimationController;
        
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
