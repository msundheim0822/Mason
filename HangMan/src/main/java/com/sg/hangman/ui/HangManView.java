package com.sg.hangman.ui;

import com.sg.hangman.ui.UserIO;
import com.sg.hangman.ui.UserIOConsoleImpl;
import java.util.ArrayList;


public class HangManView {
    
    private UserIO io;
    
    public HangManView(UserIO io) {
        this.io = io;
    }
    
    public void displayHangman0(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print("      | ");
	io.print("      | ");
	io.print("      | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    public void displayHangman1(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print("      | ");
	io.print("      | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }	
    public void displayHangman2(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print(" |    | ");
	io.print("      | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    public void displayHangman3(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print(" |\\   | ");
	io.print("      | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    public void displayHangman4(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print("/|\\   | ");
	io.print("      | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    public void displayHangman5(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print("/|\\   | ");
	io.print("/     | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    public void displayHangman6(){
	io.print("");
	io.print(" ______ ");
	io.print(" |    | ");
	io.print(" O    | ");
	io.print("/|\\   | ");
	io.print("/ \\   | ");
	io.print("      | ");
	io.print(" -----/ ");
	io.print("");
    }
    
    public String checker() {
        String character = "";
        boolean valid = false;
        
        while(!valid) {
            String input= io.readString("Please enter a letter");
            if(input.length() >= 2) {
                io.print("This is too long");
            } else if (Character.isDigit(input.charAt(0))) {
                io.print("This is a number, not a letter");
            } else {
                character = input;
                valid = true;
            }
        }
        return character;
    }
    
    public void displayWord(String word) {
        io.print(word);
    }
    
    public void displayGuesses (ArrayList<String> guesses) {
        for(String letters: guesses) {
            io.printer(letters + ", ");
        }  
        io.print("");
    }
    
    public void displayIncorrect() {
        io.print("Incorrect");
    }
    
    public void displayCorrect() {
        io.print("Correct");
    }
    
    public void displayWin() {
        io.print("You Win!");
    }
    
    public void displayLose(String word) {
        io.print("You lose! The word was " + word);
    }
    
    public void printLetters(ArrayList<String> letters) {
        io.print(letters.toString());
    }
    
    public void duplicate() {
        io.print("Duplicate input, please input a different character");
    }
}
