package lecture_manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CollegeModuleTest {
    // Creating a CollegeModule to test
    CollegeModule softwareEng = new CollegeModule("Software Engineering 3", "CT417");

    @Test
    public void collegeModuleAccessors() {
        Assertions.assertEquals("Software Engineering 3", softwareEng.getName());
        Assertions.assertEquals("CT417", softwareEng.getId());
    }

    // Creating a lecturer, courses and students to add to the module
    Lecturer michaelSchukat = new Lecturer("Michael Schukat", "1997-06-10", 123456789L);
    ArrayList<CourseProgramme> michaelsCourses = new ArrayList<>();
    ArrayList<Student> michaelsStudents = new ArrayList<>();

    @Test
    public void collegeModuleMutators() {
        softwareEng.setLecturer(michaelSchukat);
        Assertions.assertEquals(michaelSchukat, softwareEng.getLecturer());

        softwareEng.setName("Software Engineering III");
        Assertions.assertEquals("Software Engineering III", softwareEng.getName());

        softwareEng.setId("CS101");
        Assertions.assertEquals("CS101", softwareEng.getId());

        softwareEng.setCourses(michaelsCourses);
        Assertions.assertEquals(michaelsCourses, softwareEng.getCourses());

        softwareEng.setStudents(michaelsStudents);
        Assertions.assertEquals(michaelsStudents, softwareEng.getStudents());
    }

    CourseProgramme newCp = new CourseProgramme("Computer Science", "2023-09-01", "2027-05-01");
    Student newStudent = new Student("Alan Turing", "1912-06-23", 123456789L, newCp);
    @Test
    public void collegeModuleListEditing() {
        softwareEng.addCourse(newCp);
        Assertions.assertEquals(newCp, softwareEng.getCourses().get(0));

        softwareEng.addStudent(newStudent);
        Assertions.assertEquals(newStudent, softwareEng.getStudents().get(0));

        Assertions.assertTrue(softwareEng.removeCourse(newCp));
        Assertions.assertTrue(softwareEng.getCourses().isEmpty());

        Assertions.assertTrue(softwareEng.removeStudent(newStudent));
        Assertions.assertTrue(softwareEng.getStudents().isEmpty());
    }

    @Test
    public void collegeModuleToString() {
        System.out.println(softwareEng);
    }
}