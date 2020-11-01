package com.sg.hangman.dao;

public class HangManDuplicateException extends Exception{
    
    public HangManDuplicateException(String message) {
        super(message);
    }
    
    public HangManDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }
}
