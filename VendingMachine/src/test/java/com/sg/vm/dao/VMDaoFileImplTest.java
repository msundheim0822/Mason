package com.sg.vm.dao;

import com.sg.vm.dto.Item;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VMDaoFileImplTest {
    
    VendingMachineDao testDao;
    
    public VMDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws IOException {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetAllItems() throws Exception {
        testDao = new VendingMachineDaoFileImpl();
        List<Item> allItems = testDao.getAllItems(); 
        assertNotNull(allItems, "The list of items must not null");
        assertEquals(5, allItems.size(), "List of items should have 5 items");
    }
    
    @Test
    public void testGetItem() throws Exception {
        testDao = new VendingMachineDaoFileImpl();  
        Item getItem = testDao.getItem("Brisk");
        assertEquals(getItem.getName(), "Brisk");
    }
    
    @Test
    public void testChange() throws Exception {
        testDao = new VendingMachineDaoFileImpl();
        System.out.println("change");
        BigDecimal amount = new BigDecimal(3.00);
        BigDecimal cost = new BigDecimal(1.50);
        BigDecimal expResult = amount.subtract(cost);
        BigDecimal result = testDao.change(amount, cost);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReduceAmount() throws VendingMachinePersistenceException {
        testDao = new VendingMachineDaoFileImpl();  
        Item oldItem = testDao.getItem("Brisk");
        Item newItem = oldItem;
        testDao.reduceAmount("Brisk");
        testDao.removeItem("Brisk");
        testDao.addItem("Brisk", newItem);
        assertEquals(193, newItem.getAmount());
    }
}
