
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mason
 */
public class localDates {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String date = "02/31/1998";
        
        LocalDate birthday = LocalDate.parse(date , DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        
        DayOfWeek week = DayOfWeek.from(birthday);
        
                
        
        int day = birthday.getDayOfMonth();
        int month = birthday.getMonthValue();
        
        LocalDate today = LocalDate.now();
        
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();
        
        if(month <= currentMonth) {
            if (day < currentDay) {
                currentYear+= 1;
            } else if (day == currentDay) {
                System.out.println("HAPPY BIRTHDAY!");
            } else
                currentYear += 1;
        }
        
        String newBirthday, newMonth, newDay, newYear;
        
        if(month < 10) {
            newMonth = "0" + Integer.toString(month);
        } else
            newMonth = Integer.toString(month);
        
        if (day < 10) {
            newDay = "0" + Integer.toString(day);
        } else
            newDay = Integer.toString(day);
        
        newYear = Integer.toString(currentYear);
        
        newBirthday = newMonth + "/" + newDay + "/" + newYear;
        
        LocalDate nextBirthday = LocalDate.parse(newBirthday , DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        
        Period yearOlder = birthday.until(nextBirthday);
        Period wait = today.until(nextBirthday);
        
        System.out.println("That means you were born on a " + week);
        System.out.println("This year it falls on a " + DayOfWeek.from(nextBirthday));
        System.out.println("And since today is " + today + ", there's only "); 
        
        if(wait.getMonths() > 0)
            System.out.print(wait.getMonths() + " months and ");
        
        System.out.println(wait.getDays() + " days until the next one!");
        System.out.println("Bet yer excited to be turning " + yearOlder.getYears() +"!");
        
        
        /*
        LocalDate Id = LocalDate.now();
        //Id = LocalDate.parse("2015-01-01");
        //Id = LocalDate.parse("02/01/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        LocalDate past = Id.minusDays(8);
        String formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        
        Date legacyDate = new Date();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        
        Id = zdt.toLocalDate();
        
        System.out.println(Id);
        */
    }
}
