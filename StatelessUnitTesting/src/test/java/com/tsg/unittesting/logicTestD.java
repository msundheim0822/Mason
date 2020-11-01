/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.logic.LogicExerciseD.isFirstTheFirst;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class logicTestD {
    
    @Test
    public void Test1() {
        char one = 'a';
        char two = 'b';
        
        boolean alph = isFirstTheFirst(one, two);
        
        assertTrue(alph, "true");
    }
    
    @Test
    public void Test2() {
        char one = 'O';
        char two = 'X';
        
        boolean alph = isFirstTheFirst(one, two);
        
        assertTrue(alph, "true");
    }
    
    @Test
    public void Test3() {
        char one = 'Z';
        char two = 'z';
        
        boolean alph = isFirstTheFirst(one, two);
        
        assertTrue(alph, "false");
    }
}
