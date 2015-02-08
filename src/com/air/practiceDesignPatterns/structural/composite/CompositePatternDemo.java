/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.composite;

/**
 *
 * @author AIR
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Atiq", "CEO", 200000);
        
        Employee headSales = new Employee("Rony", "Sales", 100000);
        Employee headMarketing = new Employee("Ripu", "Marketing",100000);
        
        Employee clerk1 = new Employee("Abdul", "Marketing", 50000);
        Employee clerk2 = new Employee("Abul", "Marketing", 50000);
        
        Employee salesExecutive1 = new Employee("Rohim", "Sales", 50000);
        Employee salseExecutive2 = new Employee("Korim","Sales",50000);
        
        ceo.add(headSales);
        ceo.add(headMarketing);
        
        headSales.add(salesExecutive1);
        headSales.add(salseExecutive2);
        
        headMarketing.add(clerk2);
        headMarketing.add(clerk1);
        
        // print all employees of the organization
        System.out.println(ceo);
        for(Employee ceoSubordinate: ceo.getSubordinates()){
            System.out.println("\t"+ceoSubordinate);
            for(Employee ceoSubordinatesSubordinate: ceoSubordinate.getSubordinates()){
                System.out.println("\t\t"+ceoSubordinatesSubordinate);
            }
        }
    }
}
