package com.example.proxy.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public NotificationAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.notification_detail, parent, false );
        ViewHolder viewHolder = new ViewHolder ( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;

        LinearLayout contractor;
        public ViewHolder(View itemView) {
            super ( itemView );
            this.name = (TextView) itemView.findViewById ( R.id.time );
            contractor= (LinearLayout)itemView.findViewById ( R.id.notification );


        }
    }
}

