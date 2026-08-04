package BankingSystem;

import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private List<Course> enrolledCourses;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        enrolledCourses = new ArrayList<>();
    }

    public void print() {
        System.out.println("\n     Student details     ");
        System.out.println("\n-------------------------");
        System.out.println("\nStudent Id : " + studentId + "\nName : " + studentName + "\nEnrolled Courses : " + enrolledCourses);
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

}
