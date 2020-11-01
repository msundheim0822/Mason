package com.sg.vm.dao;

import com.sg.vm.dto.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendingMachineDaoFileImpl implements VendingMachineDao{

    private Map<String, Item> items = new HashMap<>();
    public final String VM_FILE;
    public static final String DELIMITER = "::";
    
    public VendingMachineDaoFileImpl() {
        VM_FILE = "VendingMachine.txt";
    }
    
    public VendingMachineDaoFileImpl(String vmTextFile) {
        VM_FILE = vmTextFile;
    }
    
    @Override
    public List<Item> getAllItems() throws VendingMachinePersistenceException{
        loadMachine();
        return new ArrayList(items.values());
    }

    @Override
    public Item reduceAmount(String name) {
        Item reduceAmount = items.get(name);
        int amount = reduceAmount.getAmount();
        reduceAmount.setAmount(amount - 1);
        return reduceAmount;
    }

    @Override
    public Item addItem(String name, Item item) throws VendingMachinePersistenceException{
        loadMachine();
        Item newItem = items.put(name, item);
        try {
            writeMachine(items);
        } catch (IOException e) {
            Logger.getLogger(VendingMachineDaoFileImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return newItem;
    }  

    @Override
    public Item removeItem(String name) throws VendingMachinePersistenceException{
        loadMachine();
        Item removedItem = items.remove(name);
        try {
            writeMachine(items);
        } catch (IOException e) {
            Logger.getLogger(VendingMachineDaoFileImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return removedItem;
    }

    @Override
    public Item getItem(String name) throws VendingMachinePersistenceException{
        loadMachine();
        return items.get(name);
    }
    
    private void loadMachine() throws VendingMachinePersistenceException {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(VM_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingMachinePersistenceException("Could not load items from memory", e);
        }
        
        String currentLine;
        Item currentItem;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentItem = unmarshallItem(currentLine);
            items.put(currentItem.getName(), currentItem);
        }
        scanner.close();
    }
    
    private void writeMachine(Map<String, Item> items) throws VendingMachinePersistenceException, IOException{
       PrintWriter writer;
       try {
           writer = new PrintWriter(new FileWriter(VM_FILE));
       } catch (FileNotFoundException e) {
           throw new VendingMachinePersistenceException("Could not load inventory data into memory", e);
       }
       for(Map.Entry<String, Item> thisItem: items.entrySet()) {
           writer.println(marhsallItem(thisItem.getValue()));
       }
       writer.close();
    }
    
    private Item unmarshallItem(String itemAsText) {
        String[] itemTokens = itemAsText.split(DELIMITER);
        BigDecimal cost = new BigDecimal(itemTokens[1]);
        int amount = Integer.parseInt(itemTokens[2]);
        
        String name = itemTokens[0];
        Item itemFromFile = new Item(name);
        itemFromFile.setCost(cost);
        itemFromFile.setAmount(amount);
        
        return itemFromFile;
    }
    
    private String marhsallItem(Item aItem) {
        String cost = String.valueOf(aItem.getCost());
        String amount = String.valueOf(aItem.getAmount());
        
        String itemAsText = aItem.getName() + DELIMITER;
        itemAsText += cost + DELIMITER;
        itemAsText += amount;
        
        return itemAsText;
    }

    @Override
    public BigDecimal change(BigDecimal amount, BigDecimal cost) throws VendingMachinePersistenceException {
        BigDecimal change = amount.subtract(cost);
        return change;
    }
}
