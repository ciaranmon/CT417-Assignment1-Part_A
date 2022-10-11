package lecture_manager;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class LecturerTest {
    Lecturer michael = new Lecturer("michael", "1990-06-29", 9078563412L);
    DateTime expectedDob1 = DateTime.parse("1990-06-29");
    @Test
    public void lecturerAccessors() {
        Assertions.assertEquals("michael", michael.getName());
        Assertions.assertEquals(32, michael.getAge());
        Assertions.assertEquals(expectedDob1, michael.getDob());
        Assertions.assertEquals(9078563412L, michael.getId());
        //Assertions.assertTrue(Arrays.equals(michael.getModulesTeaching(), new int[]{1, 2, 3, 4}));
        Assertions.assertEquals("michael32", michael.getUsername());
    }

    // DateTime and ArrayList objects to add to lecturer
    DateTime expectedDob2 = DateTime.parse("2000-01-01");
    ArrayList<CollegeModule> michaelsModules = new ArrayList<>();

    @Test
    public void lecturerMutators() {
        michael.setName("Michael Schukat");
        Assertions.assertEquals("Michael Schukat", michael.getName());

        michael.setDob("2000-01-01");
        Assertions.assertEquals(expectedDob2, michael.getDob());
        Assertions.assertEquals(22, michael.getAge());

        michael.setId(2143658709L);
        Assertions.assertEquals(2143658709L, michael.getId());

        michael.setModulesTeaching(michaelsModules);
        Assertions.assertEquals(michaelsModules, michael.getModulesTeaching());
    }

    // CollegeModule object to add to lecturer's list
    CollegeModule newModule = new CollegeModule("Real Time Systems", "CT420");
    @Test
    public void lecturerListEditing() {
        michael.addModule(newModule);
        michaelsModules.add(newModule);
        Assertions.assertEquals(michaelsModules, michael.getModulesTeaching());
        Assertions.assertEquals(newModule, michael.getModulesTeaching().get(0));

        Assertions.assertTrue(michael.removeModule(newModule));
        Assertions.assertTrue(michael.getModulesTeaching().isEmpty());
    }

    @Test
    public void lecturerToString() {
        System.out.println(michael);
    }
}