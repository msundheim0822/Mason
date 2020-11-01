/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseD.simpleReverse;
import static com.tsg.unittesting.strings.StringsExerciseE.containsTheOther;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class StringE {
    
    @Test
    public void Test1() {
        String s1 = "one";
        String s2 = "tone";
        boolean result = containsTheOther( s1, s2 );
        assertTrue(result, "true");
    }
    
    @Test
    public void Test2() {
        String s1 = "same";
        String s2 = "same";
        boolean result = containsTheOther( s1, s2 );
        assertTrue(result, "false");
    }
    
    @Test
    public void Test3() {
        String s1 = "fpants";
        String s2 = "pants";
        boolean result = containsTheOther( s1, s2 );
        assertTrue(result, "true");
    }
    
    @Test
    public void Test4() {
        String s1 = "llama";
        String s2 = "duck";
        boolean result = containsTheOther( s1, s2 );
        assertFalse(result, "false");
    }
}
