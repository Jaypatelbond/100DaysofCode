package com.example.mvvmexample.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mvvmexample.model.Student;

/**
 * @author Jaypatelbond created on 28-12-2019.
 * @apiNote The RoomDatabase is created with the annotation @Database and giving the entity reference of Student class
 */

@Database(entities = {Student.class}, version = 1)
public abstract class StudentAppDatabase extends RoomDatabase {
    public abstract StudentDao getStudentDao();

}