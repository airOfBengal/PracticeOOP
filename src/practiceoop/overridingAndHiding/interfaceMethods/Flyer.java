/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceoop.overridingAndHiding.interfaceMethods;

/**
 *
 * @author AIR
 */
public interface Flyer extends Animal{

    /**
     *
     * @return
     */
 
    default String identifyMyself() {
        return "I'm able to fly";
    }
}
