package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findById(Long id);

    Employee update(Long id, Employee employee);

    void delete(Long id);


}
