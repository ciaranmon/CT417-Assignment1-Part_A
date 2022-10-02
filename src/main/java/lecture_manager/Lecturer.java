package lecture_manager;

import org.joda.time.LocalDate;

public class Lecturer {
    // Fields
    String name;
    int age;
    LocalDate dob;
    long id;
    int[] modulesTeaching;

    public Lecturer(String _name, int _age, String _dobString, long _id, int[] _modules) {
        this.name = _name;
        this.age = _age;
        this.dob = new LocalDate(_dobString);
        this.id = _id;
        this.modulesTeaching = _modules;
    }

    // --------------- Accessor Methods ----------------
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
    public int[] getModulesTeaching() {
        return modulesTeaching;
    }
    public String getUsername() {
        return (name + age);
    }

    // -------------- Mutator Methods -----------------
    public void setName(String _name) {
        this.name = _name;
    }
    public void setAge(int _age) {
        this.age = _age;
    }
    public void setDob(LocalDate _dob) {
        this.dob = _dob;
    }
    public void setId(long _id) {
        this.id = _id;
    }
    public void setModulesTeaching(int[] _modulesTeaching) {
        this.modulesTeaching = _modulesTeaching;
    }
}
