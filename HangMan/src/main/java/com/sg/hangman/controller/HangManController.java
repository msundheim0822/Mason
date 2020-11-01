package com.sg.hangman.controller;

import com.sg.hangman.dao.HangManDuplicateException;
import com.sg.hangman.dao.HangManPersistenceException;
import com.sg.hangman.service.HangManServiceLayer;
import com.sg.hangman.service.HangManServiceLayerImpl;
import com.sg.hangman.ui.HangManView;
import java.io.FileNotFoundException;

public class HangManController {
    
   HangManView view;
   HangManServiceLayer service;
   
   public HangManController(HangManServiceLayer service, HangManView view) {
       this.service = service;
       this.view = view;
   }
    
    public void run() throws FileNotFoundException, HangManPersistenceException, HangManDuplicateException {
 
        int i = 0;
        
        view.displayHangman0();
        service.loadWords();
        
        while(i < 7) {
            view.printLetters(service.getLetters());
            
            if(i == 1)
                view.displayHangman1();
            else if (i == 2)
                view.displayHangman2();
            else if (i == 3)
                view.displayHangman3();
            else if (i == 4)
                view.displayHangman4();
            else if (i == 5)
                view.displayHangman5();
            else if (i == 6) {
                view.displayHangman6();
                //System.out.println("You lose the word was " + service.getString());
                view.displayLose(service.getString());
                service.gameEnd(service.compare());
                break;
            }
            String letter = view.checker();
            
            try{
                if(service.addGuess(letter)) {
                    view.displayCorrect();
                } else {
                    view.displayIncorrect();
                    i++;
                }
            } catch (HangManDuplicateException e) {
                view.duplicate();
            }
            
            view.displayGuesses(service.getAllBadGuessses());
            
            if(service.compare() == true) {
                
                view.printLetters(service.getLetters());
                view.displayWin();

                service.gameEnd(service.compare());
                break;
            }
        }
    }
}
