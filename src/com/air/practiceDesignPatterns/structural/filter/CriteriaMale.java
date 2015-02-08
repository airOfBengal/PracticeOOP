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
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase(PersonType.MALE.toString())){
                malePersons.add(person);
            }
        }
        
        return malePersons;
    }
    
}
