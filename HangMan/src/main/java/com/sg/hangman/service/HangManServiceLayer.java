package com.sg.hangman.service;

import com.sg.hangman.dao.HangManDuplicateException;
import com.sg.hangman.dao.HangManPersistenceException;
import com.sg.hangman.dto.Word;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface HangManServiceLayer {

    boolean addGuess(String guess) throws HangManDuplicateException;
    
    ArrayList<String> getAllGuesses();
    
    ArrayList<String> getAllBadGuessses();
    
    void addPunctuation();
    
    Word loadWords() throws HangManPersistenceException, FileNotFoundException;
    
    String getString();
    
    ArrayList<String> getLetters();
    
    boolean compare();
    
    boolean gameEnd(boolean win) throws HangManPersistenceException;
}
