/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hangman.service;

import com.sg.hangman.dao.HangManAuditDao;
import com.sg.hangman.dao.HangManAuditDaoFileImpl;
import com.sg.hangman.dao.HangManDao;
import com.sg.hangman.dao.HangManDaoFileImpl;
import com.sg.hangman.dao.HangManDuplicateException;
import com.sg.hangman.dao.HangManPersistenceException;
import com.sg.hangman.dto.Word;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HangManServiceLayerImplTest {
    
    HangManServiceLayer testService;
    HangManDao testDao;
    HangManAuditDao testAuditDao;
    
    public HangManServiceLayerImplTest() {
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
     * Test of addGuess method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testAddGuess() throws HangManDuplicateException, HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        testService.addGuess("a");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("_");//1
        letters.add("a");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("a");//5
        letters.add("_");//6
        
        assertEquals(letters, testService.getLetters());
    }

    /**
     * Test of getAllGuesses method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testGetAllGuesses() throws HangManDuplicateException, HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        testService.addGuess("a");
        testService.addGuess("z");
        testService.addGuess("p");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("a");//1
        letters.add("z");//2
        letters.add("p");//3
        
        assertEquals(letters, testService.getAllGuesses());
    }

    /**
     * Test of getAllBadGuessses method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testGetAllBadGuessses() throws HangManDuplicateException, HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        testService.addGuess("a");
        testService.addGuess("z");
        testService.addGuess("p");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("z");//2
        letters.add("p");//3
        
        assertEquals(letters, testService.getAllBadGuessses());
    }

    /**
     * Test of addPunctuation method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testAddPunctuation() throws HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        ArrayList<String> letters = new ArrayList<String>();
        
        letters.add("_");//1
        letters.add("_");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("_");//5
        letters.add("_");//6
        
        assertEquals(letters, testService.getLetters());
    }

    /**
     * Test of loadWords method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testLoadWords() throws Exception {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        assertEquals(testService.loadWords().getString(), "bat-man");
    }

    /**
     * Test of getString method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testGetString() throws HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        assertEquals(testService.getString(), "bat-man");
    }

    /**
     * Test of getLetters method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testGetLetters() throws HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("_");//1
        letters.add("_");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("_");//5
        letters.add("_");//6
        
        assertEquals(letters, testService.getLetters());
    }

    /**
     * Test of compare method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testCompare() throws HangManPersistenceException, FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        testService.loadWords();
        
        assertFalse(testService.compare());
        
        testDao.addGuess("b");
        testDao.addGuess("a");
        testDao.addGuess("t");
        testDao.addGuess("m");
        testDao.addGuess("n");
        
        assertTrue(testService.compare());
    }

    /**
     * Test of gameEnd method, of class HangManServiceLayerImpl.
     */
    @Test
    public void testGameEnd() throws Exception {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testAuditDao = new HangManAuditDaoFileImpl();
        testService = new HangManServiceLayerImpl(testDao, testAuditDao);
        
        ArrayList<String> letters = new ArrayList<String>();
        
        letters.add("b");//1
        letters.add("a");//2
        letters.add("t");//3
        letters.add("-");
        letters.add("m");//4
        letters.add("a");//5
        letters.add("n");//6
        
        assertTrue(testService.gameEnd(true));
    }
    
}
