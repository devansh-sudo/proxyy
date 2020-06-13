package com.example.proxy.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;

import com.example.proxy.ui.NotificationAdapter;

import java.util.ArrayList;



public class NotificationsFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.notification, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.contractor_recyclerview);


        ArrayList<String> list = new ArrayList<>();
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");
        list.add("Annual Function");



        NotificationAdapter adapter = new NotificationAdapter(list, getActivity());
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager_mat = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager_mat);
        recyclerView.setAdapter(adapter);


        return root;
    }
}