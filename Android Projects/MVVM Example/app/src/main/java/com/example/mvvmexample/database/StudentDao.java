package com.example.mvvmexample.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mvvmexample.model.Student;

import java.util.List;

/**
 * @author Jaypatelbond created on 28-12-2019.
 *
 * Created the interface for Inserting, Deleting and Quering.
 * https://developer.android.com/reference/android/arch/persistence/room/RoomDatabase
 */

@Dao
public interface StudentDao {
    @Insert
    void insert(Student student);

    @Query("SELECT * FROM student_table")
    List<Student> getAllStudents();

    @Delete
    void delete(Student student);


}
