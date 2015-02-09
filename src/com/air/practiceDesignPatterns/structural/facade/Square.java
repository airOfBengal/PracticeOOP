/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.facade;

import com.air.practiceDesignPatterns.structural.decorator.Shape;

/**
 *
 * @author AIR
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square::draw().");
    }
    
}
