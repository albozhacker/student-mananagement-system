package com.learnbydoing.SMS.service;

import com.learnbydoing.SMS.model.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeachers();
    Teacher find(Long id);

    void save(Teacher teacher);

    void remove(Teacher teacher);
}
