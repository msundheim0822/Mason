package com.sg.hangman.service;

import com.sg.hangman.dao.HangManAuditDao;
import com.sg.hangman.dao.HangManDao;
import com.sg.hangman.dao.HangManDuplicateException;
import com.sg.hangman.dao.HangManPersistenceException;
import com.sg.hangman.dto.Word;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HangManServiceLayerImpl implements HangManServiceLayer{
    
    HangManDao dao;
    HangManAuditDao auditDao; 
    
    public HangManServiceLayerImpl(HangManDao dao, HangManAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }
    
    @Override
    public boolean addGuess(String guess) throws HangManDuplicateException{
        ArrayList<String> guesses = getAllGuesses();
        
        for(String s: guesses) {
            if(guess.equals(s))
                throw new HangManDuplicateException("Duplicate error");
        }
        return dao.addGuess(guess);
    }

    @Override
    public ArrayList<String> getAllGuesses() {
        return dao.getAllGuesses();
    }

    @Override
    public ArrayList<String> getAllBadGuessses() {
        return dao.getAllBadGuesses();
    }

    @Override
    public void addPunctuation() {
        dao.addPunctuation();
    }
    
    @Override
    public Word loadWords() throws HangManPersistenceException, FileNotFoundException {
        Word correctWord = dao.loadWords();
        auditDao.writeAuditBeginning(correctWord);
        return correctWord;
    }
    
    public String getString() {
        return dao.getString();
    }
    
    public ArrayList<String> getLetters() {
        return dao.getLetters();
    }
    
    public boolean compare(){
        return dao.compare();
    }
    
    @Override
    public boolean gameEnd(boolean win) throws HangManPersistenceException {
        return auditDao.writeAuditEnding(win);
    }
}
