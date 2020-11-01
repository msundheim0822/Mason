/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseB.tripleIt;
import static com.tsg.unittesting.strings.StringsExerciseC.removeTheVowels;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class StringC {
    
    @Test
    public void Test1() {
        String test = "truncate";
        String result = removeTheVowels(test);
        assertEquals(result, "trnct");
    }
    
    @Test
    public void Test2() {
        String test = "squashed";
        String result = removeTheVowels(test);
        assertEquals(result, "sqshd");
    }
    
     @Test
    public void Test3() {
        String test = "compressed";
        String result = removeTheVowels(test);
        assertEquals(result, "cmprssd");
    }
}
