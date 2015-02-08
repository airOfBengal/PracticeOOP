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
public class Circle extends Shape{
    private int x,y,radius;

    public Circle(int x, int y, int radius,DrawAPI drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(x, y, radius);
    }
    
}
