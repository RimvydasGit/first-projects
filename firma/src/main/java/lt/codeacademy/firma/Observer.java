package lt.codeacademy.firma;

import lt.codeacademy.firma.entities.Address;
import lt.codeacademy.firma.entities.Department;
import lt.codeacademy.firma.entities.Employee;
import lt.codeacademy.firma.services.AddressService;
import lt.codeacademy.firma.services.DepartmentService;
import lt.codeacademy.firma.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
public class Observer {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    AddressService addressService;

    @EventListener
    public void refreshedEventHandler(ContextRefreshedEvent ev) {

        seedEmployees();
    }


    private void seedEmployees() {
        Address address = new Address("Vilnius", "Lithuania");
        addressService.save(address);
        Department department = new Department("Logistics", address);
        departmentService.save(department);
        List<Employee> list = List.of(
                new Employee("Petras", department),
                new Employee("Jonas", department)
        );
        employeeService.saveAll(list);
    }
}
