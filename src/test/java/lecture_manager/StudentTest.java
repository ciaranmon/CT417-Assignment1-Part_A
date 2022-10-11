package lecture_manager;


import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class StudentTest {
    // Instantiating Course object without Modules/Students
    CourseProgramme ece = new CourseProgramme("ECE", "2022-09-05", "2022-12-16");
    // Creating student object to be tested
    Student ciaran = new Student("Ciaran", "2000-09-11", 19468776L, ece);

    DateTime expectedDate = DateTime.parse("2000-09-11");   // Testing against an identical LocalDate object
    @Test
    public void studentAccessors() {
        Assertions.assertEquals("Ciaran", ciaran.getName());
        Assertions.assertEquals(22, ciaran.getAge());
        Assertions.assertEquals(expectedDate, ciaran.getDob());
        Assertions.assertEquals(19468776, ciaran.getId());
        Assertions.assertEquals(ece, ciaran.getCourse());
        Assertions.assertEquals("Ciaran22", ciaran.getUsername());
    }

    // Creating module list and course to assign to student
    ArrayList<CollegeModule> ciaransModules = new ArrayList<>();
    CourseProgramme eee = new CourseProgramme("EEE", "2019-09-01", "2023-05-04");

    @Test
    public void studentMutators() {
        ciaran.setName("Ciarán");
        Assertions.assertEquals("Ciarán", ciaran.getName());

        ciaran.setDob("1999-09-11");
        DateTime expectedDob = DateTime.parse("1999-09-11");
        Assertions.assertEquals(expectedDob, ciaran.getDob());
        Assertions.assertEquals(23, ciaran.getAge());

        ciaran.setId(123456789L);
        Assertions.assertEquals(123456789L, ciaran.getId());

        ciaran.setCourse(eee);
        Assertions.assertEquals(eee, ciaran.getCourse());

        ciaran.setModules(ciaransModules);
        Assertions.assertEquals(ciaransModules, ciaran.getModules());
    }

    @Test
    public void studentToString() {
        System.out.println(ciaran);
    }
}
