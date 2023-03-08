package lt.codeacademy.firma.services;

import lt.codeacademy.firma.entities.Employee;
import lt.codeacademy.firma.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll() {
        return  employeeRepository.findAll();
    }

    public void saveAll(List<Employee> list) {

        employeeRepository.saveAll(list);
    }
}
