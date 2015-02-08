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
public abstract class Shape {
    protected DrawAPI drawApi;

    protected Shape(DrawAPI drawApi) {
        this.drawApi = drawApi;
    }
    
    public abstract void draw();
}
