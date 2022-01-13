public class Employee {
    // private instance variables
    private String name;
    private double salary;

    // Employee super constructor
    public Employee(String employeeName, double employeeSalary){
        this.name = employeeName;
        this.salary = employeeSalary;
    }

    // toString method prints name and salary
    public String toString(){
        return  "Name: " + name + "\nSalary: $" + salary;
    }
}
