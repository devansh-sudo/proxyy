package com.example.proxy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.proxy.R;

public class Login_signup extends AppCompatActivity
{

    TextView adminBTN,studentBTN;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.login_signup );

        adminBTN = (TextView)findViewById(R.id.administration);
        studentBTN = (TextView)findViewById(R.id.student);

        adminBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Login_signup.this, Login.class);
                startActivity(i);

            }
        });

        studentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Login_signup.this, Signup.class);
                startActivity(i);

            }
        });
    }
}
