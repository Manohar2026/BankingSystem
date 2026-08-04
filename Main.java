package BankingSystem;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        
        Student student = new Student(1, "Manohar");

        Course course = new Course(1, "Java programming");
        Course course2 = new Course(2, "OOPS");

        university.addStudent(student);
        university.addStudentCourse(1, course);
        university.addStudentCourse(1, course2);

        university.printStudentDetails(1);
    }
}
