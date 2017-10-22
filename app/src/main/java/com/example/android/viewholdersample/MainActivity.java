package com.example.android.viewholdersample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.viewholdersample.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        ArrayList<Location> locations=new ArrayList<>();
        locations.add(new Location("Barista Cafe","AinKawa, Erbil"));
        locations.add(new Location("Male Chalak","Suly"));
        locations.add(new Location("Kaba khany Kabab","Erbil"));
        LocationArrayAdapter adapter=new LocationArrayAdapter(this,R.layout.location_list_item,locations);


        binding.listView.setAdapter(adapter);

    }
}
