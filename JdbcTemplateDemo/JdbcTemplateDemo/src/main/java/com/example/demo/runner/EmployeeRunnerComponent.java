package com.example.demo.runner;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRunnerComponent implements ApplicationRunner {

    @Autowired
    private EmployeeService employeeService;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        //call save
        Employee employee=new Employee();
        employee.setEmpNo(1);
        employee.setEmpName("Amruta");
        employee.setSal(60000);
        employee.setDeptNo(90);
        employeeService.save(employee);
        System.out.println("==**==".repeat(10));

        //call findById
        Employee employee1=employeeService.findById(1);
        System.out.println(employee1);
        System.out.println("==**==".repeat(10));


        //call findall
        List<Employee> lst=employeeService.findAll();
        lst.forEach(System.out::println);
    }
}
