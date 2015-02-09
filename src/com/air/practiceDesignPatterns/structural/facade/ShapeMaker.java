/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.facade;

import com.air.practiceDesignPatterns.structural.decorator.Circle;
import com.air.practiceDesignPatterns.structural.decorator.Rectangle;
import com.air.practiceDesignPatterns.structural.decorator.Shape;

/**
 *
 * @author AIR
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();                
    }
    
    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
