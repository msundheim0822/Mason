/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class StringA {
    
    @Test
    public void Test1() {
        String test = "Hello there.";
        String result = yell(test);
        assertEquals(result, "HELLO THERE.");
    }
    
    @Test
    public void Test2() {
        String test = "shhhhhhhhhhhh";
        String result = yell(test);
        assertEquals(result, "SHHHHHHHHHHHH");
    }
    
    @Test
    public void Test3() {
        String test = "AAaAAAaAAAaaAAHHHH";
        String result = yell(test);
        assertEquals(result, "AAAAAAAAAAAAAAHHHH");
    }
}
