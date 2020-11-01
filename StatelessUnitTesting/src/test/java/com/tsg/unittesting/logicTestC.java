/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;
import static com.tsg.unittesting.logic.LogicExerciseC.goWalky;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Mason
 */

public class logicTestC {
    
    @Test
    public void Test1() {
        boolean light = true;
        boolean flashLight = false;
        boolean raining = true;
        boolean umbrella = true;
        int degrees = 75;
        
        boolean walk = goWalky(light, flashLight, raining, umbrella, degrees);
        assertTrue(walk, "true"); 
    }
    
    @Test
    public void Test2() {
        boolean light = false;
        boolean flashLight = true;
        boolean raining = false;
        boolean umbrella = false;
        int degrees = 50;
        
        boolean walk = goWalky(light, flashLight, raining, umbrella, degrees);
        assertTrue(walk, "true");  
    }
    
    @Test
    public void Test3() {
        boolean light = false;
        boolean flashLight = false;
        boolean raining = false;
        boolean umbrella = false;
        int degrees = 30;
        
        boolean walk = goWalky(light, flashLight, raining, umbrella, degrees);
        assertFalse(walk, "false");  
    }
}
