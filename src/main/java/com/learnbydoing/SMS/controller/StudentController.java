package com.learnbydoing.SMS.controller;

import com.learnbydoing.SMS.service.implementation.StudentServiceImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentServiceImplementation studentServiceImplementation;


    public StudentController(StudentServiceImplementation studentServiceImplementation) {
        this.studentServiceImplementation = studentServiceImplementation;
    }

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentServiceImplementation.getAllStudents());
        return "students";
    }
}
