package com.example.proxy.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;

public class DailyActivity  extends AppCompatActivity {

    Fragment currentFragment ;
    FragmentTransaction ft ;
    ImageView backBTn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView(R.layout.daily_detail);

        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 7);
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(this, R.id.calendarView)

                .startDate(startDate.getTime())

                .endDate(endDate.getTime())

                .build();

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {

            @Override

            public void onDateSelected(Date date, int position) {


            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.daily_recyclerview);

        backBTn = (ImageView)findViewById ( R.id.daily_back );
        backBTn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        } );


        ArrayList<String> list = new ArrayList<>();
        list.add("DBMS");
        list.add("DBMS");
        list.add("DBMS");
        list.add("DBMS");





        DailyAdapter adapter = new DailyAdapter(list, this);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager_mat = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager_mat);
        recyclerView.setAdapter(adapter);




    }

}
