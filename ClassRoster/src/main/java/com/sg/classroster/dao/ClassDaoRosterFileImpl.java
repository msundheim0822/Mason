/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import static com.sg.classroster.dao.ClassDaoRosterFileImpl.DELIMITER;
import com.sg.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassDaoRosterFileImpl implements ClassRosterDao{
    
    private final String ROSTER_FILE;
    public static final String DELIMITER = "::";
    
    public ClassDaoRosterFileImpl(){
        ROSTER_FILE = "roster.txt";
    }

    public ClassDaoRosterFileImpl(String rosterTextFile){
        ROSTER_FILE = rosterTextFile;
    }
    
    private Map<String, Student> students = new HashMap<>();
    
    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        try {
            writeRoster(students);
        } catch (IOException ex) {
            Logger.getLogger(ClassDaoRosterFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newStudent;
}   

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        loadRoster();
        return new ArrayList(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        return students.get(studentId);
}

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        try {
            writeRoster(students);
        } catch (IOException ex) {
            Logger.getLogger(ClassDaoRosterFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return removedStudent;
    }
    
    private Student unmarshallStudent(String studentAsText){
    
        String[] studentTokens = studentAsText.split(DELIMITER);
        String studentId = studentTokens[0];

        Student studentFromFile = new Student(studentId);

        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);
        return studentFromFile;
    }
    
    private void loadRoster() throws ClassRosterPersistenceException {
        Scanner scanner;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterPersistenceException( "-_- Could not load roster data into memory.", e);
        }

        String currentLine;

        Student currentStudent;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine);
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        scanner.close();
    }
    
    private void writeRoster(Map <String, Student> students) throws ClassRosterPersistenceException, IOException {
        PrintWriter scanner;
        try {
            scanner = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (FileNotFoundException e) {
            throw new ClassRosterPersistenceException( "-_- Could not load roster data into memory.", e);
        }
        for(Map.Entry<String, Student> thisStudent: students.entrySet()){
            scanner.println(marshallStudent(thisStudent.getValue()));
        }
        scanner.close();
    }
    
    private String marshallStudent(Student aStudent){
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();

        return studentAsText;
    }
}