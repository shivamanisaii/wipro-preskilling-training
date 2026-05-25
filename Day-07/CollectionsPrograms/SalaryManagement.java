package com.wipro.Day_seven;

import java.util.*;

public class SalaryManagement {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setName("Shiva");
        e1.setSalary(50000.0);

        Employee e2 = new Employee();
        e2.setName("Sahith");
        e2.setSalary(60000.0);

        Employee e3 = new Employee();
        e3.setName("Pavan");
        e3.setSalary(45000.0);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println("Original Salaries:");
        for (Employee obj : emp) {
            System.out.println("Name: " + obj.getName() + " - Salary: " + obj.getSalary());
        }

        for (Employee obj : emp) {
            double currentSalary = obj.getSalary();
            double increasedSalary = currentSalary + (currentSalary * 0.10);
            obj.setSalary(increasedSalary);
        }

        System.out.println("\nSalaries After 10% Increase:");
        for (Employee obj : emp) {
            System.out.println("Name: " + obj.getName() + " - New Salary: " + obj.getSalary());
        }
    }
}
