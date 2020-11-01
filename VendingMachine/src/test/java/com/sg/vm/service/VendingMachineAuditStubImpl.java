package com.sg.vm.service;

import com.sg.vm.dao.VendingMachineAuditDao;
import com.sg.vm.dao.VendingMachinePersistenceException;

public class VendingMachineAuditStubImpl implements VendingMachineAuditDao{

    @Override
    public void writeAuditEntry(String entry) throws VendingMachinePersistenceException {
        
    }
    
}
