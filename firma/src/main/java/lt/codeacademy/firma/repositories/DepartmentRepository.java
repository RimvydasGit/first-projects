package lt.codeacademy.firma.repositories;

import lt.codeacademy.firma.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
