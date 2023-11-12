package com.learnbydoing.SMS.controller;

import com.learnbydoing.SMS.model.Student;
import com.learnbydoing.SMS.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        // student object is going to have the values passed from the view
        Student student = new Student();
        model.addAttribute("student", student);

        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",  studentService.find(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String saveStudent(@PathVariable Long id, @ModelAttribute Student student,Model model){
        Student existingStudent = studentService.find(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.save(existingStudent);

        return "redirect:/students";
    }

    @GetMapping("/students/remove/{id}")
    public String removeStudent(@PathVariable(name = "id") Long studentId) {
        Student studentToBeRemoved = studentService.find(studentId);
        studentService.remove(studentToBeRemoved);
        return "redirect:/students";
    }
}
