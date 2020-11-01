package com.sg.itemmanager.dao;

import com.sg.itemmanager.dto.Item;
import java.util.List;

public interface ItemManagerDao {
    
    Item addTitle(String title, Item item);

    Item getItem(String title);
    
    Item removeItem(String title);
    
    Item editItem(String title); 
    
    List<Item> getAllItems();
}