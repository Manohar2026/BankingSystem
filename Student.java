package BankingSystem;

import java.util.*;

public class Student extends Person {
    private List<Course> enrolledCourses;

    Student(int studentId, String studentName) {
        super(studentId, studentName);
        enrolledCourses = new ArrayList<>();
    }

    public void print() {
        if(enrolledCourses.isEmpty()) {
            System.out.println("\n     Student details     ");
            System.out.println("-------------------------");
            System.out.println("Student Id : " + super.getId() + "\nName : " + super.getName() + "\n\n" + "No courses enrolled yet" + "\n");
        }
        else {
            System.out.println("\n     Student details     ");
            System.out.println("-------------------------");
            System.out.println("Student Id : " + super.getId() + "\nName : " + super.getName() + "\n\n" + enrolledCourses + "\n");
        }
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void setStudentId(int studentId) {
        super.setId(studentId);
    }

    public int getStudentId() {
        return super.getId();
    }

    public void setStudentName(String studentName) {
        super.setName(studentName);
    }

    public String getStudentName() {
        return super.getName();
    }

}
