/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    private static final Scanner scanner = new Scanner(System.in);

    private static final Department department = new Department("Information Systems");

    private static final CourseCatalog courseCatalog = new CourseCatalog(department);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the University Portal");
        System.out.println("Who is login?");
        System.out.println("Choose \n1:Administrator\n2:Student");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 :
                adminApplication();
                break;
            case 2:
                studentApplication();
                break;
            default:
                System.out.println("Invalid input");
                break;
            }
        }

    private static void studentApplication() {
    }

    private static void adminApplication() {

        System.out.println("Welcome Back!!!!");
        System.out.println("Choose \n1:Manage Course Catalog\n2:Manage Course Schedule\n2:Manage Student Registration");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 :
                manageCourseCatalog();
                break;
            case 2:
                manageCourseSchedule();
                break;
            case 3:
                manageStudentRegistration();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    private static void manageStudentRegistration() {
    }

    private static void manageCourseSchedule() {
    }

    private static void manageCourseCatalog() {
        department.addCoreCourse(courseCatalog.newCourse("app eng", "info 5100", 4));
        courseCatalog.newCourse("app eng", "info 5100", 4);
        department.addCoreCourse(courseCatalog.getCourseByNumber("infor 5100"));
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);
        courseCatalog.newCourse("app eng", "info 5100", 4);

        System.out.println("Choose \n1:Add Core Course\n2:Add Elective Course \n3:View Course List");
        int choice = scanner.nextInt();
        System.out.print("Enter Course Name: \t");
        String name = scanner.nextLine();
        System.out.print("Enter Course Number: \t");
        String num = scanner.nextLine();
        System.out.print("Enter Course Credits: \t");
        int credits = scanner.nextInt();

        switch(choice){
            case 1 :
                courseCatalog.newCourse(name,num,credits);
                department.addCoreCourse(courseCatalog.getCourseByNumber(num));
                break;
            case 2:
                courseCatalog.newCourse(name,num,credits);
                department.addElectiveCourse(courseCatalog.getCourseByNumber(num));
                break;
            case 3:
                for( Course c: department.getCourseCatalog().getCourseList()){

                    System.out.println(c);
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

//
//        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
//
//        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
//        if (courseoffer==null)return;
//        courseoffer.generatSeats(10);
//        PersonDirectory pd = department.getPersonDirectory();
//        Person person = pd.newPerson("0112303");
//        StudentDirectory sd = department.getStudentDirectory();
//        StudentProfile student = sd.newStudentProfile(person);
//        CourseLoad courseload = student.newCourseLoad("Fall2020");
////
//        courseload.newSeatAssignment(courseoffer); //register student in class
//
//        int total = department.calculateRevenuesBySemester("Fall2020");
//        System.out.print("Total: " + total);
//    }

}
