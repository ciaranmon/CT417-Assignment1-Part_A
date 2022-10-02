package lecture_manager;


import org.joda.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void StudentAccessors() {
        Student ciaran = new Student("Ciaran", 22, "2000-09-11", 19468766L, "ECE", new int[]{1, 2, 3, 4});
        
        Assertions.assertEquals("Ciaran", ciaran.getName());
        Assertions.assertEquals(22, ciaran.getAge());
        LocalDate expectedDate = new LocalDate("2000-09-11");
        Assertions.assertTrue(ciaran.getDob().equals(expectedDate));
        Assertions.assertEquals(19468766, ciaran.getId());
        Assertions.assertEquals("ECE", ciaran.getCourse());
        //Assertions.assertEquals(new int[]{1,2,3,4}, ciaran.getModules());
        Assertions.assertEquals("Ciaran22", ciaran.getUsername());
    }

}
