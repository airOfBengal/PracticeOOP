/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceoop.overridingAndHiding;

/**
 *
 * @author AIR
 */
public class Cat extends Animal{
    static public void testClassMethod(){
        System.out.println("testClassMethod in Cat");
    }
    
    @Override
    public void testInstanceMethod(){
        System.out.println("testInstanceMethod in Cat");
    }
    
}
