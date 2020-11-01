/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseC.removeTheVowels;
import static com.tsg.unittesting.strings.StringsExerciseD.simpleReverse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class StringD {
    
    @Test
    public void Test1() {
        String test = "fun times";
        String result = simpleReverse(test);
        assertEquals(result, "semit nuf");
    }
    
    @Test
    public void Test2() {
        String test = "llama llama duck";
        String result = simpleReverse(test);
        assertEquals(result, "kcud amall amall");
    }
    
     @Test
    public void Test3() {
        String test = "hannah";
        String result = simpleReverse(test);
        assertEquals(result, "hannah");
    }
}
