package org.company.spring.mvc_hibernate_firstapp.service;

import org.company.spring.mvc_hibernate_firstapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
