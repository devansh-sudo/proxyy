package com.example.proxy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proxy.Homescreen;
import com.example.proxy.R;

public class Login  extends AppCompatActivity {

    Button submitBTN;
    TextView linkBtn;
    EditText email, password;


    boolean flagTerms = false;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.log_in );
        email = ( EditText ) findViewById ( R.id.input_email );
        password = ( EditText ) findViewById ( R.id.input_password );


        submitBTN = ( Button ) findViewById ( R.id.login );
        linkBtn = ( TextView ) findViewById ( R.id.link_signup );
        linkBtn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( Login.this, Signup.class );
                startActivity ( i );
            }
        } );

        submitBTN.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (isValid ()) {
                    String emailS = email.getText ().toString ().trim ();

                    String passwordS = password.getText ().toString ().trim ();
                    loginMethod ( emailS, passwordS );
                }
            }

            private void loginMethod(String emailS, String passwordS) {

                String phonenumberS = email.getText ().toString ().trim ();
                Intent i = new Intent ( Login.this, Homescreen.class );
                i.putExtra ( "mobileNo", phonenumberS );
                startActivity ( i );

            }
        } );
    }

    public boolean isValid() {
        boolean flag = false;

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String mobilePattern = "[0-9]{10}";


        String emailS = email.getText ().toString ().trim ();

        String passwordS = password.getText ().toString ().trim ();


        if (emailS.matches ( emailPattern ) && emailS.length () > 0) {

            if (passwordS != null && passwordS.length () > 0) {


                flag = true;
                return flag;
            } else {
                Toast.makeText ( getApplicationContext (), "Enter valid password.", Toast.LENGTH_SHORT ).show ();
                return flag;
            }

        }else if (emailS.matches ( mobilePattern ) && emailS.length () > 0) {

            if (passwordS != null && passwordS.length () > 0) {


                flag = true;
                return flag;
            } else {
                Toast.makeText ( getApplicationContext (), "Enter valid password.", Toast.LENGTH_SHORT ).show ();
                return flag;
            }

        } else {
            Toast.makeText ( getApplicationContext (), "Please enter email/phone number", Toast.LENGTH_SHORT ).show ();
            return flag;
        }

    }



}
