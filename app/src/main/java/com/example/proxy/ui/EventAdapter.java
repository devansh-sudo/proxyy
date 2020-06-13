package com.example.proxy.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.proxy.R;

import java.util.ArrayList;

public class EventAdapter  extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public EventAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.event_detail_row, parent, false );
        ViewHolder viewHolder = new ViewHolder ( listItem );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.textViewEvent.setText ( list.get ( position ) );
        holder.eventclose.setVisibility(View.GONE);
        holder.eventopen.setVisibility(View.VISIBLE);
        holder.eventclose.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                holder.eventopen.setVisibility(View.VISIBLE);
                holder.eventclose.setVisibility(View.GONE);

            }
        } );

        holder.eventopen.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                holder.eventclose.setVisibility(View.VISIBLE);
                holder.eventopen.setVisibility(View.GONE);

            }
        } );
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout eventopen;
        TextView textViewEvent;
        LinearLayout eventclose;
        public ViewHolder(View itemView) {
            super ( itemView );
            textViewEvent = (TextView)itemView.findViewById(R.id.text_event);
            eventopen = (LinearLayout) itemView.findViewById ( R.id.open_lay );
            eventclose= (LinearLayout)itemView.findViewById ( R.id.close_lay );


        }
    }
}
