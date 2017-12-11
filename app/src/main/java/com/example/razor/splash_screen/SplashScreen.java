package com.example.razor.splash_screen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000; //Membuat Varibel penghitungan waktu mundur/timeout 1000 = 1 sencond
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                //Fugnsi Untuk Menjalankan Intent Ke Activity Yang Dituju :
                Intent maininten = new Intent(SplashScreen.this, Activity_Home.class);
                startActivity(maininten);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
