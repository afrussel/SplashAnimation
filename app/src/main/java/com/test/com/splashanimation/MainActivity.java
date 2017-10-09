package com.test.com.splashanimation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout l1, l2;
    Animation updown, downtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        updown = AnimationUtils.loadAnimation(this, R.anim.updown);
        downtop = AnimationUtils.loadAnimation(this, R.anim.downtop);
        l1.setAnimation(updown);
        l2.setAnimation(downtop);

    }
}
