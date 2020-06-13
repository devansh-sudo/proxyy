package com.example.proxy.ui.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.proxy.R;
import com.example.proxy.ui.DailyActivity;
import com.example.proxy.ui.DocumentActivity;
import com.example.proxy.ui.MonthlyActivity;
import com.example.proxy.ui.SemesterActivity;
import com.example.proxy.ui.TeacherActivity;


public class DashboardFragment extends Fragment {


    private DashboardViewModel dashboardViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.dashboard, container, false);
        LinearLayout dailybtn = root.findViewById(R.id.daily_layout);
        LinearLayout monthybtn = root.findViewById(R.id.monthly_layout);
        LinearLayout semesterbtn = root.findViewById(R.id.semester_layout);
        LinearLayout teacherbtn = root.findViewById(R.id.teacher_layout);
        LinearLayout documentbtn = root.findViewById(R.id.document_layout);


        dailybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent ( getActivity(), DailyActivity.class );
                getActivity().startActivity ( in );
            }
        });

        monthybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent ( getActivity(), MonthlyActivity.class );
                getActivity().startActivity ( in );
            }
        });

        teacherbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent ( getActivity(), TeacherActivity.class );
                getActivity().startActivity ( in );
            }
        });

        semesterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent ( getActivity(), SemesterActivity.class );
                getActivity().startActivity ( in );
            }
        });

        documentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent ( getActivity(), DocumentActivity.class );
                getActivity().startActivity ( in );
            }
        });
        return root;

    }


}