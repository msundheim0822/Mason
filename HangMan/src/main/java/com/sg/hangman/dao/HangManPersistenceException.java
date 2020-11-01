package com.sg.hangman.dao;

public class HangManPersistenceException extends Exception{
    
    public HangManPersistenceException(String message) {
        super(message);
    }
    
    public HangManPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
