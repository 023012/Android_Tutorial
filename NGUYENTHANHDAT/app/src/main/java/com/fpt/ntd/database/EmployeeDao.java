package com.fpt.ntd.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Insert
    long insertEmployee(Employee emp);

    @Update
    int updateEmployee(Employee emp);

    @Delete
    int deleteEmployee(Employee emp);

    @Query("Select * from employee where id = :id")
    Employee findEmployee(int id);

    @Query("Select * from employee")
    List<Employee> getAllEmployee();
}
