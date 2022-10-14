package lecture_manager;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CourseProgrammeTest {
    CourseProgramme ece = new CourseProgramme("Electronic & Computer Engineering",
            "2019-09-01",
            "2023-05-04");
    DateTime expectedStartDate = DateTime.parse("2019-09-01");
    DateTime expectedEndDate = DateTime.parse("2023-05-04");

    @Test
    public void courseProgrammeAccessors() {
        Assertions.assertEquals("Electronic & Computer Engineering", ece.getName());
        Assertions.assertEquals(expectedStartDate, ece.getStartDate());
        Assertions.assertEquals(expectedEndDate, ece.getEndDate());
    }

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<CollegeModule> modules = new ArrayList<>();
    @Test
    public void courseProgrammeMutators() {
        // Test Mutators
        ece.setModuleList(modules);
        Assertions.assertEquals(modules, ece.getModuleList());

        ece.setStudentsEnrolled(students);
        Assertions.assertEquals(students, ece.getStudentsEnrolled());

        ece.setName("ECE");
        Assertions.assertEquals("ECE", ece.getName());

        ece.setStartDate("2023-09-01");
        Assertions.assertEquals(DateTime.parse("2023-09-01"), ece.getStartDate());

        ece.setEndDate("2027-05-01");
        Assertions.assertEquals(DateTime.parse("2027-05-01"), ece.getEndDate());
    }

    CollegeModule softwareEng = new CollegeModule("Software Engineering", "CT417");
    Student ciaran = new Student("Ciarán", "2000-09-11", 123456789L, ece);
    @Test
    public void courseProgrammeListEditing() {
        // Edit lists
        ece.addModule(softwareEng);
        Assertions.assertEquals(softwareEng, ece.getModuleList().get(0));

        Assertions.assertTrue(ece.removeStudent(ciaran));
        Assertions.assertTrue(ece.getStudentsEnrolled().isEmpty());
        Assertions.assertTrue(ece.getModuleList().get(0).getStudents().isEmpty());

        ece.addStudent(ciaran);
        Assertions.assertEquals(ciaran, ece.getStudentsEnrolled().get(0));
        Assertions.assertEquals(ciaran, ece.getModuleList().get(0).getStudents().get(0));

        Assertions.assertTrue(ece.removeModule(softwareEng));
        Assertions.assertTrue(ece.getModuleList().isEmpty());
    }

    @Test
    public void courseProgrammeToString() {
        System.out.println(ece);
    }
}
