package BankingSystem;

import java.util.*;

public class University {
    private static String universityName = "Lovely Professional University";
    List<Student> students;
    List<Course> courses;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int addStudentCourse(int studentId, int courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);
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

    public Student findStudent(int studentId) {

        for(Student student : students) {

            if(student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public Course findCourse(int courseId) {

        for(Course course : courses) {

            if(course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void printStudentDetails(int id) {

        for(Student student : students) {

            if(student.getStudentId() == id) {
                student.print();
                break;
            }
        }
        System.out.println("\nNo student with id : " + id);
    }
    
}
