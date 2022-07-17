package com.KameliaCindyAstuti.kuliner311910104;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.window.SplashScreen;

public class SplashscreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIME = 2*1000;
    ProgressBar prg;

    @SuppressLint({"NewApi", "Range"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        prg = (ProgressBar) findViewById(R.id.progresbar1);
        prg.setAlpha(SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashscreenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, SPLASH_TIME);
    }
}