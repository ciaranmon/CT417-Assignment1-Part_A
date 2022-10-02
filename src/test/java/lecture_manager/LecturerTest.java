package lecture_manager;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest {
    @Test
    public void LecturerAccessors() {
        Lecturer michael = new Lecturer("michael", 22, "1990-06-29", 19468766L,  new int[]{1, 2, 3, 4});

        Assertions.assertEquals("michael", michael.getName());
        Assertions.assertEquals(22, michael.getAge());
        LocalDate expectedDate = new LocalDate("1990-06-29");
        Assertions.assertTrue(michael.getDob().equals(expectedDate));
        Assertions.assertEquals(19468766, michael.getId());
        Assertions.assertTrue(Arrays.equals(michael.getModulesTeaching(), new int[]{1, 2, 3, 4}));
        Assertions.assertEquals("michael22", michael.getUsername());
    }
}

