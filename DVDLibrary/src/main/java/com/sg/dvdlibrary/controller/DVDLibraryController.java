package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.service.DVDLibraryDataValidateException;
import com.sg.dvdlibrary.service.DVDLibraryDuplicateTitleException;
import com.sg.dvdlibrary.service.DVDLibraryServiceLayer;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import java.util.List;

public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryServiceLayer service;
    
    
    public DVDLibraryController(DVDLibraryServiceLayer service, DVDLibraryView view) {
        this.service = service;
        this.view = view;
    }
    
    public void run() throws DVDLibraryDuplicateTitleException, DVDLibraryDataValidateException { //starts the program
        boolean keepGoing = true; //boolean to keep the menu selection going 
        try {
        while(keepGoing) { //while loop for menu selection
            
            int menuSelection = getMenuSelection();
            
            switch(menuSelection) {
                case 1: //Add DVD
                    createDVD();
                    break;
                case 2: //Remove DVD
                    removeDVD();
                    break;
                case 3: //Edit DVD Info
                    editDVD();
                    break;
                case 4: // List DVD's
                    listDVDs();
                    break;
                case 5: // Search DVD and display Info
                    viewDVD();
                    break;
                case 6: //Ending the progrram
                    keepGoing = false;
                    break;
                default: //When someone enters something other than 1-6
                    unknownCommand();
            }
        }
        exitMessage(); //Exit message
        } catch (DVDLibraryPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private int getMenuSelection() { //Print out the menu selection
        return view.printMenuAndGetSelection();
    }
    
    private void createDVD() throws DVDLibraryPersistenceException, DVDLibraryDuplicateTitleException, DVDLibraryDataValidateException{ //Creates a DVD
        view.displayCreateDVDBanner();
        boolean hasErrors = false;
        do {
            DVD currentDVD = view.getNewDVDInfo();
            try {
                service.addDVD(currentDVD);
                view.displayCreateSuccessBanner();
                hasErrors = false;
            } catch (DVDLibraryDuplicateTitleException | DVDLibraryDataValidateException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }
    
    private void listDVDs() throws DVDLibraryPersistenceException{ //Lists all the DVD
        view.displayALLDVDBanner();
        List<DVD> dvdList = service.getALLDVDs();
        view.displayDVDList(dvdList);
    }
    
    private void viewDVD() throws DVDLibraryPersistenceException{ //View a specific DVD
        view.displayDVDBanner();
        String title = view.getTitle();
        DVD dvd = service.getDVD(title);
        view.displayDVD(dvd);
    }
    
    private void editDVD() throws DVDLibraryPersistenceException, DVDLibraryDuplicateTitleException, DVDLibraryDataValidateException{ //Used to edit DVD
        view.editDVDBanner();  
        String title = view.getTitle(); 
        
        String oldTitle = title;
        DVD dvd = service.getDVD(title);
        
        if((dvd !=  null)) { //If a DVD isn't in the map
            view.editDVD(dvd);
            service.removeDVD(oldTitle);
            service.addDVD(dvd);
        } else
            doesNotExist(); //If a DVD doesn't exist
    }
    
    private void doesNotExist() {//Used for editDVD
        view.doesNotExist();
    }
    
    private void removeDVD() throws DVDLibraryPersistenceException{ //removes DVD from list
        view.displayRemoveDVDBanner();
        String title = view.getTitle();
        DVD removedDVD = service.removeDVD(title);
        view.displayRemoveResult(removedDVD);
    }
    
    private void unknownCommand() { //When an unknown command pops up
        view.displayUnkownCommandBanner();
    }
    
    private void exitMessage() { //Final message of the program
        view.displayExitBanner();
    }
}
