/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.creational.singleton;

/**
 *
 * @author AIR
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.setX(5);
        SingleObject object2 = SingleObject.getInstance();
        object2.setX(10);
        System.out.println(object.getX());
        System.out.println(object2.getX());       
    }
}
