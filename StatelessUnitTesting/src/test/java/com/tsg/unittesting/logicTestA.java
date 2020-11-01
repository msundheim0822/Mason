/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test
 * friendlyGreeting( "Goofus" , false ) ->   "hi"
 * friendlyGreeting( "Gallant" , true ) ->   "Hello, Gallant!"
 * friendlyGreeting( null , false ) ->   "..."
 */
public class logicTestA {
    
    
    @Test
    public void Test1() {
      
        boolean isFriend = false;
        String name = "Goofus";
  
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals( result , "hi" );
    }
    
    @Test
    public void Test2() {
      
        boolean isFriend = true;
        String name = "Gallant";
  
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals( result , "Hello, Gallant!" );
    }
    
    @Test
    public void Test3() {
      
        boolean isFriend = true;
        String name = null;
  
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals( result , "..." );
    }
}
