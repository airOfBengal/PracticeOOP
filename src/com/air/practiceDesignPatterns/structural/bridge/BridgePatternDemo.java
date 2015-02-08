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
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 10, 100, new RedCirlce());
        Shape greenCircle = new Circle(10, 10, 100, new GreenCircle());
        
        redCircle.draw();
        greenCircle.draw();
    }
}
