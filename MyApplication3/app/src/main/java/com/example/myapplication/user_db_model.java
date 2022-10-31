package com.example.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

public class user_db_model extends AndroidViewModel {
    public Appdatabase db;

    public user_db_model(@NonNull Application application) {
        super(application);
        db  = Room.databaseBuilder(application, Appdatabase.class, "user-db")
                .allowMainThreadQueries()
                .build();
    }

    public LiveData<List<sever>> getAll() {
        return (LiveData<List<sever>>) db.server_d().getAll();
    }

}
