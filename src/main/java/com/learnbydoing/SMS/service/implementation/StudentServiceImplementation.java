package com.learnbydoing.SMS.service.implementation;

import com.learnbydoing.SMS.model.Student;
import com.learnbydoing.SMS.repository.StudentRepository;
import com.learnbydoing.SMS.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
