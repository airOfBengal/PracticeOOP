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
public class Square extends Shape{

    Square(){
        type = "square";
    }
    
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    
}
