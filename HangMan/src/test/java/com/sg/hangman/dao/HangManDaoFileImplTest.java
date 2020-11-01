package com.sg.hangman.dao;

import com.sg.hangman.dto.Word;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HangManDaoFileImplTest {
    
    HangManDao testDao;
    
    public HangManDaoFileImplTest() {
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
    public void testAddPunctuation() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("_");//1
        letters.add("_");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("_");//5
        letters.add("_");//6
        
        assertEquals(letters, testDao.getLetters());
    }
    
    @Test
    public void testAddGuess() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        
        testDao.addGuess("a");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("_");//1
        letters.add("a");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("a");//5
        letters.add("_");//6
        
        assertEquals(letters, testDao.getLetters());
    }
     
    @Test
    public void testGetAllGuesses() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        
        testDao.addGuess("a");
        testDao.addGuess("z");
        testDao.addGuess("p");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("a");//1
        letters.add("z");//2
        letters.add("p");//3
        
        assertEquals(letters, testDao.getAllGuesses());
    }
     
    @Test
    public void testGetAllBadGuesses() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        
        testDao.addGuess("a");
        testDao.addGuess("z");
        testDao.addGuess("p");
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("z");//2
        letters.add("p");//3
        
        assertEquals(letters, testDao.getAllBadGuesses());
    }
     
    @Test
    public void testLoadWords() throws Exception {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        assertEquals(testDao.loadWords().getString(), "bat-man");
    }
     
    @Test
    public void testGetString() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        assertEquals(testDao.getString(), "bat-man");
    }
     
    @Test
    public void testGetLetters() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        
        ArrayList<String> letters = new ArrayList<String>();
       
        letters.add("_");//1
        letters.add("_");//2
        letters.add("_");//3
        letters.add("-");
        letters.add("_");//4
        letters.add("_");//5
        letters.add("_");//6
        
        assertEquals(letters, testDao.getLetters());
    }

    @Test
    public void testCompare() throws FileNotFoundException {
        String testFile = "testwordlist.txt";
        testDao = new HangManDaoFileImpl(testFile);
        testDao.loadWords();
        
        assertFalse(testDao.compare());
        
        testDao.addGuess("b");
        testDao.addGuess("a");
        testDao.addGuess("t");
        testDao.addGuess("m");
        testDao.addGuess("n");
        
        assertTrue(testDao.compare());
    }
}