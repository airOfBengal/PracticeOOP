/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.filter;

import java.util.List;

/**
 *
 * @author AIR
 */
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(persons);
        
        for(Person person: secondCriteriaPersons){
            if(!firstCriteriaPersons.contains(person)){
                firstCriteriaPersons.add(person);
            }
        }
        
        return firstCriteriaPersons;
    }
    
    
}
