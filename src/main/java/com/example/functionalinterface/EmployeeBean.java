package com.example.functionalinterface;

public class EmployeeBean {
    private int empid;
    private String firstName;
    private String lastName;
    private double empSal;
    private String empDept;

    public EmployeeBean(int empid, String firstName, String lastName, double empSal, String empDept) {
        this.empid = empid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empSal = empSal;
        this.empDept = empDept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public EmployeeBean() {
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "empid=" + empid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empSal=" + empSal +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
