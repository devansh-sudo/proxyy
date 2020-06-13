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

public class DailyAdapter  extends RecyclerView.Adapter<DailyAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public DailyAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.daily_row, parent, false );
        ViewHolder viewHolder = new ViewHolder ( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout daily;
        TextView subjectname;


        public ViewHolder(View itemView) {
            super ( itemView );
             subjectname = (TextView) itemView.findViewById ( R.id.subject_name );


        }
    }
}
