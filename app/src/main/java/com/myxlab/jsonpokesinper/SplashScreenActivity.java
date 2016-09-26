package com.myxlab.jsonpokesinper;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class SplashScreenActivity extends AppCompatActivity {

    public static final int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SmallBang smallBang = SmallBang.attach2Window(SplashScreenActivity.this);
                smallBang.bang(imageView, 400, new SmallBangListener() {
                    @Override
                    public void onAnimationStart() {
                    }

                    @Override
                    public void onAnimationEnd() {
                        Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                        startActivity(i);
                    }
                });

            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }


}
