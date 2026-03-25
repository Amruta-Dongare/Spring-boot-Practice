package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee findById(int empNo){
        return employeeRepository.findById(empNo);
    }
    public List<Employee> findAll(){
        return  employeeRepository.findAll();
    }
}
