package com.sg.itemmanager.ui;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO{

    final private Scanner console = new Scanner(System.in);
    
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public BigDecimal readBigDecimal(String msgPrompt) {
        BigDecimal bigDecimal;
        while (true) {
            try {
                bigDecimal = new BigDecimal(this.readString(msgPrompt));
                return bigDecimal.setScale(2, RoundingMode.HALF_UP);
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public int readInt(String msgPrompt) {
        boolean invalidInput = true;
        int num = 0;
        while (invalidInput) {
            try {
                String stringValue = this.readString(msgPrompt);
                num = Integer.parseInt(stringValue); // if it's 'bob' it'll break
                invalidInput = false; // or you can use 'break;'
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
        return num;
    }
    
    @Override
    public int readInt(String msgPrompt, int min, int max) {
        int result;
        do {
            result = readInt(msgPrompt);
        } while (result < min || result > max);
        return result;
    }

    @Override
    public String readString(String msgPrompt) {
        System.out.println(msgPrompt);
        return console.nextLine();
    } 

    @Override
    public LocalDate readLocalDate(String prompt) {
        LocalDate date ;
        while(true) {
            try {
                String stringValue = this.readString(prompt);
                date = LocalDate.parse(stringValue);
                return date;
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }
}