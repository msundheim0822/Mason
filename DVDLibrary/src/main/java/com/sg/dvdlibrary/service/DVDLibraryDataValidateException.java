/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

/**
 *
 * @author Mason
 */
public class DVDLibraryDataValidateException extends Exception {
    
    public DVDLibraryDataValidateException(String message) {
        super(message);
    }
    
    public DVDLibraryDataValidateException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
