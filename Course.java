package lab_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
    private String courseId;
    private String courseTitle;
    private  double credit;
    private ArrayList<Student> studentList;
    private int numberOfStudents;
    private Faculty faculty;

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.studentList = new ArrayList<>();
        this.numberOfStudents = 0;
        this.faculty = null;
    }

    @Override
    public String toString() {
        return "Course {" +
                " Course Id: '" + courseId + '\'' +
                ", Course Title: '" + courseTitle + '\'' +
                ", Credit: " + credit +
                ", Number of Students: " + numberOfStudents +
                ", Faculty: " + faculty +
                " }";
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void addStudent(Student student) {
        if (this.numberOfStudents == 40) {
            System.out.println("Course is full!!!");
            return;
        }
        this.studentList.add(student);
        student.addCourse(this);
    }

    public void dropStudent(int studentId) {
        for (Iterator<Student> it = this.studentList.iterator(); it.hasNext();) {
            Student student = it.next();
            if (student.getStudentId() == studentId) {
                it.remove();
            }
        }
    }

    public void addFaculty (Faculty faculty) {
        this.faculty  = faculty;
        faculty.addCourse(this);
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }
}
