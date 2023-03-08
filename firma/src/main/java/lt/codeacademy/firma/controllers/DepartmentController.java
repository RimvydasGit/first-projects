package lt.codeacademy.firma.controllers;

import lt.codeacademy.firma.entities.Department;
import lt.codeacademy.firma.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/department/h")
    public String hello(){
        return "Hello department";
    }
    @GetMapping("/department")
    public Iterable<Department> allBooks(){
        return departmentService.findAll();
    }
}
