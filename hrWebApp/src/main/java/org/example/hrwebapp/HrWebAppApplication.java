package org.example.hrwebapp;

import org.example.hrwebapp.model.Employee;
import org.example.hrwebapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrWebAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrWebAppApplication.class, args);
	}
}
