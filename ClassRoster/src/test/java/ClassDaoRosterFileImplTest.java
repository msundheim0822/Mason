import com.sg.classroster.dao.ClassDaoRosterFileImpl;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dto.Student;
import java.io.FileWriter;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassDaoRosterFileImplTest {
    
    ClassRosterDao testDao;
    
    public ClassDaoRosterFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception{
        String testFile = "testroster.txt";
        // Use the FileWriter to quickly blank the file
        new FileWriter(testFile);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddGetStudent() throws Exception {
    // Create our method test inputs
        testDao = new ClassDaoRosterFileImpl();
        String studentId = "0001";
        Student student = new Student(studentId);
        student.setFirstName("Ada");
        student.setLastName("Lovelace");
        student.setCohort("Java-May-1845");

    //  Add the student to the DAO
        testDao.addStudent(studentId, student);
    // Get the student from the DAO
        Student retrievedStudent = testDao.getStudent(studentId);

    // Check the data is equal
        assertEquals(student.getStudentId(),retrievedStudent.getStudentId(),"Checking student id.");
        assertEquals(student.getFirstName(),retrievedStudent.getFirstName(),"Checking student first name.");
        assertEquals(student.getLastName(), retrievedStudent.getLastName(),"Checking student last name.");
        assertEquals(student.getCohort(),retrievedStudent.getCohort(),"Checking student cohort.");
    }
    
    @Test
public void testAddGetAllStudents() throws Exception {
    // Create our first student
    testDao = new ClassDaoRosterFileImpl();
    
    Student firstStudent = new Student("0001");
    firstStudent.setFirstName("Ada");
    firstStudent.setLastName("Lovelace");
    firstStudent.setCohort("Java-May-1845");

    // Create our second student
    Student secondStudent = new Student("0002");
    secondStudent.setFirstName("Charles");
    secondStudent.setLastName("Babbage");
    secondStudent.setCohort(".NET-May-1845");

    // Add both our students to the DAO
    testDao.addStudent(firstStudent.getStudentId(), firstStudent);
    testDao.addStudent(secondStudent.getStudentId(), secondStudent);

    // Retrieve the list of all students within the DAO
    List<Student> allStudents = testDao.getAllStudents();

    // First check the general contents of the list
    assertNotNull(allStudents, "The list of students must not null");
    assertEquals(2, allStudents.size(),"List of students should have 2 students.");

    // Then the specifics
    assertTrue(testDao.getAllStudents().contains(firstStudent),
                "The list of students should include Ada.");
    assertTrue(testDao.getAllStudents().contains(secondStudent),
            "The list of students should include Charles.");

}
}
