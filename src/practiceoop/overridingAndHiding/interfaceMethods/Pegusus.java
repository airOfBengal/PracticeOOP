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
public class Pegusus implements Mythical,Flyer {  

    @Override
    public String identifyMyself() {
        String s = Flyer.super.identifyMyself() + Mythical.super.identifyMyself();
        return s;
    }  

}