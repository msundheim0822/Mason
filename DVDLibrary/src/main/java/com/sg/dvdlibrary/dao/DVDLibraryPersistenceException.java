package com.sg.dvdlibrary.dao;

public class DVDLibraryPersistenceException extends Exception{
    
    //Sets up Exceptions
    
    public DVDLibraryPersistenceException(String message) {
        super(message);
    }
    
    public DVDLibraryPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}