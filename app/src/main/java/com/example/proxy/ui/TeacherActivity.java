package com.example.proxy.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;

import java.util.ArrayList;


public class TeacherActivity extends AppCompatActivity {
   ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.teacher_detail);


        RecyclerView recyclerView = findViewById (R.id.teacher_recycle);
        backbtn = (ImageView) findViewById (R.id.teacher_back);
        backbtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();

            }
        });


        ArrayList<String> list = new ArrayList<> ();
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");
        list.add ("Teacher");


        TeacherAdapter adapter = new TeacherAdapter (list, this);
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager_mat = new LinearLayoutManager (this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager (layoutManager_mat);
        recyclerView.setAdapter (adapter);


    }

}
