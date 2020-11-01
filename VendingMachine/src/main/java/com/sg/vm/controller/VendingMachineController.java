package com.sg.vm.controller;

import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dao.VendingMachineDaoFileImpl;
import java.io.*;
import com.sg.vm.dto.Item;
import com.sg.vm.service.InsufficientFundsException;
import com.sg.vm.service.NoItemInventoryException;
import com.sg.vm.service.VendingMachineDataValidationException;
import com.sg.vm.ui.UserIO;
import com.sg.vm.ui.UserIOConsoleImpl;
import com.sg.vm.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.List;
import com.sg.vm.dao.VendingMachineDao;
import com.sg.vm.service.VendingMachineServiceLayer;

public class VendingMachineController {
    
    private VendingMachineServiceLayer service;
    private VendingMachineView view;
    UserIO myIO = new UserIOConsoleImpl();
    
    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        this.service = service;
        this.view = view;
    }
    
    public void run() throws FileNotFoundException, IOException, VendingMachinePersistenceException, NoItemInventoryException, VendingMachineDataValidationException, InsufficientFundsException {       
        BigDecimal total = getMoney();
        String[] names = listItems();     
        int menuSelection = getChoice(1, names.length);  
        total = transaction(names[menuSelection - 1], total);        
        getChange(total);
    }
    
    private String[] listItems() throws VendingMachinePersistenceException {
        String[] names;
        view.displayItemsBanner();
        List<Item> itemList = service.getAllItems();
        names = view.displayItemList(itemList);
        return names;
    }
    
    private BigDecimal transaction(String name, BigDecimal cost) throws VendingMachinePersistenceException, NoItemInventoryException, VendingMachineDataValidationException, InsufficientFundsException {
        BigDecimal change = cost;       
        String item = name;
        String oldItem = item;
        Item reducedItem = service.getItem(name); 
        try{
            change = service.change(cost, reducedItem.getCost(), name, reducedItem.getAmount()); 
        } catch(InsufficientFundsException e) {
            view.insufficientFunds();
        }
        
        if(cost.compareTo(change) != 0) {
            view.transactionCompletedBanner();
            service.reduceAmount(reducedItem);        
            service.removeItem(oldItem);
            service.addItem(name, reducedItem);
        }    
        return change;
    }
    
    private void getChange(BigDecimal total) {
        BigDecimal converter = total.multiply(new BigDecimal(100));
        int cents = converter.intValue();    
        int quarters = cents / 25;
        int cents1 = cents % 25;
        int dimes = cents1 / 10;
        int cents2 = cents1 % 10;
        int nickels = cents2 / 5;
        int cents3 = cents2 % 5;
        int pennies = cents3; 
        view.printChange(quarters, dimes, nickels, pennies);
    }
    
    int getChoice(int min, int max) {
        int choice = view.getOption(min, max);
        return choice;
    }
    
    BigDecimal getMoney(){
        BigDecimal money = view.getAmount();
        return money;
    }
}