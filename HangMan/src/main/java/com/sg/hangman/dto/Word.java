package com.sg.hangman.dto;

import java.util.ArrayList;

public class Word {
    
    ArrayList<String> letters = new ArrayList<>();
    String letter;
    
    public Word(String letter) {
        for(int i = 0; i <letter.length(); i++) {
            letters.add(String.valueOf(letter.charAt(i)));
        }
        this.letter = letter;
    }
    
    public Word(int length) {
        for(int i =0; i < length; i++) {
            letters.add("_");
        }
    }
    
    public ArrayList<String> getLetters() {
        return letters;
    }
    
    public void addWord(int position, String letter) {
        letters.remove(position);
        letters.add(position, letter);
    }
    
    public int getSize() {
        return letters.size();
    }
    
    public String getString() {
        return letter;
    }
}
