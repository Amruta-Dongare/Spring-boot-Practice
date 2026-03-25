package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Employee employee){
        String sql="INSERT INTO emp VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,employee.getEmpNo(),employee.getEmpName(),employee.getSal(),employee.getDeptNo());
        System.out.println("Employee have saved Successfully");
    }

    public Employee findById(int empNo){
        String sql="SELECT * FROM emp WHERE empNo=?";

        RowMapper<Employee> rowMapper=new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee=new Employee();
                employee.setEmpNo(rs.getInt("empNo"));
                employee.setEmpName(rs.getString("empName"));
                employee.setSal(rs.getDouble("sal"));
                employee.setDeptNo(rs.getInt("deptNo"));
                return employee;
            }
        };
        List<Employee> emp=jdbcTemplate.query(sql,rowMapper,empNo);
        return emp.get(0);
    }

    public List<Employee> findAll(){
        String sql="SELECT * FROM emp";

        RowMapper<Employee> rowMapper=(rs, rowNum) ->{
            Employee employee=new Employee();
            employee.setEmpNo(rs.getInt("empNo"));
            employee.setEmpName(rs.getString("empName"));
            employee.setSal(rs.getDouble("sal"));
            employee.setDeptNo(rs.getInt("deptNo"));
            return employee;
        };

        List<Employee> emp=jdbcTemplate.query(sql,rowMapper);
        return  emp;
    }
}
