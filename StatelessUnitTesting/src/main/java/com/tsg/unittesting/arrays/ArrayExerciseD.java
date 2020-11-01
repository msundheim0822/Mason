/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseD {
    
    /**
     * Given an array of doubles, return the biggest number of the lot, as if the decimal had gone missing!
     *
     * 
     * pointFree( [1.1, .22]  ) ->  22
     * pointFree( [ .039 , 20 , .005005 ]  ) ->  5005
     * pointFree( [ -9.9 , -700 , -.5  ]  ) ->  -5
     * 
     * @param numbers
     * @return
     */
    public static int pointFree(double[] numbers){
        
        String[] temp = new String[numbers.length];
        String[] largest = new String[numbers.length];
        int[] actual = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            temp[i] = String.valueOf(numbers[i]);
            largest[i] = temp[i].replace(".", "");
            actual[i] = Integer.parseInt(largest[i]);
        }
        
        int large = actual[0];
        
        for(int i = 0; i < numbers.length; i++) {
            if (actual[i] > large) {
                large = actual[i];
            }
        }
        
        return large;
    }
    
}
