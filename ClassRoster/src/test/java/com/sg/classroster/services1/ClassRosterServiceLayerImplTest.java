/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.services1;

import com.sg.classroster.dto.Student;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mason
 */
public class ClassRosterServiceLayerImplTest {
    
    public ClassRosterServiceLayerImplTest() {
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

    /**
     * Test of createStudent method, of class ClassRosterServiceLayerImpl.
     */
    @Test
    public void testCreateStudent() throws Exception {
        System.out.println("createStudent");
        Student student = null;
        ClassRosterServiceLayerImpl instance = null;
        instance.createStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudents method, of class ClassRosterServiceLayerImpl.
     */
    @Test
    public void testGetAllStudents() throws Exception {
        System.out.println("getAllStudents");
        ClassRosterServiceLayerImpl instance = null;
        List<Student> expResult = null;
        List<Student> result = instance.getAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class ClassRosterServiceLayerImpl.
     */
    @Test
    public void testGetStudent() throws Exception {
        System.out.println("getStudent");
        String studentId = "";
        ClassRosterServiceLayerImpl instance = null;
        Student expResult = null;
        Student result = instance.getStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class ClassRosterServiceLayerImpl.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        System.out.println("removeStudent");
        String studentId = "";
        ClassRosterServiceLayerImpl instance = null;
        Student expResult = null;
        Student result = instance.removeStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
