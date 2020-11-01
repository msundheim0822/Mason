package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import com.sg.dvdlibrary.dao.DVDLibraryAuditDao;
import com.sg.dvdlibrary.dao.DVDLibraryAuditDaoFileImpl;
import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import com.sg.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.dvdlibrary.service.DVDLibraryDataValidateException;
import com.sg.dvdlibrary.service.DVDLibraryDuplicateTitleException;
import com.sg.dvdlibrary.service.DVDLibraryServiceLayer;
import com.sg.dvdlibrary.service.DVDLibraryServiceLayerImpl;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) throws DVDLibraryDuplicateTitleException, DVDLibraryDataValidateException {
        UserIO myIO = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIO);
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryAuditDao myAuditDao = new DVDLibraryAuditDaoFileImpl();
        DVDLibraryServiceLayer myService = new DVDLibraryServiceLayerImpl(myDao, myAuditDao);
        DVDLibraryController controller = new DVDLibraryController(myService, myView);
        controller.run(); //runs the program
    }
}