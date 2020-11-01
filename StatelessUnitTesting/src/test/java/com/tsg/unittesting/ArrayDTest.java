/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.arrays.ArrayExerciseD.pointFree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test
 * 
 * 
 * pointFree( [1.1, .22]  ) ->  22
 * pointFree( [ .039 , 20 , .005005 ]  ) ->  5005
 * pointFree( [ -9.9 , -700 , -.5  ]  ) ->  -5
 */
public class ArrayDTest {
    
    @Test
    public void Test1() {
        double[] array = {1.1, .22};
        int result = pointFree(array);
        int expected = 22;
        assertEquals(expected, result, "Expected " + expected);
    }
    
    @Test
    public void Test2() {
        double[] array = {.039 , 20 , .005005};
        int result = pointFree(array);
        int expected = 5005;
        assertEquals(expected, result, "Expected " + expected);
    }
    
    @Test
    public void Test3() {
        double[] array = {-9.9 , -700 , -.5};
        int result = pointFree(array);
        int expected = -5;
        assertEquals(expected, result, "Expected " + expected);
    }
}
