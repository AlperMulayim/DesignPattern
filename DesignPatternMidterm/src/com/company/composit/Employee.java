package com.company.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alper on 24.11.2016.
 */
public class Employee {
    private String name;
    private String depth;
    private double salary;

    private List<Employee>  employeList ;


    public Employee(String name , String depth , double salary)
    {
        this.name = name;
        this.depth = depth;
        this.salary = salary;

        employeList = new ArrayList<>();
    }

    public void add(Employee emp)
    {
        employeList.add(emp);
    }

    public void remove(Employee emp)
    {
        employeList.remove(emp);
    }

    public List<Employee> getEmployeList()
    {
        return employeList;
    }

    public String toString()
    {
        return   ("Employee :[ Name : " + name + ", dept : " + depth + ", salary :" + salary+" ]");
    }



}
