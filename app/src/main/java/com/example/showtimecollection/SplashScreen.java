package com.example.showtimecollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.showtimecollection.baseclasses.BaseActivity;
import com.example.showtimecollection.ui.login.LoginActivity;

public class SplashScreen extends BaseActivity {
    private static final int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openNewScreen();
    }


    private void openNewScreen() {

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {


                Intent i;

                if(sharedperference.getUserID()==null || sharedperference.getUserID()=="") {
                    i = new Intent(SplashScreen.this, LoginActivity.class);
                }
                else{
                    i = new Intent(SplashScreen.this, MainActivity.class);

                }

                //i = new Intent(SplashScreen.this, LanuageSelection.class);


                startActivity(i);
                finish();

            }
        }, SPLASH_TIME_OUT);
    }
}