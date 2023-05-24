package lab_assignment;

import java.util.ArrayList;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    private ArrayList<Course> courses;

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    @Override
    public String toString() {
        return "Faculty {" +
                " facultyId: " + facultyId +
                ", Name: '" + facultyName + '\'' +
                ", Position: '" + facultyPosition + '\'' +
                " }";
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }
}
