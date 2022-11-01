package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "UserInfo")
public class sever {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String user_id;
    public String user_password;
    public String user_name;
    public String user_address;
    public String user_phonenum;

    public sever(String user_id, String user_password, String user_name, String user_address, String user_phonenum) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_address = user_address;
        this.user_phonenum = user_phonenum;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public String getUser_password() {
        return this.user_password;
    }

    public String getUser_name(){
        return  this.user_name;
    }
    public String getUser_address(){
        return this.user_address;
    }
    public String getUser_phonenum(){
        return this.user_phonenum;
    }


}
