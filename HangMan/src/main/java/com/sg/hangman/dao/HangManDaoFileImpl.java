package com.sg.hangman.dao;

import java.util.ArrayList;
import java.util.HashMap;
import com.sg.hangman.dto.Word;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class HangManDaoFileImpl implements HangManDao {
    
    ArrayList<String> badGuesses = new ArrayList<>();
    ArrayList<String> guesses = new ArrayList<>();
    Word correctWord;
    Word guessWord;
    
    private final String WORD_FILE;
    
    public HangManDaoFileImpl() {
         WORD_FILE = "wordlist.txt";
    }
    
    public HangManDaoFileImpl(String wordList) {
        WORD_FILE = wordList;
    }
    
    public void addPunctuation(){
        for(int i = 0; i < correctWord.getSize(); i++) {
            if(correctWord.getLetters().get(i).equals("'")) {
                guessWord.addWord(i, "'");
            }
            if(correctWord.getLetters().get(i).equals("-")) {
                guessWord.addWord(i, "-");
            }
        }
    }
    
    @Override
    public boolean addGuess(String guess) {
        boolean isCorrect = false;
        guesses.add(guess);
        for(int i = 0; i < correctWord.getSize(); i++) {
            if(correctWord.getLetters().get(i).equals(guess)) {
                guessWord.addWord(i, guess);
                isCorrect = true;
            }
        }
        if(!isCorrect) {
           badGuesses.add(guess);
        }        
        return isCorrect;
    }

    @Override
    public ArrayList<String> getAllGuesses() {
        return guesses;
    } 
    
    public ArrayList<String> getAllBadGuesses() {
        return badGuesses;
    }
    
    public Word loadWords() throws FileNotFoundException {
        
        ArrayList<String> fileWords = new ArrayList<>();
        Scanner scanner; 
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(WORD_FILE)));
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }  
        String currentLine;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            if(!currentLine.endsWith(")"))
                fileWords.add(currentLine);
        }

        Random random = new Random();
        
        String temp = fileWords.get(random.nextInt(fileWords.size()));
        
        correctWord = new Word(temp);
        
        guessWord = new Word(correctWord.getSize());
        addPunctuation();
        return correctWord;
    }
    
    public String getString() {
        return correctWord.getString();
    }
    
    public ArrayList<String> getLetters() {
        return guessWord.getLetters();
    }
    
    public boolean compare() {
        boolean equals = true;
        for (String s: guessWord.getLetters()) {
            if (s.equals("_")) {
                equals = false;
            }
        }
        return equals;
    }
}
