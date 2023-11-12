package com.learnbydoing.SMS;

import com.learnbydoing.SMS.model.Student;
import com.learnbydoing.SMS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsSpringBootAndThymeleafApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsSpringBootAndThymeleafApplication.class, args);

	}

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student = null;
		for (int i = 1; i <= 5; i++){

			student = new Student("Firstname "+ i, "Lastname "+i, i+"@gmail.com");
			studentRepository.save(student);
		}
		*/

    }
}
