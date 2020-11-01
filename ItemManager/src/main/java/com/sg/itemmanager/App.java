package com.sg.itemmanager;

import com.sg.itemmanager.controller.ItemManagerController;

public class App {

    public static void main(String[] args) {
        ItemManagerController controller = new ItemManagerController();
        controller.run();
    }   
}
