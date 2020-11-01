/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.service;

import com.sg.dvdlibrary.dao.DVDLibraryAuditDao;
import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryPersistenceException;
import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Mason
 */
public class DVDLibraryServiceLayerImpl implements DVDLibraryServiceLayer {
    
    DVDLibraryDao dao;
    
    private DVDLibraryAuditDao auditDao;
    
    public DVDLibraryServiceLayerImpl(DVDLibraryDao dao, DVDLibraryAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public void addDVD(DVD dvd) throws DVDLibraryDuplicateTitleException, DVDLibraryDataValidateException, DVDLibraryPersistenceException {
        if (dao.getDVD(dvd.getTitle()) != null) {
            throw new DVDLibraryDuplicateTitleException("ERROR: Could not creat Title "
            + dvd.getTitle() + "already exists");
        }
        validateDVDData(dvd);
        dao.addDVD(dvd.getTitle(), dvd);
        auditDao.writeAuditEntry("DVD " + dvd.getTitle() + " CREATED.");
    }

    @Override
    public List<DVD> getALLDVDs() throws DVDLibraryPersistenceException {
        return dao.getAllDVDs();
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryPersistenceException {
        return dao.getDVD(title);
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryPersistenceException {
        DVD removedDVD = dao.removeDVD(title);
        auditDao.writeAuditEntry("DVD " + title + " REMOVED");
        return removedDVD;
    } 
    
    private void validateDVDData(DVD dvd) throws DVDLibraryDataValidateException {
        
        if (dvd.getTitle() == null || dvd.getTitle().trim().length() == 0
                || dvd.getStudio() == null || dvd.getStudio().trim().length() == 0
                || dvd.getReleaseDate() ==null || dvd.getReleaseDate().trim().length() == 0
                || dvd.getDirector() == null || dvd.getDirector().trim().length() == 0
                || dvd.getMPAA() == null || dvd.getMPAA().trim().length() == 0
                || dvd.getNote() == null || dvd.getNote().trim().length() == 0) {
            throw new DVDLibraryDataValidateException  (
                "ERROR: All fields [Title, Studio, ReleaseDate, Director, MPAA, and Note] are required.");
        }
    }
}
    
