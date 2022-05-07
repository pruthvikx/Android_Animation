package com.iif.fadeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean astaIsShowing = true;

    public void fade(View view){

        Log.i("msg","Image Tapped");
        ImageView astaImageView = (ImageView) findViewById(R.id.astaImageView);
        ImageView yamiImageView = (ImageView) findViewById(R.id.yamiImageView);

        if(astaIsShowing) {
            astaIsShowing = false;
            astaImageView.animate().alpha(0).setDuration(2000);
            yamiImageView.animate().alpha(1).setDuration(2000);
        }else {
            astaIsShowing = true;
            astaImageView.animate().alpha(1).setDuration(2000);
            yamiImageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}