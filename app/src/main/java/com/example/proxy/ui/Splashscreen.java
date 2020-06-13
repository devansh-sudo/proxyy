package com.example.proxy.ui;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proxy.R;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.splashscreen );
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(Splashscreen.this, Login_signup.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}
