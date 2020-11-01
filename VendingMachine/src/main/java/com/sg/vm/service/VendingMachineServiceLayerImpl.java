package com.sg.vm.service;

import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.List;
import com.sg.vm.dao.VendingMachineAuditDao;
import com.sg.vm.dao.VendingMachineDao;

public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer{
    
    VendingMachineDao dao;
    private VendingMachineAuditDao auditDao;
    
    public VendingMachineServiceLayerImpl(VendingMachineDao dao, VendingMachineAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public List<Item> getAllItems() throws VendingMachinePersistenceException {
        return dao.getAllItems();
    }

    @Override
    public void addItem(String name, Item item) throws VendingMachinePersistenceException, VendingMachineDataValidationException {
        Item x =  dao.getItem(item.getName());
        if(x != null) {
            throw new VendingMachinePersistenceException("Error while updating inventory");
        }
        
        validateItemData(item);
        dao.addItem(item.getName(), item);
    }

    //Edit
    @Override
    public Item reduceAmount(Item item) throws VendingMachinePersistenceException, NoItemInventoryException {
        if (item.getAmount() > 0) {
            return dao.reduceAmount(item.getName());    
        }
        else
            throw new NoItemInventoryException("No item in stock");
    }

    @Override
    public Item removeItem(String name) throws VendingMachinePersistenceException {
        return dao.removeItem(name);
    }

    @Override
    public Item getItem(String name) throws VendingMachinePersistenceException {
        return dao.getItem(name);
    }

    //Edit
    @Override
    public BigDecimal change(BigDecimal amount, BigDecimal cost, String name, int remain) throws VendingMachinePersistenceException, InsufficientFundsException {
        int res = amount.compareTo(cost);
        if ((res == 1) || (res == 0)) {
            auditDao.writeAuditEntry("1 " + name + " for $" + String.valueOf(amount) + ", change is $" + String.valueOf(dao.change(amount, cost))
            + " remaining amount of " + name +" is " + remain);
            return dao.change(amount, cost);
        } else if (res == -1) {
            throw new InsufficientFundsException("Insufficient funds");
        } else
            return amount;
    }
    
    private void validateItemData(Item item) throws VendingMachineDataValidationException {
        
        String amount = String.valueOf(item.getAmount());
        
        if(item.getName() == null
                || item.getName().trim().length() == 0
                || amount == null
                || amount.trim().length() == 0
                || String.valueOf(item.getCost()) == null
                || String.valueOf(item.getCost()).trim().length() == 0)
            throw new VendingMachineDataValidationException("ERROR while reading file");
    }
}
