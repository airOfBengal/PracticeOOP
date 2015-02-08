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
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBoarder(decoratedShape);
    }

    private void setRedBoarder(Shape decoratedShape) {
        System.out.println("Boarder Color: Red");
    }
    
    
}
