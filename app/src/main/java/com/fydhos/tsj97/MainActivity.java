package com.fydhos.tsj97;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.fydhos.tsj97.flat_sec.flat;
import com.fydhos.tsj97.hostel_sec.hostel;
import com.fydhos.tsj97.hotel_sec.hotel;
import com.fydhos.tsj97.profile_sec.profile;
import com.fydhos.tsj97.restaurant_sec.restaurant;
import com.google.android.material.bottomnavigation.BottomNavigationView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bottom navigation code select item show fragment this select item
        BottomNavigationView bottomNavigationView = findViewById(R.id.bott_set_dis);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new hotel()).commit();
    }
  private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod
          = new BottomNavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
          Fragment fragment = null;
          switch (item.getItemId()){

              case R.id.hotel_set_icon:
                  fragment=new hotel();
                  break;

              case R.id.rest_icon_set:
                  fragment=new restaurant();
                  break;


              case R.id.flat_icon_set:
                  fragment=new flat();
                  break;


              case R.id.hostel_set_icon:
                  fragment=new hostel();
                  break;


              case R.id.pro_icon_set:
                  fragment=new profile();
                  break;
          }
          getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,fragment).commit();

          return true;
      }
  };

}