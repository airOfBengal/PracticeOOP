/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.decorator;

/**
 *
 * @author AIR
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRect = new RedShapeDecorator(new Rectangle());
        
        System.out.println("Circle with normal boarder: ");
        circle.draw();
        
        System.out.println("Circle with red boarder: ");
        redCircle.draw();
        
        System.out.println("Rectangle with red boarder: ");
        redRect.draw();
    }
}
