package com.company.myfirstapi;

import com.company.myfirstapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class MyfirstapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstapiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Rashad",
						"developer.rashad.allahververdiyev@gmail.com",
						LocalDate.of(1993, Month.MAY,14),
						27
				)
		);
	}

}
