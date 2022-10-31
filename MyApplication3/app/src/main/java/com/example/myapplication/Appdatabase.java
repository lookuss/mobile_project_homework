package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {sever.class}, version = 1)
public abstract class Appdatabase extends RoomDatabase {
    public abstract server_dao server_d();
}
