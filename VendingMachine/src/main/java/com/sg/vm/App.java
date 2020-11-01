/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm;

import com.sg.vm.controller.VendingMachineController;
import com.sg.vm.dao.VendingMachineAuditDaoFileImpl;
import com.sg.vm.dao.VendingMachinePersistenceException;
import com.sg.vm.dao.VendingMachineDaoFileImpl;
import com.sg.vm.service.InsufficientFundsException;
import com.sg.vm.service.NoItemInventoryException;
import com.sg.vm.service.VendingMachineDataValidationException;
import com.sg.vm.service.VendingMachineServiceLayerImpl;
import com.sg.vm.ui.UserIO;
import com.sg.vm.ui.UserIOConsoleImpl;
import com.sg.vm.ui.VendingMachineView;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.sg.vm.dao.VendingMachineAuditDao;
import com.sg.vm.dao.VendingMachineDao;
import com.sg.vm.service.VendingMachineServiceLayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, VendingMachinePersistenceException, NoItemInventoryException, VendingMachineDataValidationException, InsufficientFundsException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller = ctx.getBean("controller", VendingMachineController.class);
        controller.run();
    }
}
