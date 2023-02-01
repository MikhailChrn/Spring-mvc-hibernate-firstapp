package org.company.spring.mvc_hibernate_firstapp.dao;

import org.company.spring.mvc_hibernate_firstapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
