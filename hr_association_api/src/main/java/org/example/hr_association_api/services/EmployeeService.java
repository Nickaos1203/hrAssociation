package org.example.hr_association_api.services;

import lombok.Data;
import org.example.hr_association_api.models.Employee;
import org.example.hr_association_api.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployee(final Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    public Employee  updateEmployee(final long id, Employee employee) {
        Employee employeeExisted = getEmployee(id);
        if (employeeExisted != null) {
            employeeRepository.save(employee);
        }
        return employeeExisted;
    }
}
