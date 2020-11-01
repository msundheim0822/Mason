package com.sg.hangman.dao;

import com.sg.hangman.dto.Word;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface HangManDao {
    
    boolean addGuess(String guess);
    
    ArrayList<String> getAllGuesses();
    
    ArrayList<String> getAllBadGuesses();
    
    void addPunctuation();
    
    Word loadWords() throws FileNotFoundException;
    
    String getString();
    
    ArrayList<String> getLetters();
    
    boolean compare();
}
