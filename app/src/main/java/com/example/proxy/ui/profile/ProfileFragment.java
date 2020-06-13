package com.example.proxy.ui.profile;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.proxy.R;


import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    boolean flagAbout = false;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.profile, container, false);


        RelativeLayout aboutTab = (RelativeLayout) root.findViewById(R.id.about_tab);
        final ImageView aboutIcon = (ImageView) root.findViewById(R.id.about_more);
        final LinearLayout closeAbout = (LinearLayout)root.findViewById(R.id.close_about_us);


        aboutTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    closeAbout.setVisibility(View.GONE);
                    aboutIcon.setBackgroundResource(R.drawable.ic_expand_more);
                     flagAbout = false;
                }else {
                    closeAbout.setVisibility(View.VISIBLE);
                    aboutIcon.setBackgroundResource(R.drawable.expand_less);
                     flagAbout = true;
                }
            }
        });


        RelativeLayout academictab = (RelativeLayout) root.findViewById(R.id.academic_tab);
        final ImageView academicicon = (ImageView) root.findViewById(R.id.academic_more);
        final LinearLayout academicclose = (LinearLayout)root.findViewById(R.id.academic_close);


        academictab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    academicclose.setVisibility(View.GONE);
                    academicicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    academicclose.setVisibility(View.VISIBLE);
                    academicicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });



        RelativeLayout achivementtab = (RelativeLayout) root.findViewById(R.id.achivement_tab);
        final ImageView achivementicon = (ImageView) root.findViewById(R.id.achivement_more);
        final LinearLayout achivementclose = (LinearLayout)root.findViewById(R.id.achivement_close);


        achivementtab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    achivementclose.setVisibility(View.GONE);
                    achivementicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    achivementclose.setVisibility(View.VISIBLE);
                    achivementicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });


        RelativeLayout gradetab = (RelativeLayout) root.findViewById(R.id.grade_tab);
        final ImageView gradeicon = (ImageView) root.findViewById(R.id.grade_more);
        final LinearLayout gradeclose = (LinearLayout)root.findViewById(R.id.grade_close);


        gradetab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    gradeclose.setVisibility(View.GONE);
                    gradeicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    gradeclose.setVisibility(View.VISIBLE);
                    gradeicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });


        RelativeLayout leavetab = (RelativeLayout) root.findViewById(R.id.class_leave_tab);
        final ImageView leaveicon = (ImageView) root.findViewById(R.id.class_leave_more);
        final LinearLayout leaveclose = (LinearLayout)root.findViewById(R.id.leave_close);


        leavetab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    leaveclose.setVisibility(View.GONE);
                    leaveicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    leaveclose.setVisibility(View.VISIBLE);
                    leaveicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });


        RelativeLayout settingtab = (RelativeLayout) root.findViewById(R.id.setting_tab);
        final ImageView settingicon = (ImageView) root.findViewById(R.id.setting_more);
        final LinearLayout settingclose = (LinearLayout)root.findViewById(R.id.close_setting);


        settingtab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    settingclose.setVisibility(View.GONE);
                    settingicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    settingclose.setVisibility(View.VISIBLE);
                    settingicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });


        RelativeLayout helptab = (RelativeLayout) root.findViewById(R.id.help_tab);
        final ImageView helpicon = (ImageView) root.findViewById(R.id.help_more);
        final LinearLayout helpclose = (LinearLayout)root.findViewById(R.id.help_close);


        helptab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAbout){
                    helpclose.setVisibility(View.GONE);
                    helpicon.setBackgroundResource(R.drawable.ic_expand_more);
                    flagAbout = false;
                }else {
                    helpclose.setVisibility(View.VISIBLE);
                    helpicon.setBackgroundResource(R.drawable.expand_less);
                    flagAbout = true;
                }
            }
        });

        return root;
    }
}








