package com.example.SpringBootDemo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student shashikala = new Student(
                    "Shashikala",
                    LocalDate.of(2000, MAY, 29),
                    "shashi@gmail.com"
            );
            Student sewwandi = new Student(
                    "Sewwandi",
                    LocalDate.of(2005, MARCH, 20),
                    "sew@gmail.com"
            );

            repository.saveAll(List.of(shashikala, sewwandi));
        };
    }
}
