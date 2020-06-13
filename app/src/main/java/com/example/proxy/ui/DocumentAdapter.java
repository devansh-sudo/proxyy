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

public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.ViewHolder> {
    ArrayList<String> list;

    Context con;
    // RecyclerView recyclerView;
    public DocumentAdapter(ArrayList<String> listdata,Context co) {
        this.list = listdata;
        this.con = co;
    }

    @Override
    public DocumentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext () );
        View listItem = layoutInflater.inflate ( R.layout.document, parent, false );
        DocumentAdapter.ViewHolder viewHolder = new DocumentAdapter.ViewHolder( listItem );
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(final DocumentAdapter.ViewHolder holder, int position) {
    }


    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout document;
        TextView documentname;



        public ViewHolder(View itemView) {
            super ( itemView );
            documentname = (TextView) itemView.findViewById ( R.id.document_name );


        }
    }
}


