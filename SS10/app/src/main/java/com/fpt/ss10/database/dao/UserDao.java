package com.fpt.ss10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.fpt.ss10.database.model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    long insertUser(User user);

    @Update
    int updateUser(User user);

    @Delete
    int deleteUser(User user);

    @Query("Select * from user where id = :id ")
    User findUser(int id);

    @Query("Select * from user")
    List<User> getAllUser();
}
