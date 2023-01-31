package org.company.spring.mvc_hibernate_firstapp.service;

import org.company.spring.mvc_hibernate_firstapp.dao.EmployeeDAO;
import org.company.spring.mvc_hibernate_firstapp.dao.EmployeeDAOImpl;
import org.company.spring.mvc_hibernate_firstapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
