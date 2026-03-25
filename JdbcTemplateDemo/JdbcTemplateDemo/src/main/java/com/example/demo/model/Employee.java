package com.example.demo.model;

public class Employee {
    private int empNo;
    private String empName;
    private double sal;
    private int deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

   /* public Employee(int empNo, String empName, double sal, int deptNo) {
        this.empNo = empNo;
        this.empName = empName;
        this.sal = sal;
        this.deptNo = deptNo;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                ", deptNo=" + deptNo +
                '}';
    }
}
