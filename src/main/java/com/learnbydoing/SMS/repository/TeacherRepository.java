package com.learnbydoing.SMS.repository;

import com.learnbydoing.SMS.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
