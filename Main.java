package lab_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Faculty> faculties;

    public static Scanner scanner = new Scanner(System.in);

    public Main() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addStudent() {
        System.out.print("Enter student id: ");
        int studentId = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.println();
        System.out.print("Enter student CGPA: ");
        double studentCGPA = scanner.nextDouble();
        System.out.println();

        Student student = new Student(studentId, studentName, studentCGPA);
        this.students.add(student);

        System.out.print("Student Added: ");
        System.out.println(student);
    }

    public void addCourse() {
    	scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();
        System.out.println();
        System.out.print("Enter course title: ");
        String courseTitle = scanner.nextLine();
        System.out.println();
        System.out.print("Enter course credit: ");
        double courseCredit = scanner.nextDouble();
        System.out.println();

        Course course = new Course(courseId, courseTitle, courseCredit);
        this.courses.add(course);

        System.out.print("Course Added: ");
        System.out.println(course);
    }

    public void addFaculty() {
        System.out.print("Enter faculty id: ");
        int facultyId = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();
        System.out.println();
        System.out.print("Enter faculty position: ");
        String facultyPosition = scanner.nextLine();
        System.out.println();

        Faculty faculty = new Faculty(facultyId, facultyName, facultyPosition);
        this.faculties.add(faculty);

        System.out.print("Faculty Added: ");
        System.out.println(faculty);
    }

    public void addStudentToACourse() {
    	scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter student id: ");
        int studentId = scanner.nextInt();

        boolean flag1 = true;
        for (Course c : this.courses) {
            if (c.getCourseId().equals(courseId)) {
                flag1 = false;
                boolean flag = true;
                for (Student s : this.students) {
                    if (s.getStudentId() == studentId) {
                        c.addStudent(s);
                        flag = false;
                        System.out.println("Student added to the course");
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Student Not Found!!");
                }
                break;
            }
        }
        if (flag1) {
            System.out.println("Course Not Found!!");
        }
    }

    public void addFacultyToACourse() {
    	scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter faculty id: ");
        int faculty = scanner.nextInt();

        boolean flag1 = true;
        for (Course c : this.courses) {
            if (c.getCourseId().equals(courseId)) {
                flag1 = false;
                boolean flag = true;
                for (Faculty f : this.faculties) {
                    if (f.getFacultyId() == faculty) {
                        c.addFaculty(f);
                        flag = false;
                        System.out.println("Faculty added to the course");
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Faculty Not Found!!");
                }
                break;
            }
        }
        if (flag1) {
            System.out.println("Course Not Found!!");
        }
    }

    public void deleteStudent() {
        System.out.print("Enter student id: ");
        int studentId = scanner.nextInt();
        boolean flag = true;
        for (Iterator<Student> it = this.students.iterator(); it.hasNext();) {
            Student student = it.next();
            if (student.getStudentId() == studentId) {
                flag = false;
                it.remove();
                System.out.println("Faculty removed");
                break;
            }
        }
        if (flag) {
            System.out.println("Student not Found!!");
        }
    }

    public void deleteCourse() {
    	scanner.nextLine();
        System.out.print("Enter course id: ");
        String courseId = scanner.nextLine();
        boolean flag = true;
        for (Iterator<Course> it = this.courses.iterator(); it.hasNext();) {
            Course course = it.next();
            if (course.getCourseId().equals(courseId)) {
                flag = false;
                it.remove();
                System.out.println("Faculty removed");
                break;
            }
        }
        if (flag) {
            System.out.println("Course not Found!!");
        }
    }

    public void deleteFaculty() {
        System.out.print("Enter faculty id: ");
        int facultyId = scanner.nextInt();
        boolean flag = true;
        for (Iterator<Faculty> it = this.faculties.iterator(); it.hasNext();) {
            Faculty faculty = it.next();
            if (faculty.getFacultyId() == facultyId) {
                flag = false;
                it.remove();
                System.out.println("Faculty removed");
                break;
            }
        }
        if (flag) {
            System.out.println("Faculty not Found!!");
        }
    }

    public static void displayInitialMenu() {
        System.out.println(".......................");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Print");
        System.out.println("5. Search");
        System.out.println(".......................");
    }

    public static void displayAddMenu() {
        System.out.println(".......................");
        System.out.println("1. Add a Student");
        System.out.println("2. Add a Course");
        System.out.println("3. Add a Faculty");
        System.out.println("4. Add student to a course");
        System.out.println("5. Add faculty to a course");
        System.out.println(".......................");
    }

    public static void displayDeleteMenu() {
        System.out.println(".......................");
        System.out.println("1. Delete a Student");
        System.out.println("2. Delete a Course");
        System.out.println("3. Delete a Faculty");
        System.out.println(".......................");
    }

    public static void displayUpdateMenu() {
        System.out.println(".......................");
        System.out.println("1. Update a Student");
        System.out.println("2. Update a Course");
        System.out.println("3. Update a Faculty");
        System.out.println(".......................");
    }

    public static void displayPrintMenu() {
        System.out.println(".......................");
        System.out.println("1. Print all students");
        System.out.println("2. Print all courses");
        System.out.println("3. Print all faculties");
        System.out.println("4. Print information of a student");
        System.out.println("5. Print information of a course");
        System.out.println("6. Print information of a faculty");
        System.out.println("7. Print student list and faculty information of a course");
        System.out.println("8. Print courses taken by a student");
        System.out.println(".......................");
    }

    public static void displaySearchMenu() {
        System.out.println(".......................");
        System.out.println("1. Search a Student");
        System.out.println("2. Search a Course");
        System.out.println("3. Search a Faculty");
        System.out.println("4. Search whether a student takes a course");
        System.out.println("5. Search whether a faculty teaches a course");
        System.out.println("6. Search courses taken by a student");
        System.out.println("7. Search courses taught by a faculty");
        System.out.println(".......................");
    }


    public static void main(String[] args) {
        Main m = new Main();

        while (true) {
            displayInitialMenu();
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    displayAddMenu();
                    int i = scanner.nextInt();
                    switch (i) {
                        case 1: {
                            m.addStudent();
                            break;
                        }
                        case 2: {
                            m.addCourse();
                            break;
                        }
                        case 3: {
                            m.addFaculty();
                            break;
                        }
                        case 4: {
                            m.addStudentToACourse();
                            break;
                        }
                        case 5: {
                            m.addFacultyToACourse();
                            break;
                        }
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                }
                case 2: {
                    displayDeleteMenu();
                    int i = scanner.nextInt();
                    switch (i) {
                        case 1: {
                            m.deleteStudent();
                            break;
                        }
                        case 2: {
                            m.deleteCourse();
                            break;
                        }
                        case 3: {
                            m.deleteFaculty();
                            break;
                        }
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                }
                case 3: {
                    displayUpdateMenu();
                    int i = scanner.nextInt();
                    switch (i) {
                        case 1: {
                            System.out.print("Enter student id: ");
                            int studentId = scanner.nextInt();
                            boolean flag = true;
                            for (Student s : m.students) {
                                if (s.getStudentId() == studentId) {
                                    System.out.println(s);
                                    System.out.print("Enter new student id: ");
                                    int sid = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Enter new student name: ");
                                    String studentName = scanner.nextLine();
                                    System.out.print("Enter new CGPA: ");
                                    double cgpa = scanner.nextInt();
                                    s.setStudentId(sid);
                                    s.setStudentName(studentName);
                                    s.setStudentCGPA(cgpa);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Student not found!!");
                            }
                            break;
                        }
                        case 2: {
                        	scanner.nextLine();
                            System.out.print("Enter course id: ");
                            String courseId = scanner.nextLine();
                            boolean flag = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(courseId)) {
                                    System.out.println(c);
                                    System.out.print("Enter new course id: ");
                                    String cid = scanner.nextLine();
                                    System.out.println();
                                    System.out.print("Enter new course title: ");
                                    String courseTitle = scanner.nextLine();
                                    System.out.println();
                                    System.out.print("Enter new course credit: ");
                                    double courseCredit = scanner.nextDouble();
                                    c.setCourseId(cid);
                                    c.setCourseTitle(courseTitle);
                                    c.setCredit(courseCredit);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Course not found!!");
                            }
                            break;
                        }
                        case 3: {
                            System.out.print("Enter faculty id: ");
                            int facultyId = scanner.nextInt();
                            boolean flag = true;
                            for (Faculty f : m.faculties) {
                                if (f.getFacultyId() == facultyId) {
                                    System.out.println(f);
                                    System.out.print("Enter new faculty id: ");
                                    int fid = scanner.nextInt();
                                    System.out.println();
                                    scanner.nextLine();
                                    System.out.print("Enter new faculty name: ");
                                    String facultyName = scanner.nextLine();
                                    System.out.println();
                                    System.out.print("Enter new faculty position: ");
                                    String facultyPosition = scanner.nextLine();
                                    f.setFacultyId(fid);
                                    f.setFacultyName(facultyName);
                                    f.setFacultyPosition(facultyPosition);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Faculty not found!!");
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;
                }
                case 4: {
                    displayPrintMenu();
                    int i = scanner.nextInt();
                    switch (i) {
                        case 1: {
                            for (Student s : m.students) {
                                System.out.println(s);
                            }
                            break;
                        }
                        case 2: {
                            for (Course c : m.courses) {
                                System.out.println(c);
                            }
                            break;
                        }
                        case 3: {
                            for (Faculty f : m.faculties) {
                                System.out.println(f);
                            }
                            break;
                        }
                        case 4: {
                            System.out.print("Enter student id: ");
                            int studentId = scanner.nextInt();
                            boolean flag = true;
                            for (Student s : m.students) {
                                if (s.getStudentId() == studentId) {
                                    System.out.println(s);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Student not found!!");
                            }
                            break;
                        }
                        case 5: {
                        	scanner.nextLine();
                            System.out.print("Enter course id: ");
                            String courseId = scanner.nextLine();
                            boolean flag = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(courseId)) {
                                    System.out.println(c);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Course not found!!");
                            }
                            break;
                        }
                        case 6: {
                            System.out.print("Enter faculty id: ");
                            int facultyId = scanner.nextInt();
                            boolean flag = true;
                            for (Faculty f : m.faculties) {
                                if (f.getFacultyId() == facultyId) {
                                    System.out.println(f);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Faculty not found!!");
                            }
                            break;
                        }
                        case 7: {
                        	scanner.nextLine();
                            System.out.print("Enter course id: ");
                            String courseId = scanner.nextLine();
                            boolean flag = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(courseId)) {
                                    System.out.println("Student List");
                                    System.out.println(c.getStudentList());
                                    System.out.println("Faculty");
                                    System.out.println(c.getFaculty());
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Course not found!!");
                            }
                            break;
                        }
                        case 8: {
                            System.out.print("Enter student id: ");
                            int studentId = scanner.nextInt();
                            boolean flag = true;
                            for (Student s : m.students) {
                                if (s.getStudentId() == studentId) {
                                    System.out.println(s.getCourses());
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Student not found!!");
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                }
                case 5: {
                    int i = scanner.nextInt();
                    switch (i) {
                        case 1: {
                            System.out.print("Enter student id: ");
                            int sid = scanner.nextInt();
                            boolean flag = true;
                            for (Student s : m.students) {
                                if (s.getStudentId() == sid) {
                                    System.out.println(s);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Student not found!!");
                            }
                            break;
                        }
                        case 2: {
                        	scanner.nextInt();
                            System.out.print("Enter course id: ");
                            String cid = scanner.nextLine();
                            boolean flag = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(cid)) {
                                    System.out.println(c);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Course not found!!");
                            }
                            break;
                        }
                        case 3: {
                            System.out.print("Enter faculty id: ");
                            int fid = scanner.nextInt();
                            boolean flag = true;
                            for (Faculty f : m.faculties) {
                                if (f.getFacultyId() == fid) {
                                    System.out.println(f);
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Faculty not found!!");
                            }
                            break;
                        }
                        case 4: {
                        	scanner.nextLine();
                            System.out.print("Enter course id: ");
                            String courseId = scanner.nextLine();
                            System.out.print("Enter student id: ");
                            int studentId = scanner.nextInt();

                            boolean flag1 = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(courseId)) {
                                    flag1 = false;
                                    boolean flag = true;
                                    for (Student s : m.students) {
                                        if (s.getStudentId() == studentId) {
                                            flag = false;
                                            System.out.println(true);
                                            break;
                                        }
                                    }
                                    if (flag) {
                                        System.out.println("Student did not took this course!!");
                                    }
                                    break;
                                }
                            }
                            if (flag1) {
                                System.out.println("Course Not Found!!");
                            }
                            break;
                        }
                        case 5: {
                        	scanner.nextLine();
                            System.out.print("Enter course id: ");
                            String courseId = scanner.nextLine();
                            System.out.print("Enter faculty id: ");
                            int facultyId = scanner.nextInt();

                            boolean flag1 = true;
                            for (Course c : m.courses) {
                                if (c.getCourseId().equals(courseId)) {
                                    flag1 = false;
                                    boolean flag = true;
                                    for (Faculty f : m.faculties) {
                                        if (f.getFacultyId() == facultyId) {
                                            flag = false;
                                            System.out.println(true);
                                            break;
                                        }
                                    }
                                    if (flag) {
                                        System.out.println("Faculty did not taught this course!!");
                                    }
                                    break;
                                }
                            }
                            if (flag1) {
                                System.out.println("Course Not Found!!");
                            }
                            break;
                        }
                        case 6: {
                            System.out.print("Enter student id: ");
                            int sid = scanner.nextInt();
                            boolean flag = true;
                            for (Student s : m.students) {
                                if (s.getStudentId() == sid) {
                                    System.out.println(s.getCourses());
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Student not found!!");
                            }
                            break;
                        }
                        case 7: {
                            System.out.print("Enter faculty id: ");
                            int fid = scanner.nextInt();
                            boolean flag = true;
                            for (Faculty f : m.faculties) {
                                if (f.getFacultyId() == fid) {
                                    System.out.println(f.getCourses());
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                System.out.println("Faculty not found!!");
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
        }
    }
}