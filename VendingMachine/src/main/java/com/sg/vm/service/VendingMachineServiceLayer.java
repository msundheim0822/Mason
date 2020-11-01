package com.sg.vm.service;

import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.List;

public interface VendingMachineServiceLayer {
    
    List<Item> getAllItems() throws VendingMachinePersistenceException;
    
    void addItem(String name, Item item) throws VendingMachinePersistenceException, VendingMachineDataValidationException;
    
    Item reduceAmount(Item item) throws VendingMachinePersistenceException, NoItemInventoryException;
    
    Item removeItem(String name) throws VendingMachinePersistenceException;
    
    Item getItem(String name) throws VendingMachinePersistenceException;
    
    BigDecimal change (BigDecimal amount, BigDecimal cost, String name, int remain)throws VendingMachinePersistenceException, InsufficientFundsException;
}