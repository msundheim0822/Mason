package com.sg.hangman;

import com.sg.hangman.controller.HangManController;
import com.sg.hangman.dao.HangManAuditDao;
import com.sg.hangman.dao.HangManAuditDaoFileImpl;
import com.sg.hangman.dao.HangManDao;
import com.sg.hangman.dao.HangManDaoFileImpl;
import com.sg.hangman.dao.HangManDuplicateException;
import com.sg.hangman.dao.HangManPersistenceException;
import com.sg.hangman.service.HangManServiceLayer;
import com.sg.hangman.service.HangManServiceLayerImpl;
import com.sg.hangman.ui.HangManView;
import com.sg.hangman.ui.UserIO;
import com.sg.hangman.ui.UserIOConsoleImpl;
import java.io.FileNotFoundException;

public class App {
    
    public static void main(String[] args) throws FileNotFoundException, HangManPersistenceException, HangManDuplicateException {
        UserIO myIo = new UserIOConsoleImpl();
        HangManView myView = new HangManView(myIo);
        HangManDao myDao = new HangManDaoFileImpl();
        HangManAuditDao myAuditDao = new HangManAuditDaoFileImpl();
        HangManServiceLayer myService = new HangManServiceLayerImpl(myDao, myAuditDao);
        HangManController controller = new HangManController(myService, myView);
        controller.run();
    }
}
