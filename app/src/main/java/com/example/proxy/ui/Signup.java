package com.example.proxy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proxy.R;

public class Signup extends AppCompatActivity {

    TextView linkBtn;
    EditText name, phonenumber, email, password, clg;
    Button submitBTn;
    CheckBox checkBox;
    boolean flagTerms = false;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.sign_up);

        linkBtn = (TextView)findViewById(R.id.link_signup);
        submitBTn = (Button) findViewById(R.id.proceed);
        name = (EditText) findViewById(R.id.input_email);
        phonenumber = (EditText) findViewById(R.id.phonenumber);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        clg = (EditText) findViewById(R.id.clg);
        checkBox = (CheckBox)findViewById(R.id.term_checkbox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    flagTerms = true;
                }else {
                    flagTerms = false;
                }
            }
        });
        linkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this, Login.class);
                startActivity(i);
            }
        });
        submitBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    String phonenumberS = phonenumber.getText().toString().trim();
                    Intent i = new Intent(Signup.this, Otp.class);
                    i.putExtra("mobileNo",phonenumberS);
                    startActivity(i);



                    signupMethod ();
                }
            }
        });
    }

    private void signupMethod() {

        String phonenumberS = email.getText ().toString ().trim ();
        Intent i = new Intent ( Signup.this, Otp.class );
        i.putExtra ( "mobileNo", phonenumberS );
        startActivity ( i );

    }

    public boolean isValid() {
        boolean flag = false;

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        String nameS = name.getText().toString().trim();
        String phonenumberS = phonenumber.getText().toString().trim();
        String emailS = email.getText().toString().trim();
        String passwordS = password.getText().toString().trim();
        String clgS = clg.getText().toString().trim();

        if (nameS != null && nameS.length() > 0) {

            if (phonenumberS != null && phonenumberS.length() > 9) {

                if (emailS.matches(emailPattern) && emailS.length() > 0) {

                    if (passwordS != null && passwordS.length() > 0) {


                        if (clgS != null && clgS.length() > 0 && passwordS.equalsIgnoreCase(clgS)) {

                            if (flagTerms) {

                                flag = true;
                                return flag;
                            }else {
                                Toast.makeText(getApplicationContext(), "Please accept terms and conditions.", Toast.LENGTH_SHORT).show();
                                return  flag;
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Both password must be same.", Toast.LENGTH_SHORT).show();
                            return  flag;
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Enter valid password", Toast.LENGTH_SHORT).show();
                        return  flag;
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Enter valid email.", Toast.LENGTH_SHORT).show();
                    return  flag;

                }

            } else {
                Toast.makeText(getApplicationContext(), "Enter valid mobile no.", Toast.LENGTH_SHORT).show();
                return  flag;

            }


        } else {
            Toast.makeText(getApplicationContext(), "Please enter name", Toast.LENGTH_SHORT).show();
            return  flag;

        }


    }

}
