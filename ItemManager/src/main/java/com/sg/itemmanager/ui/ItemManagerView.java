package com.sg.itemmanager.ui;

import com.sg.itemmanager.dto.Item;
import java.time.LocalDate;

public class ItemManagerView {
    
    private UserIO io = new UserIOConsoleImpl();
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Titles");
        io.print("2. Create New Title");
        io.print("3. View a Title");
        io.print("4. Remove a Title");
        io.print("5. Edit a Title");
        io.print("6. Exit");
        
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    public Item getNewItemInfo() {
        String title = io.readString("Please enter title");
        String system = io.readString("Please enter the name of the system");
        String genre = io.readString("Please enter the name of the genre");
        LocalDate releaseDate = io.readLocalDate("Please enter the release date");
        
        Item currentItem = new Item(title);
        currentItem.setGenre(genre);
        currentItem.setSystem(system);
        currentItem.setRealeaseDate(releaseDate);
        
        return currentItem;
    }
    
    public void displayCreateItemBanner() {
        io.print("=== Create Item ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString("Item successfully created.  Please hit enter to continue");
    }
}
