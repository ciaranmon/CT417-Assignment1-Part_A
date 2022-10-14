package lecture_manager;

import java.util.ArrayList;

public class CollegeModule {
    // Fields
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;
    private Lecturer lecturer;

    public CollegeModule(String _name,
                         String _id) {
        this.name = _name;
        this.id = _id;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // -------------- Accessor Methods ------------------
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }
    public Lecturer getLecturer() {
        return lecturer;
    }

    // -------------- Mutator Methods -------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
        this.lecturer.addModule(this);
    }

    // Editing ArrayLists
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
    public boolean removeStudent(Student oldStudent) {
        return students.remove(oldStudent);
    }
    public void addCourse(CourseProgramme newCourse) {
        courses.add(newCourse);
    }
    public boolean removeCourse(CourseProgramme oldCourse) {
        return courses.remove(oldCourse);
    }

    @Override
    public String toString() {
        String str = "Module: " + this.name;
        str += "\n\t";
        str += "Module ID: " + this.id;
        str += "\n";

        return str;
    }
}