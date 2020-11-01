/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import java.util.Arrays;
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Mason
 */
public class ArrayBTest {
    
    /**Test Plan
     * multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) ->  [ 5 , 10 , 15 , 20 , 25 ]
     * multiplyAll( 0 , [ 1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1 ] ) ->  [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ]
     * multiplyAll( -1 , [ -2 , 0 , 0 , 1 ] ) ->  [ 2 , 0 , 0 , -1 ]
     */
    
    @Test
    public void multiply5() {
        int[] array = {1, 2, 3, 4, 5};
        int multiplier = 5;
        int[] expected = {array[0] * 5, array[1] * 5, array[2] * 5,
            array[3] * 5, array[4] * 5};
        int[] multiply = multiplyAll(multiplier, array);
        //assertEquals(expected, multiply, "Expected " + expected);
        assertTrue(Arrays.equals(expected, multiply));
    }
    
    @Test
    public void multiply0() {
        int[] array = {1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1};
        int multiplier = 0;
        int[] expected = {array[0] * 0, array[1] * 0, array[2] * 0,
                          array[3] * 0, array[4] * 0, array[5] * 0,
                          array[6] * 0, array[7] * 0, array[8] * 0};
        int[] multiply = multiplyAll(multiplier, array);
        //assertEquals(expected, multiply, "Expected " + expected);
        assertTrue(Arrays.equals(expected, multiply));
    }
    
    @Test
    public void multiplyneg1() {
        int[] array = {-2 , 0 , 0 , 1};
        int multiplier = -1;
        int[] expected = {array[0] * -1, array[1] * -1, array[2] * -1, array[3] * -1};
        int[] multiply = multiplyAll(multiplier, array);
        //assertEquals(expected, multiply, "Expected " + expected);
        assertTrue(Arrays.equals(expected, multiply));
    }
}
