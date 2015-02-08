/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.air.practiceDesignPatterns.creational.prototype;

import java.util.Hashtable;

/**
 *
 * @author AIR
 */
public class ShapeCache {
    
    private static final Hashtable<String, Shape> shapes = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapes.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapes.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapes.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapes.put(rectangle.getId(), rectangle);
    }

}
