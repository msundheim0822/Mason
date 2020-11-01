package com.sg.itemmanager.dao;

import com.sg.itemmanager.dto.Item;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemManagerDaoFileImpl implements ItemManagerDao{

    private Map<String, Item> items = new HashMap<>();
    
    @Override
    public Item addTitle(String title, Item item) {
        Item prevItem = items.put(title, item);
        return prevItem;
    }

    @Override
    public Item getItem(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item removeItem(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item editItem(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
