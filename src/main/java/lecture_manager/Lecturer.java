package lecture_manager;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import java.util.ArrayList;

public class Lecturer {
    // Fields
    String name;
    int age;
    DateTime dob;
    long id;
    ArrayList<CollegeModule> modulesTeaching;

    public Lecturer(String _name, String _dobString, long _id) {
        this.name = _name;
        this.dob = DateTime.parse(_dobString);
        this.id = _id;
        modulesTeaching = new ArrayList<>();
        //this.modulesTeaching = _modules;
        age = new Period(dob, DateTime.now(), PeriodType.yearMonthDay()).getYears();
    }

    // --------------- Accessor Methods ----------------
    public String getName() {
        return name;
    }
    public int getAge() {
        this.age = new Period(dob, DateTime.now(), PeriodType.yearMonthDay()).getYears();
        return age;
    }
    public DateTime getDob() {
        return dob;
    }
    public long getId() {
        return id;
    }
    public ArrayList<CollegeModule> getModulesTeaching() {
        return modulesTeaching;
    }
    public String getUsername() {
        return (name + age);
    }

    // -------------- Mutator Methods -----------------
    public void setName(String _name) {
        this.name = _name;
    }
    public void setDob(String _dobString) {
        this.dob = DateTime.parse(_dobString);
    }
    public void setId(long _id) {
        this.id = _id;
    }
    public void setModulesTeaching(ArrayList<CollegeModule> _modulesTeaching) {
        this.modulesTeaching = _modulesTeaching;
    }

    // Editing module list
    public void addModule(CollegeModule newModule) {
        modulesTeaching.add(newModule);
    }
    public boolean removeModule(CollegeModule oldModule) {
        return modulesTeaching.remove(oldModule);
    }

    @Override
    public String toString() {
        String str = "Lecturer: " + this.name;
        str += "\n\t";
        str += "Name: " + this.name;
        str += "\n\t";
        str += "Date of Birth: " +
                this.dob.getDayOfMonth() + "/" +
                this.dob.getMonthOfYear() + "/" +
                this.dob.getYear();
        str += "\n\t";
        str += "ID: " + this.id;
        str += "\n";

        return str;
    }
}