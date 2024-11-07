package org.example.hrwebapp;

import org.example.hrwebapp.model.Employee;
import org.example.hrwebapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrWebAppApplication implements CommandLineRunner {
	@Autowired
	private CustomProperties props;
    @Autowired
    private EmployeeProxy employeeProxy;

	public static void main(String[] args) {
		SpringApplication.run(HrWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeProxy.deleteEmployee(4);
		System.out.println(employeeProxy.getEmployees());
	}

}
