/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week;

import static com.mycompany.week.DaysOfTheWeek.Days.*;

/**
 *
 * @author Mason
 */
public class DaysOfTheWeek {
    
    public void find(String dayOfTheWeek) {
        
        String checker = dayOfTheWeek.toLowerCase();
        
        switch(checker) {
            case "monday":
                System.out.println(daysOfTheWeek(MONDAY));
                break;
            case "tuesday":
                System.out.println(daysOfTheWeek(TUESDAY));
                break;
            case "wednsday":
                System.out.println(daysOfTheWeek(WEDSNDAY));
                break;
            case "thursday":
                System.out.println(daysOfTheWeek(THURSDAY));
                break;
            case "friday":
                System.out.println(daysOfTheWeek(FRIDAY));
                break;
            case "saturday":
                System.out.println(daysOfTheWeek(SATURDAY));
                break;
            case "sunday":
                System.out.println(daysOfTheWeek(SUNDAY));
                break;
            default:
                System.out.println("Not a valid day of the week");
                break;
        }
    }
    
    public String daysOfTheWeek(Days day) {
        switch(day) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDSNDAY:
                return "Wedsnday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            default:
                throw new UnsupportedOperationException();
        }
    }
    
    public enum Days {
        MONDAY, TUESDAY, WEDSNDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}
