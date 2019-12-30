package com.example.mvvmexample.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * @author Jaypatelbond created on 29-12-2019.
 * Model class
 */


@Entity(tableName = "student_table")
public class Student {

    @PrimaryKey(autoGenerate = true)
    private int studentId;
    private String name;
    private String email;
    private String country;
    private String registeredTime;

    @Ignore
    public Student() {
    }

    public Student(int studentId, String name, String email, String country, String registeredTime) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.country = country;
        this.registeredTime = registeredTime;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
    }
}