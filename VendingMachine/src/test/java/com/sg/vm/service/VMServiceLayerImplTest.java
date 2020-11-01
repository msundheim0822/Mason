/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.service;

import com.sg.vm.dao.VendingMachineDaoFileImpl;
import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dto.Item;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sg.vm.dao.VendingMachineAuditDao;
import com.sg.vm.dao.VendingMachineDao;

/**
 *
 * @author Mason
 */
public class VMServiceLayerImplTest {
    
    VendingMachineServiceLayer service;
    
    public VMServiceLayerImplTest() {
        VendingMachineDao dao = new VendingMachineDaoStubImpl();
        VendingMachineAuditDao auditDao = new VendingMachineAuditStubImpl();
        service = new VendingMachineServiceLayerImpl(dao, auditDao);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testChange() throws Exception, VendingMachinePersistenceException, InsufficientFundsException{
        Item mm = service.getItem("M&M's");
        BigDecimal amount = new BigDecimal(3.00);
        BigDecimal change = service.change(amount, mm.getCost(), mm.getName(), mm.getAmount());
        assertEquals(new BigDecimal(2.00), change);
    }

    @Test
    public void testGetAllItems() throws Exception {
        assertEquals(1, service.getAllItems().size());
        assertTrue(service.getAllItems().get(0).getName().equals("M&M's"));
    }
    
    @Test
    public void testGetItem() throws Exception {
        Item mm = service.getItem("M&M's");
        Item toast = service.getItem("Toast");
        assertNotNull(mm, "Getting Sprite should not be null");
        assertNull(toast, "Getting toast should be null");
    }
    
    @Test
    public void testReduceAmount() throws VendingMachinePersistenceException, NoItemInventoryException, VendingMachineDataValidationException {
        
        Item oldItem = service.getItem("M&M's");
        Item newItem = oldItem;
        
        service.reduceAmount(newItem);
        service.removeItem(oldItem.getName());
        newItem = new Item("Pepsi");
        newItem.setAmount(8);
        newItem.setCost(BigDecimal.ONE);
        service.addItem(newItem.getName(), newItem);
        assertEquals(8, newItem.getAmount());
    }
    
    
    
    //public void TestRemove() throws VendingMachinePersistenceException {
        //Item oldItem = service.getItem("M&M's");
        
        //Item removedItem = 
    //}
}
