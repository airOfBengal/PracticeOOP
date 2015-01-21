/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceoop;

import practiceoop.overridingAndHiding.Animal;
import practiceoop.overridingAndHiding.Cat;

/**
 *
 * @author AIR
 */
public class PracticeOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal cat = new Cat();
       
       Animal.testClassMethod();
       cat.testInstanceMethod();
    }
    
}




