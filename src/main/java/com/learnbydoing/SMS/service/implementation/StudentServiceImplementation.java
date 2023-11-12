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

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student find(Long studentId) {
        return studentRepository.getById(studentId);
    }

    @Override
    public void remove(Student student) {
        studentRepository.delete(student);
    }
}
