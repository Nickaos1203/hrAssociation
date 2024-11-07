package org.example.hrwebapp.service;

import lombok.Data;
import org.example.hrwebapp.model.Employee;
import org.example.hrwebapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployeeService {

    @Autowired
    EmployeeProxy employeeProxy;

    public List<Employee> getEmployees(){
        return employeeProxy.getEmployees();
    }

    public Employee getEmployeeById(long id) {
        return employeeProxy.getEmployee(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee;

        // Règle de gestion : Le nom de famille doit être mis en majuscule.
        employee.setLast_name(employee.getLast_name().toUpperCase());

        if(employee.getId() == null) {
            // Si l'id est nul, alors c'est un nouvel employé.
            savedEmployee = employeeProxy.createEmployee(employee);
        } else {
            savedEmployee = employeeProxy.updateEmployee(employee);
        }

        return savedEmployee;
    }
}
