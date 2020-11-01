package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

public class DVDLibraryView {
    
    //private UserIO io =  new UserIOConsoleImpl();
    private UserIO io;
    
    public DVDLibraryView(UserIO io) { //Implemets User Interface
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu"); //Printing out the Main Menu
            io.print("1. Add a DVD");
            io.print("2. Remove a DVD");
            io.print("3. Edit DVD Infromation");
            io.print("4. List DVD Collection");
            io.print("5. Search for DVD");
            io.print("6. Exit");
            
            return io.readInt("Please select from the above choices.", 1, 6);
            //Reading an integer from 1 - 6
    }
    
    public DVD getNewDVDInfo() { //Getting info for new DVD
        boolean valid = false;
        
        String title = io.readString("Please enter the title"); //Enter title
        String releaseDate = io.readString("Please enter the release date"); //Enter date
        String studio = io.readString("Please enter the studio that made the movie"); //Enter studio
        String director = io.readString("Please enter the director of the move"); //Enter director
        String note = io.readString("Please leave a comment about the movie"); //Leave comment
        String MPAA = null;
        
        while(!valid) { //Keeps looping until you put in a valid rating
            MPAA = io.readString("Please enter an MPAA rating");
            if((MPAA.equals("G")) || (MPAA.equals("PG")) || MPAA.endsWith("PG-13")
              || (MPAA.equals("R")) || (MPAA.equals("NC-17"))) {
                  valid = true;  
            } else {
                io.print("Invalid rating");
            }
        }
        
        DVD currentDVD = new DVD(); //Creates new DVD

        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setStudio(studio);
        currentDVD.setDirector(director);
        currentDVD.setMPAA(MPAA);
        currentDVD.setNote(note);
        
        return currentDVD;
    }
    
    public void displayCreateDVDBanner() {
        io.print("=== Create DVD ===");
    }
    
    public void displayCreateSuccessBanner() {
        io.readString("DVD Successfully created. Pleae hit enter to continue");
    }
    
    public void displayDVDList(List<DVD> dvdList) {
        for (DVD currentDVD : dvdList) { //For loop for displaying list
            String dvdInfo = String.format("%s", currentDVD.getTitle());
        
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue");
    }
    
    public void displayALLDVDBanner() {
        io.print("=== Display All DVD's ===");
    }
    
    public void displayDVDBanner() {
        io.print("=== Display DVD ===");
    }
    
    public String getTitle() {
        return io.readString("Please enter the title.");
    }
    
    public void editDVDBanner() {
        io.print("=== Edit DVD ===");
    }
    
    public void displayDVD(DVD dvd) { //Displaying DVD info
        if(dvd != null) {
            io.print("Title: " + dvd.getTitle());
            io.print("Release Date: " + dvd.getReleaseDate());
            io.print("Director: " + dvd.getDirector());
            io.print("Studio: " + dvd.getStudio());
            io.print("MPAA rating: " + dvd.getMPAA());
            io.print("Note: " + dvd.getNote());
        } else {
            io.print("DVD does not exist");
        }
        io.readString("Please hit enter to continue");
    }
    
    public void editDVD(DVD dvd) { //For editing DVD
        boolean edit = true;
        if (dvd != null) { //Checking to see if dvd is null
            while(edit) { // EditMenu
                io.print("Edit Menu");
                io.print("1. Release Date");
                io.print("2. MPAA Rating");
                io.print("3. Director's Name");
                io.print("4. Studio");
                io.print("5. note");
                io.print("6. exit");
                
                int menuSelection = io.readInt("Please select from the above " 
                        + "choices to edit " + dvd.getTitle());
                
                switch(menuSelection) {
                    case 1: //Editing release date
                        String releaseDate = io.readString("Please enter the release date");
                        dvd.setReleaseDate(releaseDate);
                        io.readString("Edit has been made, press enter to continue");
                        break;
                    case 2: //Editing rating
                        String rating = io.readString("Please enter the MPAA rating");
                        dvd.setMPAA(rating);
                        io.readString("Edit has been made, press enter to continue");
                        break;
                    case 3: //Editing director
                        String director = io.readString("Please enter the name of the director");
                        dvd.setDirector(director);
                        io.readString("Edit has been made, press enter to continue");
                        break;
                    case 4: //Editing studio
                        String studio = io.readString("Please enter the name of the studio");
                        dvd.setStudio(studio);
                        io.readString("Edit has been made, press enter to continue");
                        break;
                    case 5: //Editing note
                        String note = io.readString("Please leave a comment");
                        dvd.setNote(note);
                        io.readString("Edit has been made, press enter to continue");
                        break;
                    case 6: //Leaving the edit menu
                        edit = false;
                        break;   
                    default:
                        io.print("Unknown command");
                }
            }
        } else {
            io.print("DVD does not exist");
            edit = false;
        }
        io.readString("Please hit enter to continue");
    }
    
    public void displayRemoveDVDBanner() {
        io.print("=== Remove Student ===");
    }
    
    public void displayRemoveResult(DVD dvdRecord) { //Result for removing DVD
        if(dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD exists");
        }
        io.readString("Pleae hit enter to continue");
    }
    
    public void displayExitBanner() {
        io.print("Good Bye!!");
    }
    
    public void displayUnkownCommandBanner() {
        io.print("Unknown Command!!");
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
    public void doesNotExist() {
        io.print("DVD does not exist");
        io.readString("Press enter to continue");
    }
}
