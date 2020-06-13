package com.example.proxy.ui;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.proxy.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Otp  extends AppCompatActivity {

    Button submitBTn,resendBTN;
    TextView textView;
    TextView counterText;
    ImageView backBTn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.otp );

        textView = (TextView)findViewById(R.id.text);
         counterText = (TextView)findViewById(R.id.counter);
        resendBTN = (Button)findViewById(R.id.resend_btn);

        String mobNo = getIntent().getStringExtra("mobileNo");

        textView.setText("We have sent you a 4 digit verification code on +91-"+mobNo);
        resendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initCountDownTimer();
            }
        });

        initCountDownTimer();

        backBTn = (ImageView)findViewById ( R.id.back );
        backBTn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        } );
    }



    public void initCountDownTimer() {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                counterText.setText("Seconds remaining: " + millisUntilFinished / 1000);
                resendBTN.setVisibility(View.GONE);
            }


            public void onFinish() {
                counterText.setText("0");
                resendBTN.setVisibility(View.VISIBLE);
            }
        }.start();
    }
}

