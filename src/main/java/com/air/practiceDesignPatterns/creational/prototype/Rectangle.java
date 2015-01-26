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
public class Rectangle extends Shape{

    Rectangle(){
        type = "rectangle";
    }
    
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    
}
