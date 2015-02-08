/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.bridge;

/**
 *
 * @author AIR
 */
public class RedCirlce implements DrawAPI{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle: [ color: red, radius: "+
                radius+", x: "+x+", y: "+y+" ]");
    }
    
}
