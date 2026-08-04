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
