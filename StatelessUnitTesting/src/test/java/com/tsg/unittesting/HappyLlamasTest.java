/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting;

import static com.tsg.unittesting.HappyLlamas.areTheLlamasHappy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author ahill
 */
public class HappyLlamasTest {
    
    /*  Test Plan:
    **  Normal trampoline tests!
    **  areTheLlamasHappy(false, 10) → false
    **  areTheLlamasHappy(false, 24) → true
    **  areTheLlamasHappy(false, 30) → true
    **  areTheLlamasHappy(false, 42) → true
    **  areTheLlamasHappy(false, 50) → false
    **
    **  Ultra-bouncy tests!
    **  areTheLlamasHappy(true, 10) → false
    **  areTheLlamasHappy(true, 24) → true
    **  areTheLlamasHappy(true, 30) → true
    **  areTheLlamasHappy(true, 42) → true
    **  areTheLlamasHappy(true, 50) → true
    */
    
    public HappyLlamasTest() {
    }
    
    @Test
    public void testNormalTrampoline10() {
      
        boolean isNasaFabric = false;
        int numTrampolines = 10;
  
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);
        
        assertFalse( result , "10 Llamas w/ Normal Trampolines should be Unhappy!" );
    }
    
    @Test
    public void testNormalTrampoline24() {
        // For simple methods, you can also get away w/ arranging, acting & asserting
    	// all on a single line. But make sure you add in a failure message.
    	// It'll make test failures MUCH easier to understand.
    	
    	// ARRANGE ACT & ASSERT - w/ Msg
        assertTrue( areTheLlamasHappy(false, 24) , "24 Llamas w/ Normal Trampolines should be Happy!" );
    }
    
    @Test
    public void testNormalTrampoline30() {
    	// ARRANGE
        boolean isNasaFabric = false;
        int numTrampolines = 30;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        
        assertTrue(result, "30 Llamas w/ Normal Trampolines should be Happy!");
    }

    @Test
    public void testNormalTrampoline42() {
        // ARRANGE
        boolean isNasaFabric = false;
        int numTrampolines = 42;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertTrue(result, "42 Llamas w/ Normal Trampolines should be Happy!" );
    }
    
    @Test
    public void testNormalTrampoline50() {
        // ARRANGE
        boolean isNasaFabric = false;
        int numTrampolines = 50;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertFalse(result, "50 Llamas w/ Normal Trampolines should be Unhappy!");
    }
    
    @Test
    public void testUltraBouncyTrampoline10() {
        // ARRANGE
        boolean isNasaFabric = true;
        int numTrampolines = 10;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertFalse(result, "10 Llamas w/ UltraBouncy Trampolines should be Unhappy!");
    }
    
    @Test
    public void testUltraBouncyTrampoline24() {
        // ARRANGE
        boolean isNasaFabric = true;
        int numTrampolines = 24;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertTrue(result, "24 Llamas w/ UltraBouncy Trampolines should be Happy!");
    }
    
    @Test
    public void testUltraBouncyTrampoline30() {
        // ARRANGE
        boolean isNasaFabric = true;
        int numTrampolines = 30;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertTrue(result, "30 Llamas w/ UltraBouncy Trampolines should be Happy!");
    }

    @Test
    public void testUltraBouncyTrampoline42() {
        // ARRANGE
        boolean isNasaFabric = true;
        int numTrampolines = 42;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertTrue(result, "42 Llamas w/ UltraBouncy Trampolines should be Happy!");
    }

    @Test
    public void testUltraBouncyTrampoline50() {
        // ARRANGE
        boolean isNasaFabric = true;
        int numTrampolines = 50;
        
        // ACT 
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);        
        
        // ASSERT
        assertTrue(result, "60 Llamas w/ UltraBouncy Trampolines should be Happy!");
    }
    
    
}
