package BankingSystem;

import java.util.*;

public class University {
    private static String universityName = "Lovely Professional University";
    HashMap<Integer, Student> students;
    HashMap<Integer, Course> courses;

    public University() {
        students = new HashMap<>();
        courses = new HashMap<>();
    }

    public void addStudent(Integer id, Student student) {
        students.put(id, student);
    }

    public int addStudentCourse(int studentId, int courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if(student == null) {
            System.out.println("\nStudent not found");
            return 0;
        }
        else if(course == null) {
            System.out.println("\nCourse not found");
            return 0;
        }
        else {
            student.addCourse(course);
            return 1;
        }
        
    }

    public void registerCourse(Integer id, Course course) {
        courses.put(id, course);
    }

    public void printStudentDetails(int id) {

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {

            System.out.println("Id: " + entry.getKey());

            Student student = entry.getValue();

            student.print();

            System.out.println();
        }
    }
}
