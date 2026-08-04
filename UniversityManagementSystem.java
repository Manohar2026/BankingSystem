package BankingSystem;

import java.util.*;

public class UniversityManagementSystem {

    public void start() {
        University university = new University();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Create student\n2. Create course\n3. Add course to student\n4. Print student details\n5. exit");
            System.out.print("\nEnter the choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter student id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\nEnter student name : ");
                    String name = sc.nextLine();

                    Student student = new Student(id, name);

                    university.addStudent(id, student);
                    System.out.println("\nStudent added successfully");
                    break;

                case 2:
                    System.out.print("\nEnter course id : ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\nEnter course name : ");
                    name = sc.nextLine();

                    Course course = new Course(id, name);
                    university.registerCourse(id, course);

                    System.out.println("\nCourse registered successfully");
                    break;

                case 3:
                    System.out.print("\nEnter student id : ");
                    int studentId = sc.nextInt();

                    System.out.print("\nEnter course id : ");
                    int courseId = sc.nextInt();

                    int result = university.addStudentCourse(studentId, courseId);

                    if(result == 1) {
                        System.out.println("\ncourse added to student successfully");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter student id : ");
                    id = sc.nextInt();
                    university.printStudentDetails(id);
                    break;

                case 5:
                    System.out.println("\nThanks for using our service\n");
                    sc.close();
                    return;
            
                default:
                    System.out.println("\nEnter input in the range (1-5)\n");
                    break;
            }
        }
    }
}
