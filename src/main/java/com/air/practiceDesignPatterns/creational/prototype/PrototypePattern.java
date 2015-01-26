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
public class PrototypePattern {
    public static void main(String[] args){
        ShapeCache.loadCache();
        Shape cachedShape = ShapeCache.getShape("2");
        cachedShape.draw();
        
        
    }
}
