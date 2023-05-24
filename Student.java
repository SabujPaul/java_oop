package lab_assignment;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    private ArrayList<Course> courses;

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student {" +
                " ID: " + studentId +
                ", Name: '" + studentName + '\'' +
                ", CGPA: " + studentCGPA +
                "  }";
    }
}
