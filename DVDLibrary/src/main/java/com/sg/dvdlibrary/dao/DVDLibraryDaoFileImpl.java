package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao{

    private final String LIBRARY_FILE; //txt to read
    public static final String DELIMETER = "::"; //Seperating the values
    
    public DVDLibraryDaoFileImpl() {
        LIBRARY_FILE = "library.txt";
    }
    
    public DVDLibraryDaoFileImpl(String libraryTextFile) {
        LIBRARY_FILE = libraryTextFile;
    }
    
    private Map<String, DVD> dvds = new HashMap<>(); //Instantiating the hashmao
    
    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryPersistenceException{ //add DVD
        loadLibrary(); //Load library
        DVD newDVD = dvds.put(title, dvd); //Created new dvd
        try {
            writeLibrary(dvds);
        } catch (IOException ex) { //If something happens when making library
             Logger.getLogger(DVDLibraryDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryPersistenceException { //Load DVD Library
        loadLibrary();
        return new ArrayList(dvds.values());
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryPersistenceException {
        loadLibrary();
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryPersistenceException {
        loadLibrary();
        DVD removedStudent = dvds.remove(title);
        try {
            writeLibrary(dvds);
        } catch (IOException ex) {
            Logger.getLogger(DVDLibraryDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return removedStudent;
    } 
    
    private DVD unmarshallDVD(String dvdAsText){ //Seperating the values from txt file
        String[] dvdTokens = dvdAsText.split(DELIMETER);
        String dvdTitle = dvdTokens[0];
        
        DVD dvdFromFile = new DVD();
        
        dvdFromFile.setTitle(dvdTitle);
        dvdFromFile.setReleaseDate(dvdTokens[1]);
        dvdFromFile.setDirector(dvdTokens[2]);
        dvdFromFile.setStudio(dvdTokens[3]);
        dvdFromFile.setMPAA(dvdTokens[4]);
        dvdFromFile.setNote(dvdTokens[5]);

        return dvdFromFile;
    }
    
    private void loadLibrary() throws DVDLibraryPersistenceException { //Load DVD library
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryPersistenceException("-_- Could not load library data into memory.", e);
        }
        String currentLine;
        DVD currentDVD;
        while (scanner.hasNextLine()) { //Reading the file
            currentLine = scanner.nextLine();
            currentDVD = unmarshallDVD(currentLine);

            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        scanner.close();
    }
    
    private String marshallDVD(DVD aDVD){ //Putting the values together
        String dvdAsText = aDVD.getTitle() + DELIMETER;
        dvdAsText += aDVD.getReleaseDate() + DELIMETER;
        dvdAsText += aDVD.getDirector() + DELIMETER;
        dvdAsText += aDVD.getStudio() + DELIMETER;
        dvdAsText += aDVD.getMPAA() + DELIMETER;
        dvdAsText += aDVD.getNote() + DELIMETER;

        return dvdAsText;
    }
      
    private void writeLibrary(Map <String, DVD> dvds) throws DVDLibraryPersistenceException, IOException {
        PrintWriter writer;
        try {
            writer = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryPersistenceException( "-_- Could not load roster data into memory.", e);
        }
        for(Map.Entry<String, DVD> thisDVD: dvds.entrySet()){
            writer.println(marshallDVD(thisDVD.getValue()));
        }
        writer.close();
    }
}
