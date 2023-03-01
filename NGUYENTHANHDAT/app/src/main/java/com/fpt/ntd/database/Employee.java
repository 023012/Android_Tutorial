package com.fpt.ntd.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "employee")
public class Employee {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "empName")
    public String empName;

    @ColumnInfo(name = "designation")
    public String designation;

    @ColumnInfo(name = "salary")
    public String salary;
}
