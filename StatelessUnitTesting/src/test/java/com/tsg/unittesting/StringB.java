/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import static com.tsg.unittesting.strings.StringsExerciseB.tripleIt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class StringB {
    
    @Test
    public void Test1() {
        String test = "Llama";
        String result = tripleIt(test);
        assertEquals(result, "llamaLLAMAllama");
    }
    
    @Test
    public void Test2() {
        String test = "ha";
        String result = tripleIt(test);
        assertEquals(result, "haHAha");
    }
    
     @Test
    public void Test3() {
        String test = "Beetlejuice";
        String result = tripleIt(test);
        assertEquals(result, "beetlejuiceBEETLEJUICEbeetlejuice");
    }
}
