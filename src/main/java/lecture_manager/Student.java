package lecture_manager;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.util.ArrayList;
//import java.util.Objects;

public class Student {
    // Fields
    private String name;
    private int age;
    private DateTime dob;
    private long id;
    private CourseProgramme course;                // String until CourseProgramme class is done
    private ArrayList<CollegeModule> modules;      // Array of ints until Module class is done

    public Student(String _name,
                   String _dobString,
                   long _id,
                   CourseProgramme _course) {
        this.name = _name;
        this.dob = DateTime.parse(_dobString);
        this.id = _id;
        this.setCourse(_course);
        age = new Period(dob, DateTime.now(), PeriodType.yearMonthDay()).getYears();
    }

    // -------------------- Accessor Methods -----------------------
    public String getName() {
        return name;
    }
    public int getAge() {
        age = new Period(dob, DateTime.now(), PeriodType.yearMonthDay()).getYears();
        return age;
    }
    public DateTime getDob() {
        return dob;
    }
    public long getId() {
        return id;
    }
    public CourseProgramme getCourse() {
        return course;
    }
    public ArrayList<CollegeModule> getModules() {
        return modules;
    }
    public String getUsername() {
        return name + age;
    }

    // ------------------- Mutator Methods ----------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setDob(String newDobString) {
        this.dob = DateTime.parse(newDobString);
    }
    public void setCourse(CourseProgramme course) {
        this.course = course;
        this.setModules(course.getModuleList());
        this.course.addStudent(this);
    }
    public void setModules(ArrayList<CollegeModule> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        String str = "Student: ";
        str += this.name;
        str += "\n\t";
        str += "Date of Birth: " +
                this.dob.getDayOfMonth() + "/" +
                this.dob.getMonthOfYear() + "/" +
                this.dob.getYear();
        str += "\n\t";
        str += "ID: " + this.id;
        str += "\n\t";
        str += "Username: " + this.getUsername();
        str += "\n";

        return str;
    }
}
