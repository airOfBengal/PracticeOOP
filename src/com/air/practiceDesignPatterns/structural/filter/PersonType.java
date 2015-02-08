/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.filter;

/**
 *
 * @author AIR
 */
public enum PersonType {
    MALE,FEMALE,SINGLE,MARRIED;
    
    @Override    
    public String toString() {
        switch(this){
            case FEMALE:
                return "female";
            case SINGLE:
                return "single";
            case MARRIED:
                return "married";
            default:
                return "male";
        }
    }
}
