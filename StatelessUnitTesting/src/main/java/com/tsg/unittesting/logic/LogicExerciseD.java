/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

import java.lang.reflect.Array;

/**
 *
 * @author ahill
 */
public class LogicExerciseD {

    /**
     * Given two characters, return true if the first letter parameter comes 
     * earlier in the alphabet than the second letter parameter. 
     * Don't worry about casing, just turn consider everything in lowercase.
     *
     * Ex:
     * isFirstTheFirst( 'a' , 'b'  ) ->  true
     * isFirstTheFirst( 'O' , 'X'  ) ->  true
     * isFirstTheFirst( 'Z' , 'z'   ) -> false
     * 
     * @param letterOne
     * @param letterTwo
     * @return boolean
     */
    public static boolean isFirstTheFirst(char letterOne, char letterTwo) {
        String letters [] = new String[2];
        
        boolean check = true;
        
        String l1 = String.valueOf(letterOne);
        String l2 = String.valueOf(letterTwo);
        
        letters[0] = l1.toLowerCase();
        letters[1] = l2.toLowerCase();
        
        if(letters[0].compareTo(letters[1]) > 0) {
            if(letters[0].equals(letters[1])) {
                check = false;
            } 
        } 
        
        return check;
    }
}
