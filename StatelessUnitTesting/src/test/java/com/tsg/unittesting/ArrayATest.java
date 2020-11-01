/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Mason
 */
public class ArrayATest {
    
    /**Test Plan
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     */
    
    @Test
    public void maxOfArray1() {  
        int[] array = {1};
        
        int max = maxOfArray(array);
        int expected = 1;
        assertEquals(expected, max, "Expected " + 1);
    }
    
    @Test
    public void maxOfArray5 () {
        int[] array = {3, 4, 5};
        int max = maxOfArray(array);
        int expected = 5;
        assertEquals(expected, max, "Expected " + 5);
    }
    
    @Test
    public void maxOfArrayNeg3 () {
        int[] array = {-9000, -700, -50, -3};
        int max = maxOfArray(array);
        int expected = -3;
        assertEquals(expected, max, "Expected " + -3);
    }
}
