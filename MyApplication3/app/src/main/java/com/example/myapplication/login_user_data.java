package com.example.myapplication;

import android.app.Application;

public class login_user_data extends Application {
    private String id;
    private String name;
    private String address;
    private String number;

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
