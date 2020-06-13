package com.example.proxy.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;

import java.util.ArrayList;

public class TeacherAdapter  extends RecyclerView.Adapter<TeacherAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public TeacherAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public TeacherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.teacher, parent, false );
        TeacherAdapter.ViewHolder viewHolder = new TeacherAdapter.ViewHolder( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final TeacherAdapter.ViewHolder holder, int position) {
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout teacher;
        TextView teachername;


        public ViewHolder(View itemView) {
            super ( itemView );
            teachername = (TextView) itemView.findViewById ( R.id.teacher_name );


        }
    }
}

