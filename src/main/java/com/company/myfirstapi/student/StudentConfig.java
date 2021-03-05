package com.company.myfirstapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JUNE;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student rashad = new Student(
                    "Rashad",
                    "developer.rashad.allahververdiyev@gmail.com",
                    LocalDate.of(1993, MAY, 14),
                    27
            );
            Student rovshen = new Student(
                    "Rovshen",
                    "rovshen.allahververdiyev@gmail.com",
                    LocalDate.of(1995, JUNE, 14),
                    25
            );
            repository.saveAll(
                    List.of(rashad, rovshen)
            );
        };
    }
}
