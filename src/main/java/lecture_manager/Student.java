package lecture_manager;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.time.Period;

public class Student {
    // Fields
    private String name;
    private int age;
    private LocalDate dob;
    private long id;
    private String course;      // String until CourseProgramme class is done
    private int[] modules;      // Array of ints until Module class is done

    public Student(String _name, int _age, String _dobString, long _id, String _course, int[] _modules) {
        this.name = _name;
        this.age = _age;
        this.dob = new LocalDate(_dobString);
        this.id = _id;
        this.course = _course;
        this.modules = _modules;
    }

    // -------------------- Accessor Methods -----------------------
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDob() {
        return dob;
    }
    public long getId() {
        return id;
    }
    public String getCourse() {
        return course;
    }
    public int[] getModules() {
        return modules;
    }
    public String getUsername() {
        return name + age;
    }

    // ------------------- Mutator Methods ----------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setModules(int[] modules) {
        this.modules = modules;
    }
}
