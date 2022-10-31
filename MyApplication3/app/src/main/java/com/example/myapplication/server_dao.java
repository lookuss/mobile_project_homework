package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface server_dao {
    @Query("SELECT * FROM UserInfo")
    public List<sever> getAll();

    @Insert
    void insert(sever sev);

    @Update
    void update(sever sev);

    @Delete
    void delete(sever sev);
}
