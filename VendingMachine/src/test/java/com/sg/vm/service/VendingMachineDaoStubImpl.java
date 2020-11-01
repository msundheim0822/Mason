package com.sg.vm.service;

import com.sg.vm.dao.VendingMachineDao;
import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineDaoStubImpl implements VendingMachineDao{

    public Item onlyItem ;

    public VendingMachineDaoStubImpl() {
        onlyItem = new Item("M&M's");
        onlyItem.setAmount(9);
        onlyItem.setCost(new BigDecimal(1.00));
    }
    
    @Override
    public List<Item> getAllItems() throws VendingMachinePersistenceException {
        List<Item> itemList  = new ArrayList<>();
        itemList.add(onlyItem);
        return itemList;
    }

    @Override
    public Item addItem(String name, Item item) throws VendingMachinePersistenceException {
        if (name.equals(onlyItem.getName())) {
            onlyItem = item;
            return null;
        } else {
            return onlyItem;
        }
    }

    @Override
    public Item reduceAmount(String name) throws VendingMachinePersistenceException {
        
        if (name.equals(onlyItem.getName())){
            int amount = onlyItem.getAmount() - 1;
            onlyItem.setAmount(amount);
            return onlyItem;
        } else {
            return null;
        }
    }

    @Override
    public Item removeItem(String name) throws VendingMachinePersistenceException {
        List<Item> itemList  = new ArrayList<>();
        itemList.add(onlyItem);
        if (name.equals(onlyItem.getName())) {
           itemList.remove(name);
           //return onlyItem;
           return onlyItem;
       } else {
           return null;
       }
    }

    @Override
    public Item getItem(String name) throws VendingMachinePersistenceException {
        if (name.equals(onlyItem.getName())) {
            return onlyItem;
        } else {
            return null;
        }
    }

    @Override
    public BigDecimal change(BigDecimal amount, BigDecimal cost) throws VendingMachinePersistenceException {
        BigDecimal change = amount.subtract(cost);
        return change;
    }
}