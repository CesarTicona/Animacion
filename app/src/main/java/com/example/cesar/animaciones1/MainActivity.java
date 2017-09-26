package com.example.cesar.animaciones1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView android;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = (ImageView) findViewById(R.id.android);
    }
    public void zoomin(View v){
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zomm_in);
        android.startAnimation(animation);
    }
}
