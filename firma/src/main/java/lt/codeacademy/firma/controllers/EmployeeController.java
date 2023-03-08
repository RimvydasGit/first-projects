package lt.codeacademy.firma.controllers;

import lt.codeacademy.firma.entities.Employee;
import lt.codeacademy.firma.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/company")
public class EmployeeController {

        @Autowired
        EmployeeService employeeService;
        @GetMapping("/employee/h")
        public String hello(){
            return "Hello employee";
        }
        @GetMapping
        public String hi(){
        return "Hello company";
    }
        @GetMapping("/employee")
        public Iterable<Employee> allBooks(){
            return employeeService.findAll();
        }
}
