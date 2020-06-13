package com.example.proxy.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proxy.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;

public class DocumentActivity extends AppCompatActivity {
    ImageView backbtn;
    FloatingActionButton adddoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.document_detail);


        RecyclerView recyclerView = findViewById (R.id.document_recyclerview);

        backbtn = findViewById (R.id.document_back);
        adddoc = findViewById (R.id.add_document);

        adddoc.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                popUpMethod ();
            }
        });

        backbtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();

            }
        });


        ArrayList<String> list = new ArrayList<> ();
        list.add ("Document");
        list.add ("Document");
        list.add ("Document");
        list.add ("Document");
        list.add ("Document");
        list.add ("Document");
        list.add ("Document");


        DocumentAdapter adapter = new DocumentAdapter (list, this);
        recyclerView.setHasFixedSize (true);
        LinearLayoutManager layoutManager_mat = new LinearLayoutManager (this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager (layoutManager_mat);
        recyclerView.setAdapter (adapter);
    }

    public void popUpMethod() {

        final BottomSheetDialog dialogAdd = new BottomSheetDialog (this, R.style.DialogSlideAnim);

        dialogAdd.setCanceledOnTouchOutside (false);
        Window window = dialogAdd.getWindow ();
        dialogAdd.requestWindowFeature (Window.FEATURE_NO_TITLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags (WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor (ContextCompat.getColor (this, android.R.color.transparent));
            View decor = this.getWindow ().getDecorView ();
            decor.setSystemUiVisibility (View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        WindowManager.LayoutParams wlp = window.getAttributes ();

        wlp.gravity = Gravity.BOTTOM;
        wlp.dimAmount = 0.5f;

        dialogAdd.getWindow ().addFlags (WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        // wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes (wlp);
        // Include dialog.xml file
        dialogAdd.setContentView (R.layout.document_popup);

        window.setLayout (WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);


        Button submitPopup = dialogAdd.findViewById (R.id.submit_doc);
        Button canclePopup = dialogAdd.findViewById (R.id.cancel_doc);

        submitPopup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText (getApplicationContext (), "Document has been Uploded", Toast.LENGTH_SHORT).show ();
            }
        });


        dialogAdd.show ();

        canclePopup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialogAdd.cancel ();
            }
        });


    }



}

