/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.services;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dto.Student;
import com.sg.classroster.service.ClassRosterDataValidationException;
import com.sg.classroster.service.ClassRosterDuplicateIdException;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.classroster.services1.ClassRosterDaoStubImpl;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mason
 */
public class ClassRosterServiceLayerImplTest {
    
    private ClassRosterServiceLayer service;

    public ClassRosterServiceLayerImplTest() {
        ClassRosterDao dao = new ClassRosterDaoStubImpl();
        ClassRosterAuditDao auditDao = new ClassRosterAuditDaoStubImpl();

        service = new ClassRosterServiceLayerImpl(dao, auditDao);
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
    public void testCreateValidStudent() throws ClassRosterPersistenceException {
        ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    service = 
        ctx.getBean("serviceLayer", ClassRosterServiceLayer.class);
    // ARRANGE
        Student student = new Student("0002");
        student.setFirstName("Charles");
        student.setLastName("Babbage");
        student.setCohort(".NET-May-1845");
    // ACT
        try {
            service.createStudent(student);
        } catch (ClassRosterDuplicateIdException| ClassRosterDataValidationException
        | ClassRosterPersistenceException e) {
            fail("Student was valid. No exception should have been thrown.");
        }
    }
    
    @Test
    public void testGetStudent() throws Exception {
        ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    service = 
        ctx.getBean("serviceLayer", ClassRosterServiceLayer.class);
    // ARRANGE
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");

    // ACT & ASSERT
        Student shouldBeAda = service.getStudent("0001");
        assertNotNull(shouldBeAda, "Getting 0001 should be not null.");
        assertEquals( testClone, shouldBeAda,"Student stored under 0001 should be Ada.");

        Student shouldBeNull = service.getStudent("0042");    
        assertNull( shouldBeNull, "Getting 0042 should be null.");
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    service = 
        ctx.getBean("serviceLayer", ClassRosterServiceLayer.class);
    // ARRANGE
        Student testClone = new Student("0001");
        testClone.setFirstName("Ada");
        testClone.setLastName("Lovelace");
        testClone.setCohort("Java-May-1845");

    // ACT & ASSERT
        Student shouldBeAda = service.removeStudent("0001");
        assertNotNull( shouldBeAda, "Removing 0001 should be not null.");
        assertEquals( testClone, shouldBeAda, "Student removed from 0001 should be Ada.");

        Student shouldBeNull = service.removeStudent("0042");    
        assertNull( shouldBeNull, "Removing 0042 should be null.");
    }
}
