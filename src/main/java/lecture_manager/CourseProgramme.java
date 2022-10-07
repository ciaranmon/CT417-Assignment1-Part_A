package lecture_manager;

import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
    // Fields
    private String name;
    private ArrayList<CollegeModule> moduleList;
    private ArrayList<Student> studentsEnrolled;
    private LocalDate startDate;
    private LocalDate endDate;

    public CourseProgramme(String _name,
                           String _startDateString,
                           String _endDateString) {
        this.name = _name;
        this.startDate = new LocalDate(_startDateString);
        this.endDate = new LocalDate(_endDateString);
        moduleList = new ArrayList<>();
        studentsEnrolled = new ArrayList<>();
    }
/*
    public CourseProgramme(String _name,
                           String _startDateString,
                           String _endDateString,
                           ArrayList<Module> _moduleList) {
        this.name = _name;
        this.startDate = new LocalDate(_startDateString);
        this.endDate = new LocalDate(_endDateString);
        this.moduleList = _moduleList;
    }*/

    // ------------------ Accessor Methods -----------------------
    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public String getName() {
        return name;
    }
    public ArrayList<CollegeModule> getModuleList() {
        return moduleList;
    }

    // ----------------- Mutator Methods -------------------------
    public void setModuleList(ArrayList<CollegeModule> moduleList) {
        this.moduleList = moduleList;
    }
    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Editing Lists
    public void addModule(CollegeModule newModule) {
        moduleList.add(newModule);
        newModule.addCourse(this);
    }
    public void addStudent(Student newStudent) {
        studentsEnrolled.add(newStudent);
        for(CollegeModule cm : moduleList){
            cm.addStudent(newStudent);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CourseProgramme) {
            CourseProgramme cp = (CourseProgramme) obj;

            if(this == cp) {
                return true;
            }
            return this.name.equals(cp.name) && this.startDate.equals(cp.startDate) && this.endDate.equals(cp.endDate);
        } else {
            return false;
        }
    }
}