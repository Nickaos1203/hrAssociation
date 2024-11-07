package org.example.hrwebapp.controller;

import org.example.hrwebapp.model.Employee;
import org.example.hrwebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/form")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/form/add")
    public String addEmployee(@ModelAttribute("employee") Employee employee, Model model) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("form/update")
    public String updateEmployee(@RequestParam("id") long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "/updateForm";

    }
}
