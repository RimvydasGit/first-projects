package lt.codeacademy.firma.repositories;

import lt.codeacademy.firma.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
