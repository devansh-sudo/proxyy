package com.example.proxy.ui.event;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;
import com.example.proxy.ui.EventAdapter;




import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;

public class EventFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate (R.layout.events, container, false);
        Calendar endDate = Calendar.getInstance ();
        endDate.add (Calendar.MONTH, 7);
        Calendar startDate = Calendar.getInstance ();
        startDate.add (Calendar.MONTH, -1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder (root, R.id.calendarView)

                .startDate (startDate.getTime ())

                .endDate (endDate.getTime ())

                .build ();

        horizontalCalendar.setCalendarListener (new HorizontalCalendarListener () {

            @Override

            public void onDateSelected(Date date, int position) {


            }
        });


        RecyclerView recyclerView = root.findViewById (R.id.event_recyclerview);


        ArrayList<String> list = new ArrayList<> ();
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");
        list.add ("Annual Function");


        EventAdapter adapter = new EventAdapter (list, getActivity ());
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager_mat = new LinearLayoutManager (getActivity (), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager (layoutManager_mat);
        recyclerView.setAdapter (adapter);


        return root;
    }
}
