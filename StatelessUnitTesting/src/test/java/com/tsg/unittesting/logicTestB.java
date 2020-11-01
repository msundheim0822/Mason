/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.logic.LogicExerciseB.placeOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mason
 */
public class logicTestB {
    
    @Test
    public void Test1() {
      
       int rank = 1;
  
        String position = placeOf(rank);
        
        assertEquals( position , "1st" );
    }
    
    @Test
    public void Test2() {
      
       int rank = 3;
  
        String position = placeOf(rank);
        
        assertEquals( position , "3rd" );
    }
    
    @Test
    public void Test3() {
      
       int rank = 22;
  
        String position = placeOf(rank);
        
        assertEquals( position , "22nd" );
    }
}
