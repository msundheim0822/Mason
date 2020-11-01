package com.sg.hangman.ui;

import java.util.Scanner;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO {

    final private Scanner console = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
    
    @Override
    public void printer(String msg) {
        System.out.print(msg);
    }

    @Override
    public String readString(String msg) {
        System.out.println(msg);
        return console.nextLine();
    }
}
