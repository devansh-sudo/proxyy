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

public class SemesterAdapter  extends RecyclerView.Adapter<SemesterAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public SemesterAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public SemesterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.semester, parent, false );
        SemesterAdapter.ViewHolder viewHolder = new SemesterAdapter.ViewHolder( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final SemesterAdapter.ViewHolder holder, int position) {
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout semester;
        TextView semsterno;


        public ViewHolder(View itemView) {
            super ( itemView );
            semsterno = (TextView) itemView.findViewById ( R.id.semester_year );


        }
    }
}

