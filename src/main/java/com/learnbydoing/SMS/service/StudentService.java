package com.learnbydoing.SMS.service;

import com.learnbydoing.SMS.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    void save(Student student);
    Student find(Long studentId);
    void remove(Student student);

}
