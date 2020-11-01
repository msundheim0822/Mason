package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

public interface DVDLibraryDao {
    
    DVD addDVD(String title, DVD dvd) throws DVDLibraryPersistenceException;
    
    List<DVD> getAllDVDs() throws DVDLibraryPersistenceException;
    
    DVD getDVD(String title) throws DVDLibraryPersistenceException;
    
    DVD removeDVD(String title) throws DVDLibraryPersistenceException;
}
