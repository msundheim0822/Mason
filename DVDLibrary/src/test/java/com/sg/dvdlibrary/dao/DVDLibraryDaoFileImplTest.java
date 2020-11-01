package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.io.FileWriter;
import java.io.IOException;
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
public class DVDLibraryDaoFileImplTest {
    
    DVDLibraryDao testDao;
    
    public DVDLibraryDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws IOException {
        String testFile = "testlibrary.txt";
        new FileWriter(testFile);
        
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddGetStudent() throws Exception {
        testDao = new DVDLibraryDaoFileImpl("testlibrary.txt");
        
        String title = "Toy Story 3";
        DVD dvd = new DVD();
        dvd.setTitle(title);
        dvd.setDirector("John Lasseter");
        dvd.setReleaseDate("November 22, 1995");
        dvd.setStudio("Pixar");
        dvd.setMPAA("G");
        dvd.setNote("It's great!");
        
        testDao.addDVD(title, dvd);
        DVD retrievedDVD = testDao.getDVD(title);
        
        assertEquals(dvd.getTitle(), retrievedDVD.getTitle(), "Checking DVD Title");
        assertEquals(dvd.getDirector(), retrievedDVD.getDirector(), "Checking DVD director");
        assertEquals(dvd.getTitle(), retrievedDVD.getTitle(), "Checking DVD Title");
        assertEquals(dvd.getDirector(), retrievedDVD.getDirector(), "Checking DVD director");
        assertEquals(dvd.getMPAA(), retrievedDVD.getMPAA(), "Checking DVD Title");
        assertEquals(dvd.getNote(), retrievedDVD.getNote(), "Checking DVD Note");
    }
    
    @Test
    public void testAddGetALlStudents() throws Exception {
        testDao = new DVDLibraryDaoFileImpl("testlibrary.txt");
        
        DVD firstDVD = new DVD();
        firstDVD.setTitle("DBZ Battle of Gods");
        firstDVD.setDirector("Akira Toriyama");
        firstDVD.setReleaseDate("March 21, 2015");
        firstDVD.setStudio("Toei Animation");
        firstDVD.setMPAA("PG-13");
        firstDVD.setNote("It's great!");
        
        DVD secondDVD = new DVD();
        secondDVD.setTitle("Spider-Man");
        secondDVD.setDirector("Sam Raimi");
        secondDVD.setReleaseDate("2002");
        secondDVD.setStudio("Sony");
        secondDVD.setMPAA("PG-13");
        secondDVD.setNote("It's good!");
        
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);
        
        List<DVD> allDVDs = testDao.getAllDVDs();
        
        assertNotNull(allDVDs, "The list of DVDs must not null");
        assertEquals(3, allDVDs.size(), "List of DVDs should have 3 DVDs");
        
        assertTrue(testDao.getAllDVDs().contains(firstDVD), "The list of DVDs should include DBZ Battle of Gods");
        assertTrue(testDao.getAllDVDs().contains(secondDVD), "The list of DVDs should include Spider-Man");
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        testDao = new DVDLibraryDaoFileImpl("testlibrary.txt");
        
        DVD firstDVD = new DVD();
        firstDVD.setTitle("Sonic The Hedgehog");
        firstDVD.setDirector("Tim Miller");
        firstDVD.setReleaseDate("Feburary 14, 2020");
        firstDVD.setStudio("Paramount");
        firstDVD.setMPAA("PG-13");
        firstDVD.setNote("It's great!");
        
        DVD secondDVD = new DVD();
        secondDVD.setTitle("Star Wars: Episode 9");
        secondDVD.setDirector("J.J. Abrams");
        secondDVD.setReleaseDate("2020");
        secondDVD.setStudio("Disney");
        secondDVD.setMPAA("PG-13");
        secondDVD.setNote("It's awful!");
        
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);
        
        DVD removedDVD = testDao.removeDVD(secondDVD.getTitle());
        
        assertEquals(removedDVD, secondDVD, "The removed DVD should be Star Wars: Episode 9");
        
        List<DVD> allDVDs = testDao.getAllDVDs();
        
        assertNotNull(allDVDs, "All DVDs list should not be null");
        assertEquals(4, allDVDs.size(), "All DVDs should have 2 DVDs");
        
        assertFalse(allDVDs.contains(secondDVD), "All DVDS should NOT include Star Wars: Episode 9");
        assertTrue(allDVDs.contains(firstDVD), "All DVDS should NOT include Sonic The Hedgehog");
        
        removedDVD = testDao.removeDVD(firstDVD.getTitle());
        assertEquals(removedDVD, firstDVD, "The removed DVD should be Sonic The Hedgehog");
        
        allDVDs = testDao.getAllDVDs();
        
        assertFalse(allDVDs.isEmpty(), "The retrieved list of DVDs should be empty");
    }
}