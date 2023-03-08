package lt.codeacademy.firma.services;

import lt.codeacademy.firma.entities.Department;


import lt.codeacademy.firma.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Iterable<Department> findAll() {
        return  departmentRepository.findAll();
    }

    public void saveAll(List<Department> list) {

        departmentRepository.saveAll(list);
    }

    public void save(Department a) {
       departmentRepository.save(a);
    }
}
