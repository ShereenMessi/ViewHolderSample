package com.example.android.viewholdersample;

/**
 * Created by Shereen on 10/22/2017.
 */

public class Location {
    private String Name;
    private  String Address;

    public Location(String name, String address) {
        Name = name;
        Address=address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
