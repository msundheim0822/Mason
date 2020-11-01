/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.tsg.unittesting.arrays.ArrayExerciseC.stringThemTogether;

/**
 * Test
 * 
 * stringThemTogether( { 1, 3, 3, 7 }  ) ->  "1337"
 * stringThemTogether( { 1, 33, 555, 7777, 99999 } ) ->  "133555777799999"
 * stringThemTogether( { }  ) ->  ""
 */
public class ArrayCTest {
    
    @Test
    public void Test1() {
        int[] array = {1, 3, 3, 7};
        String result = stringThemTogether(array);
        String expected = "1337";
        assertEquals(expected, result, "Expected " + expected);
    }
    
    @Test
    public void Test2() {
        int[] array = {1, 33, 555, 7777, 99999};
        String result = stringThemTogether(array);
        String expected = "133555777799999";
        assertEquals(expected, result, "Expected " + expected);
    }
    
    @Test
    public void Test3() {
        int[] array = { };
        String result = stringThemTogether(array);
        String expected = "";
        assertEquals(expected, result, "Expected " + expected);
    }
}
