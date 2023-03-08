package lt.codeacademy.firma.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String name;
  @ManyToOne
 // @Cascade(CascadeType.ALL)
 // @JoinColumn()
  Department department;

  public Employee() {
  }

  public Employee(Long id, String name, Department department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  public Employee(String name, Department department) {
    this.name = name;
    this.department = department;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }
}
