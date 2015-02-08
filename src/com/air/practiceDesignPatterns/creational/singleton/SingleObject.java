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
public class SingleObject {

    private int x;
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
