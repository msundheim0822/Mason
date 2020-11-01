package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.FileNotFoundException;
import java.util.List;
import org.graalvm.compiler.word.Word;

public interface ClassRosterDao {

    Student addStudent(String studentId, Student student)
     throws ClassRosterPersistenceException;
    
    List<Student> getAllStudents()throws ClassRosterPersistenceException; 
    
   Student getStudent(String studentId)
     throws ClassRosterPersistenceException ;

    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}