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

public class PercentageAdapter extends RecyclerView.Adapter<PercentageAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public PercentageAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public PercentageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.monthly_percent_adpter, parent, false );
        PercentageAdapter.ViewHolder viewHolder = new PercentageAdapter.ViewHolder( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final PercentageAdapter.ViewHolder holder, int position) {
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout monthly;
        TextView percent;


        public ViewHolder(View itemView) {
            super ( itemView );
            percent = (TextView) itemView.findViewById ( R.id.percent_layout );


        }
    }
}


