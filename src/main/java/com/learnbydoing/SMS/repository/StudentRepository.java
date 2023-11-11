package com.learnbydoing.SMS.repository;

import com.learnbydoing.SMS.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
