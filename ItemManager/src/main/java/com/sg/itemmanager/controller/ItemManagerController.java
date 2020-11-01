package com.sg.itemmanager.controller;

import com.sg.itemmanager.dao.ItemManagerDao;
import com.sg.itemmanager.dao.ItemManagerDaoFileImpl;
import com.sg.itemmanager.dto.Item;
import com.sg.itemmanager.ui.ItemManagerView;
import com.sg.itemmanager.ui.UserIO;
import com.sg.itemmanager.ui.UserIOConsoleImpl;

public class ItemManagerController {
    
    private ItemManagerView view = new ItemManagerView();
    private ItemManagerDao dao = new ItemManagerDaoFileImpl();
    private UserIO io = new UserIOConsoleImpl();
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while(keepGoing) {
            
            menuSelection = getMenuSelection();
            
            switch (menuSelection) {
                case 1:
                    io.print("List Titles");
                    break;
                case 2:
                    createItem();
                    break;
                case 3:
                    io.print("View Title");
                    break;
                case 4:
                    io.print("Remove a Title");
                    break;
                case 5:
                    io.print("Edit a Title");
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
        }
        io.print("BYE!");
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createItem() {
        view.displayCreateItemBanner();
        Item newItem = view.getNewItemInfo();
        dao.addTitle(newItem.getTitle(), newItem);
        view.displayCreateSuccessBanner();
    }
}
