/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AIR
 */
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }
    
    public void add(Employee employee){
        subordinates.add(employee);
    }
    
    public void remove(Employee employee){
        subordinates.remove(employee);
    }
    
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee: [ Name: "+
                name+", Dept.: "+
                department+", Salary: "+
                salary+" ]";
    }    
    
}
