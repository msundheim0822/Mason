package com.sg.vm.dao;

import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.List;

public interface VendingMachineDao {
    
    List<Item> getAllItems() throws VendingMachinePersistenceException;
    
    Item addItem(String name, Item item) throws VendingMachinePersistenceException;
    
    Item reduceAmount(String name) throws VendingMachinePersistenceException;
    
    Item removeItem(String name) throws VendingMachinePersistenceException;
    
    Item getItem(String name) throws VendingMachinePersistenceException;
    
    BigDecimal change (BigDecimal amount, BigDecimal cost)throws VendingMachinePersistenceException;
}
