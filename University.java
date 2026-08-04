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

    public void addStudentCourse(int id, int courseId) {

        Course course = null;

        for(Student student : students) {

            if(student.getStudentId() == id) {
                course = findCourse(courseId);
                student.addCourse(course);
                break;
            }
        }
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
            }
        }
    }
    
}
