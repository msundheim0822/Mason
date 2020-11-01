/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseC {

    /**
     * Figure out if you're taking your dog for a walk.
     * Your dog wants to go for a walk - however, there are multiple factors 
     * that you must consider before going. 
     * 
     * You only go walking if it's light outside, or if you have a flashlight. 
     * Also only if it's not raining, or if you have an umbrella. 
     * And if it's not too hot (more than 95 degrees) and not too cold (less than 50 degrees).
     *
     * Ex:
     * goWalky( true, false, true, true, 75  ) ->  true
     * goWalky( false, true, false, false, 50  ) ->  true
     * goWalky( false, false, false, false, 30  ) ->  false
     * 
     * @param isLight
     * @param haveFlashlight
     * @param isRaining
     * @param haveUmbrella
     * @param degreesFarenheit
     * @return boolean
     */
    public static boolean goWalky(boolean isLight, boolean haveFlashlight, boolean isRaining, boolean haveUmbrella, int degreesFarenheit) {
        
        boolean walk = true;
        
        boolean dark = false;
        boolean rain = false;
        boolean temp = true;
         
            
        if (isLight == false) {
            if (haveFlashlight == false)  {
                dark = true;
            }
        }
             
        if (isRaining == true) {
            if (haveUmbrella == false) {
                rain = true;
            }
        }
           
        if ((degreesFarenheit > 49) && (degreesFarenheit < 96)) {
            temp = true;
        }
            
        if ((temp == false) || (dark == true) || (rain == true)) {
            walk = false;
        }
        
        return walk;
    }
}
