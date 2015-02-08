/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AIR
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("Atiq", "Male", "Married"));
        persons.add(new Person("Rony", "male", "single"));
        persons.add(new Person("Aisha", "female", "Married"));
        persons.add(new Person("Mukta", "female", "single"));
        persons.add(new Person("Ripu", "male", "Single"));
                
        Criteria malePersons = new CriteriaMale();
        Criteria femalePersons = new CriteriaFemale();
        Criteria singlePersons = new CriteriaSingle();
        Criteria singleAndFemalePersons = new AndCriteria(singlePersons, femalePersons);
        Criteria singleOrFemalePersons = new OrCriteria(singlePersons, femalePersons);
        //Criteria 
        System.out.println("Males are: ");
        printPersons(malePersons.meetCriteria(persons));
        
        System.out.println("Females are: ");
        printPersons(femalePersons.meetCriteria(persons));
        
        System.out.println("Female and Single persons are: ");
        printPersons(singleAndFemalePersons.meetCriteria(persons));
        
        System.out.println("Female or Single persons are: ");
        printPersons(singleOrFemalePersons.meetCriteria(persons));
    }

    private static void printPersons(List<Person> persons) {
        for(Person person: persons){
            System.out.println("Person: [ Name: "+
                    person.getName()+", Gender: "+
                    person.getGender()+", MaritalStatus: "+
                    person.getMaritalStatus()+" ]");
        }
    }
}
