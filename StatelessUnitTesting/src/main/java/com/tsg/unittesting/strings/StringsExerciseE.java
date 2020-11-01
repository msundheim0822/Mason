/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

/**
 *
 * @author ahill
 */
public class StringsExerciseE {

    /**
     * Take in two Strings - return true if either String 'contains' the other... 
     * but false if they are exactly equal, or completely different.
     *
     * Ex:
     * containsTheOther( "one", "tone" ) ->  true
     * containsTheOther( "same", "same" ) ->  false
     * containsTheOther( "fancypants", "pants" ) ->  true
     * containsTheOther( "llama", "duck" ) ->  false
     * 
     * @param one
     * @param two
     * @return boolean
     */
    public static boolean containsTheOther(String one, String two){
        
        String s1 = "";
        String s2 = "";
        
        if(one.length() > two.length()) {
            s1 = one;
            s2 = two;
        }
        
        int res =isSubstring(s1, s2);

        if (res == -1)
            return false;
        else
            return true;
    }
    
    static int isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length(); 
  
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            int j; 
  
            /* For current index i, check for 
            pattern match */
            for (j = 0; j < M; j++) 
                if (s2.charAt(i + j) 
                    != s1.charAt(j)) 
                    break; 
  
            if (j == M) 
                return i; 
        } 
  
        return -1; 
    } 
}
