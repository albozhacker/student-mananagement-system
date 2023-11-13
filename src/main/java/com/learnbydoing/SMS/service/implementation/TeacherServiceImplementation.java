package com.learnbydoing.SMS.service.implementation;

import com.learnbydoing.SMS.model.Teacher;
import com.learnbydoing.SMS.repository.TeacherRepository;
import com.learnbydoing.SMS.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImplementation  implements TeacherService {

    TeacherRepository teacherRepository;


    public TeacherServiceImplementation(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher find(Long id) {
        return teacherRepository.getById(id);
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void remove(Teacher teacher) {
        teacherRepository.delete(teacher);
    }
}
