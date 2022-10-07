package lecture_manager;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {
    // Fields
    private String name;
    private ArrayList<CollegeModule> moduleList;
    private ArrayList<Student> studentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String _name,
                           String _startDateString,
                           String _endDateString) {
        this.name = _name;
        this.startDate = DateTime.parse(_startDateString);
        this.endDate = DateTime.parse(_endDateString);
        moduleList = new ArrayList<>();
        studentsEnrolled = new ArrayList<>();
    }

    // ------------------ Accessor Methods -----------------------
    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
    public DateTime getStartDate() {
        return startDate;
    }
    public DateTime getEndDate() {
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
    public void setStartDate(String _startDateString) {
        this.startDate = DateTime.parse(_startDateString);
    }
    public void setEndDate(String _endDateString) {
        this.endDate = DateTime.parse(_endDateString);
    }
    public void setName(String name) {
        this.name = name;
    }

    // Editing Lists
    public void addModule(CollegeModule newModule) {
        moduleList.add(newModule);
        newModule.addCourse(this);
    }
    public boolean removeModule(CollegeModule oldModule) {
        return moduleList.remove(oldModule);
    }
    public void addStudent(Student newStudent) {
        studentsEnrolled.add(newStudent);
        for(CollegeModule cm : moduleList) {
            cm.addStudent(newStudent);
        }
    }
    public boolean removeStudent(Student oldStudent) {
        for(CollegeModule cm : moduleList) {
            cm.removeStudent(oldStudent);
        }
        return studentsEnrolled.remove(oldStudent);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof CourseProgramme) {
//            CourseProgramme cp = (CourseProgramme) obj;
//
//            if(this == cp) {
//                return true;
//            }
//            return this.name.equals(cp.name) && this.startDate.equals(cp.startDate) && this.endDate.equals(cp.endDate);
//        } else {
//            return false;
//        }
//    }
}