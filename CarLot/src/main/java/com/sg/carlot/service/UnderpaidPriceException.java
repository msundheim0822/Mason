/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.carlot.service;

/**
 *
 * @author Mason
 */
public class UnderpaidPriceException extends Exception {
    
    public UnderpaidPriceException(String message) {
        super(message);
    }
    
    public UnderpaidPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}