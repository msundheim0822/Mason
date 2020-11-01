package com.sg.vm.ui;

import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.List;

public class VendingMachineView {
    
    private UserIO io;
    
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    
    public String[] displayItemList(List<Item> itemList) {
        int i = 1;
        String[] itemNames = new String[itemList.size()];
        for (Item currentItem : itemList) {
            if (currentItem.getAmount() > 0) {
                io.print(i + ". " + currentItem.getName() + ", Cost: " + currentItem.getCost()
                    + ", Amount: " + currentItem.getAmount());
                itemNames[i-1] = currentItem.getName();
                i++;
            }   
        }
        
        int updatedAmount = i-1;
        
        String[] updatedItems = new String[updatedAmount];
        
        for (int j = 0; j < updatedAmount; j++)
            updatedItems[j] = itemNames[j];
        
        return updatedItems;
    }
    
    public void displayItemsBanner() {
        io.print("=== List of All the Items ===");
    }
    
    public void transactionCompletedBanner() {
        io.print("=== Transaction Completed! ===");
    }
    
    public int getOption(int min, int max) {
        int option;
        option = io.readInt("Please choose from the choices above", min, max);
        return option;
    }
    
    public BigDecimal getAmount() {
        BigDecimal amount = io.readBigDecimal("How much money do you want to enter?");
        return amount;
    } 
    
    public void printChange(int quarters, int dimes, int nickels, int pennies) {
        if((quarters != 0) || (dimes != 0) || (nickels != 0) || (pennies != 0)) {       
            io.print("Your change is: ");
            io.print("Quarters: " + quarters);
            io.print("Dimes: " + dimes);
            io.print("Nickels: " + nickels);
            io.print("Pennies: " + pennies);
        }
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
    public void insufficientFunds() {
        io.print("=== Insufficient Funds ===");
    }
}
