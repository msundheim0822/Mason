package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassDaoRosterFileImpl;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //UserIO myIo = new UserIOConsoleImpl();
        //ClassRosterView myView = new ClassRosterView(myIo);
        //ClassRosterDao myDao = new ClassDaoRosterFileImpl();
        //ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        //ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller = 
           ctx.getBean("controller", ClassRosterController.class);
        controller.run();
    }
}