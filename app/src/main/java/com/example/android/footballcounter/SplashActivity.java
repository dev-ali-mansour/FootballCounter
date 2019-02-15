package com.example.android.footballcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Court Counter Android Application
 * Copyright © 2016-2017 TibaDev Solutions Inc. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ---------------- COURTCOUNTER IS FREE SOFTWARE ----------------
 * http://www.tibadev.com   |   tibadev.com.eg@gmail.com
 */
public class SplashActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        /*
      Duration of wait
     */
        int SPLASH_DISPLAY_LENGTH = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /* Create an Intent that will start the Main Activity. */
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}