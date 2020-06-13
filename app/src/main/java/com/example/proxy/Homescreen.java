package com.example.proxy;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.proxy.ui.dashboard.DashboardFragment;
import com.example.proxy.ui.event.EventFragment;
import com.example.proxy.ui.notifications.NotificationsFragment;
import com.example.proxy.ui.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homescreen extends AppCompatActivity {

    Fragment currentFragment ;
    FragmentTransaction ft ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView(R.layout.homescreen );


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.nav_view);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setItemIconTintList(null);
        currentFragment = new DashboardFragment ();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment, currentFragment);
        ft.commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                    currentFragment = new DashboardFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.nav_host_fragment, currentFragment);
                    ft.commit();
                    return true;

                case R.id.navigation_events:
                    currentFragment = new EventFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.nav_host_fragment, currentFragment);
                    ft.commit();
                     return true;

                case R.id.navigation_notifications:
                    currentFragment = new NotificationsFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.nav_host_fragment, currentFragment);
                    ft.commit();
                    return true;

                case R.id.navigation_profile:
                    currentFragment = new ProfileFragment();
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.nav_host_fragment, currentFragment);
                    ft.commit();
                    return true;
            }
            return false;
        }
    };
}
