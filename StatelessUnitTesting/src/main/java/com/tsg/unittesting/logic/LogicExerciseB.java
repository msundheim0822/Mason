/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseB {

    /**
     * Given a number, return the 'place rank' word associated with it.
     * I.e. pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! 
     * Also, start by going up to 100, but stretch to more if you can!
     *
     * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
     *
     * @param place
     * @return String
     */
    public static String placeOf(int place) {
      
        int position = place % 10;
        String rank = "";
        
        if (position == 11)
            rank = Integer.toString(place) + "th";
        else if ((position == 12) || (position == 13)){
            rank = Integer.toString(place) + "th";
        } else {
            if (position == 1)
                rank = Integer.toString(place) + "st";
            else if (position == 2)
                rank = Integer.toString(place) + "nd";
            else if (position == 3)
                rank = Integer.toString(place) + "rd";
            else
                rank = Integer.toString(place) + "th";
        }
        return rank;
    }
}
