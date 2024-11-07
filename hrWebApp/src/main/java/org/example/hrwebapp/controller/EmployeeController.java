package org.example.hrwebapp.controller;

import org.example.hrwebapp.model.Employee;
import org.example.hrwebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        List<Employee> listEmployees = employeeService.getEmployees();
        model.addAttribute("employees", listEmployees);
        return "home";
    }

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable("id") long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "detailEmployee";
    }
}
