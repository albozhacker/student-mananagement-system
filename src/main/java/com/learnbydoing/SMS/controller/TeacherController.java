package com.learnbydoing.SMS.controller;

import com.learnbydoing.SMS.model.Teacher;
import com.learnbydoing.SMS.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {

    TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public String listTeachers(Model model){
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }

    @GetMapping("/teachers/new")
    public String newTeacherForm(Model model){
        model.addAttribute("teacher", new Teacher());
        return "create_teacher";
    }

    @PostMapping("/teachers")
    public String createTeacher(@ModelAttribute Teacher teacher){
        teacherService.save(teacher);
        return "redirect:/teachers";
    }

    @PostMapping("/teachers/{id}")
    public String saveStudent(@PathVariable Long id, @ModelAttribute Teacher teacher){
        Teacher existingTeacher = teacherService.find(id);
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setEmail(teacher.getEmail());

        teacherService.save(existingTeacher);

        return "redirect:/teachers";
    }

    @GetMapping("/teachers/remove/{id}")
    public String removeStudent(@PathVariable(name = "id") Long teacherId){
        Teacher teacherToBeAdded = teacherService.find(teacherId);
        teacherService.remove(teacherToBeAdded);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacher(@PathVariable(name = "id") Long teacherId, Model model){
        Teacher teacherToBeEdited = teacherService.find(teacherId);
        model.addAttribute("teacher", teacherToBeEdited);

        return "edit_teacher";
    }
}
