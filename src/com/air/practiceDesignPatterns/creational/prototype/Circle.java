/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.creational.prototype;

/**
 *
 * @author AIR
 */
public class Circle extends Shape{

    Circle(){
        type = "circle";
    }
    
    @Override            
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    
}
