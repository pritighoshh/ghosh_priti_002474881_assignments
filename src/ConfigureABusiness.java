/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Business;

import online.Business;
import online.CourseCatalog.CourseCatalog;
import online.CourseSchedule.CourseOffer;
import online.CourseSchedule.CourseSchedule;
import online.Person.Person;
import online.Person.PersonDirectory;
import online.profiles.EmployeeDirectory;
import online.profiles.EmployeeProfile;

import online.UserAccounts.UserAccount;
import online.UserAccounts.UserAccountDirectory;
import online.profiles.FacultyAssignment;
import online.profiles.FacultyDirectory;
import online.profiles.FacultyProfile;
import online.profiles.ProfessorProfile;
import online.profiles.StudentDirectory;
import online.profiles.StudentProfile;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
//        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("name", 24, "jas@gmail.com");

//  Create person objects to represent 10 professors.
        Person person01 = persondirectory.newPerson("abc", 24, "abc@gmail.com");
        Person person02 = persondirectory.newPerson("cde", 24, "cde@gmail.com");
        Person person03 = persondirectory.newPerson("efg", 24, "efg@gmail.com");
        Person person04 = persondirectory.newPerson("ghi", 24, "ghi@gmail.com");
        Person person05 = persondirectory.newPerson("ijk", 24, "ijk@gmail.com");
        Person person06 = persondirectory.newPerson("klm", 24, "klm@gmail.com");
        Person person07 = persondirectory.newPerson("mno", 24, "mno@gmail.com");
        Person person08 = persondirectory.newPerson("opq", 24, "opq@gmail.com");
        Person person09 = persondirectory.newPerson("qrs", 24, "qrs@gmail.com");
        Person person10 = persondirectory.newPerson("stu", 24, "stu@gmail.com");

//  Create person objects to 20 represent Students.
        Person person001 = persondirectory.newPerson("student1", 24, "jas@gmail.com");
        Person person002 = persondirectory.newPerson("student2", 24, "jas@gmail.com");
        Person person003 = persondirectory.newPerson("student3", 24, "jas@gmail.com");
        Person person004 = persondirectory.newPerson("student4", 24, "jas@gmail.com");
        Person person005 = persondirectory.newPerson("student5", 24, "jas@gmail.com");
        Person person006 = persondirectory.newPerson("student6", 24, "jas@gmail.com");
        Person person007 = persondirectory.newPerson("student7", 24, "jas@gmail.com");
        Person person008 = persondirectory.newPerson("student8", 24, "jas@gmail.com");
        Person person009 = persondirectory.newPerson("student9", 24, "jas@gmail.com");
        Person person010 = persondirectory.newPerson("student10", 24, "jas@gmail.com");
        Person person011 = persondirectory.newPerson("student11", 24, "jas@gmail.com");
        Person person012 = persondirectory.newPerson("student12", 24, "jas@gmail.com");
        Person person013 = persondirectory.newPerson("student13", 24, "jas@gmail.com");
        Person person014 = persondirectory.newPerson("student14", 24, "jas@gmail.com");
        Person person015 = persondirectory.newPerson("student15", 24, "jas@gmail.com");
        Person person016 = persondirectory.newPerson("student16", 24, "jas@gmail.com");
        Person person017 = persondirectory.newPerson("student17", 24, "jas@gmail.com");
        Person person018 = persondirectory.newPerson("student18", 24, "jas@gmail.com");
        Person person019 = persondirectory.newPerson("student19", 24, "jas@gmail.com");
        Person person020 = persondirectory.newPerson("student20", 24, "jas@gmail.com");

// Create Students
        StudentDirectory studentDirectory = business.getStudentDirectory();
        StudentProfile studentProfile001 = studentDirectory.newStudentProfile(person001);
        StudentProfile studentProfile002 = studentDirectory.newStudentProfile(person002);
        StudentProfile studentProfile003 = studentDirectory.newStudentProfile(person003);
        StudentProfile studentProfile004 = studentDirectory.newStudentProfile(person004);
        StudentProfile studentProfile005 = studentDirectory.newStudentProfile(person005);
        StudentProfile studentProfile006 = studentDirectory.newStudentProfile(person006);
        StudentProfile studentProfile007 = studentDirectory.newStudentProfile(person007);
        StudentProfile studentProfile008 = studentDirectory.newStudentProfile(person008);
        StudentProfile studentProfile009 = studentDirectory.newStudentProfile(person009);
        StudentProfile studentProfile010 = studentDirectory.newStudentProfile(person010);
        StudentProfile studentProfile011 = studentDirectory.newStudentProfile(person011);
        StudentProfile studentProfile012 = studentDirectory.newStudentProfile(person012);
        StudentProfile studentProfile013 = studentDirectory.newStudentProfile(person013);
        StudentProfile studentProfile014 = studentDirectory.newStudentProfile(person014);
        StudentProfile studentProfile015 = studentDirectory.newStudentProfile(person015);
        StudentProfile studentProfile016 = studentDirectory.newStudentProfile(person016);
        StudentProfile studentProfile017 = studentDirectory.newStudentProfile(person017);
        StudentProfile studentProfile018 = studentDirectory.newStudentProfile(person018);
        StudentProfile studentProfile019 = studentDirectory.newStudentProfile(person019);
        StudentProfile studentProfile020 = studentDirectory.newStudentProfile(person020);

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile00 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);

// Create Professors
        FacultyDirectory facultyDirectory = business.getFacultyDirectory();
        FacultyProfile professorProfile01 = facultyDirectory.newFacultyProfile(person01);
        FacultyProfile professorProfile02 = facultyDirectory.newFacultyProfile(person02);
        FacultyProfile professorProfile03 = facultyDirectory.newFacultyProfile(person03);
        FacultyProfile professorProfile04 = facultyDirectory.newFacultyProfile(person04);
        FacultyProfile professorProfile05 = facultyDirectory.newFacultyProfile(person05);
        FacultyProfile professorProfile06 = facultyDirectory.newFacultyProfile(person06);
        FacultyProfile professorProfile07 = facultyDirectory.newFacultyProfile(person07);
        FacultyProfile professorProfile08 = facultyDirectory.newFacultyProfile(person08);
        FacultyProfile professorProfile09 = facultyDirectory.newFacultyProfile(person09);
        FacultyProfile professorProfile10 = facultyDirectory.newFacultyProfile(person10);
//        EmployeeProfile employeeprofile11 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);
//        EmployeeProfile employeeprofile12 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxmarketingperson001);

// Create User accounts that link to Student profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();

        UserAccount ua001 = uadirectory.newUserAccount(studentProfile001, studentProfile001.getPerson().getName(), studentProfile001.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua002 = uadirectory.newUserAccount(studentProfile002, studentProfile002.getPerson().getName(), studentProfile002.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua003 = uadirectory.newUserAccount(studentProfile003, studentProfile003.getPerson().getName(), studentProfile003.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua004 = uadirectory.newUserAccount(studentProfile004, studentProfile004.getPerson().getName(), studentProfile004.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua005 = uadirectory.newUserAccount(studentProfile005, studentProfile005.getPerson().getName(), studentProfile005.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua006 = uadirectory.newUserAccount(studentProfile006, studentProfile006.getPerson().getName(), studentProfile006.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua007 = uadirectory.newUserAccount(studentProfile007, studentProfile007.getPerson().getName(), studentProfile007.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua008 = uadirectory.newUserAccount(studentProfile008, studentProfile008.getPerson().getName(), studentProfile008.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua009 = uadirectory.newUserAccount(studentProfile009, studentProfile009.getPerson().getName(), studentProfile009.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua010 = uadirectory.newUserAccount(studentProfile010, studentProfile010.getPerson().getName(), studentProfile010.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua011 = uadirectory.newUserAccount(studentProfile011, studentProfile011.getPerson().getName(), studentProfile011.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua012 = uadirectory.newUserAccount(studentProfile012, studentProfile012.getPerson().getName(), studentProfile012.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua013 = uadirectory.newUserAccount(studentProfile013, studentProfile013.getPerson().getName(), studentProfile013.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua014 = uadirectory.newUserAccount(studentProfile014, studentProfile014.getPerson().getName(), studentProfile014.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua015 = uadirectory.newUserAccount(studentProfile015, studentProfile015.getPerson().getName(), studentProfile015.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua016 = uadirectory.newUserAccount(studentProfile016, studentProfile016.getPerson().getName(), studentProfile016.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua017 = uadirectory.newUserAccount(studentProfile017, studentProfile017.getPerson().getName(), studentProfile017.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua018 = uadirectory.newUserAccount(studentProfile018, studentProfile018.getPerson().getName(), studentProfile018.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua019 = uadirectory.newUserAccount(studentProfile019, studentProfile019.getPerson().getName(), studentProfile019.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua020 = uadirectory.newUserAccount(studentProfile020, studentProfile020.getPerson().getName(), studentProfile020.getPerson().getName()); /// order products for one of the customers and performed by a sales person

        //Create Admin accounts that link to Professor profiles
        UserAccount ua00111 = uadirectory.newUserAccount(employeeprofile00, "admin", "XXXX");
        // Create User accounts that link to Professor profiles
        UserAccount ua01 = uadirectory.newUserAccount(professorProfile01, professorProfile01.getPerson().getName(), professorProfile01.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua02 = uadirectory.newUserAccount(professorProfile02, professorProfile02.getPerson().getName(), professorProfile02.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua03 = uadirectory.newUserAccount(professorProfile03, professorProfile03.getPerson().getName(), professorProfile03.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua04 = uadirectory.newUserAccount(professorProfile04, professorProfile04.getPerson().getName(), professorProfile04.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua05 = uadirectory.newUserAccount(professorProfile05, professorProfile05.getPerson().getName(), professorProfile05.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua06 = uadirectory.newUserAccount(professorProfile06, professorProfile06.getPerson().getName(), professorProfile06.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua07 = uadirectory.newUserAccount(professorProfile07, professorProfile07.getPerson().getName(), professorProfile07.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua08 = uadirectory.newUserAccount(professorProfile08, professorProfile08.getPerson().getName(), professorProfile08.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua09 = uadirectory.newUserAccount(professorProfile09, professorProfile09.getPerson().getName(), professorProfile09.getPerson().getName()); /// order products for one of the customers and performed by a sales person
        UserAccount ua10 = uadirectory.newUserAccount(professorProfile10, professorProfile10.getPerson().getName(), professorProfile10.getPerson().getName()); /// order products for one of the customers and performed by a sales person

        // Generating semesters
        CourseSchedule coursescheduleFall23 = business.newCourseSchedule("Fall 2023");
        CourseSchedule coursescheduleSummer24 = business.newCourseSchedule("Summer 2024");
        CourseSchedule coursescheduleSpring24 = business.newCourseSchedule("Spring 2024");

        // Creating courses
        //generating faculty assignments 
        CourseCatalog cc = business.getCourseCatalog();
        FacultyAssignment fa1 = new FacultyAssignment(professorProfile01);
        FacultyAssignment fa2 = new FacultyAssignment(professorProfile02);
        FacultyAssignment fa3 = new FacultyAssignment(professorProfile03);
        FacultyAssignment fa4 = new FacultyAssignment(professorProfile04);
        FacultyAssignment fa5 = new FacultyAssignment(professorProfile05);
        FacultyAssignment fa6 = new FacultyAssignment(professorProfile06);
        FacultyAssignment fa7 = new FacultyAssignment(professorProfile07);
        FacultyAssignment fa8 = new FacultyAssignment(professorProfile08);
        FacultyAssignment fa9 = new FacultyAssignment(professorProfile09);
        FacultyAssignment fa10 = new FacultyAssignment(professorProfile10);

        //Creating courses 
        cc.newCourse("AED", "5100", 4, fa1);
        cc.newCourse("WEB", "6300", 4, fa1);

        cc.newCourse("INFO", "6500", 4, fa2);
        cc.newCourse("DATA", "5300", 4, fa2);
        cc.newCourse("UI", "6100", 4, fa3);
        cc.newCourse("ANALY", "5200", 4, fa3);
        cc.newCourse("CSE", "6400", 4, fa4);
        cc.newCourse("ABC", "5400", 4, fa4);
        cc.newCourse("CSYE", "6600", 4, fa5);
        cc.newCourse("CSY", "5331", 4, fa5);
        cc.newCourse("INF", "2400", 4, fa6);
        cc.newCourse("DAT", "3600", 4, fa6);
        cc.newCourse("SES", "6740", 4, fa7);
        cc.newCourse("MECH", "5347", 4, fa7);
        cc.newCourse("MCA", "7200", 4, fa8);
        cc.newCourse("YOU", "7100", 4, fa8);
        cc.newCourse("VSS", "6900", 4, fa9);
        cc.newCourse("SASS", "8793", 4, fa9);
        cc.newCourse("CSS", "6967", 4, fa10);
        cc.newCourse("PHY", "9899", 4, fa10);

        // Offerring courses to different semesters.
        CourseOffer courseoffer5100 = coursescheduleFall23.newCourseOffer("5100");
        CourseOffer courseoffer6300 = coursescheduleFall23.newCourseOffer("6300");
        CourseOffer courseoffer9899 = coursescheduleFall23.newCourseOffer("9899");
        CourseOffer courseoffer6967 = coursescheduleFall23.newCourseOffer("6967");
        CourseOffer courseoffer8793 = coursescheduleFall23.newCourseOffer("6900");
        CourseOffer courseoffer7100 = coursescheduleFall23.newCourseOffer("7100");

        CourseOffer courseoffer6500 = coursescheduleSpring24.newCourseOffer("6500");
        CourseOffer courseoffer7200 = coursescheduleSpring24.newCourseOffer("7200");
        CourseOffer courseoffer5347 = coursescheduleSpring24.newCourseOffer("5347");
        CourseOffer courseoffer6740 = coursescheduleSpring24.newCourseOffer("6740");
        CourseOffer courseoffer3600 = coursescheduleSpring24.newCourseOffer("3600");

        CourseOffer courseoffer5331 = coursescheduleSummer24.newCourseOffer("5331");
        CourseOffer courseoffer2400 = coursescheduleSummer24.newCourseOffer("2400");
        CourseOffer courseoffer5400 = coursescheduleSummer24.newCourseOffer("5400");
        CourseOffer courseoffer6400 = coursescheduleSummer24.newCourseOffer("6400");

        //Registering stiudents to different courses.
        courseoffer5100.registerStudent(studentProfile001);
        courseoffer5100.registerStudent(studentProfile003);
        courseoffer5100.registerStudent(studentProfile004);
        courseoffer5100.registerStudent(studentProfile005);
        courseoffer5100.registerStudent(studentProfile006);
        courseoffer5100.registerStudent(studentProfile007);

        courseoffer6300.registerStudent(studentProfile001);
        courseoffer6300.registerStudent(studentProfile005);
        courseoffer6300.registerStudent(studentProfile008);
        courseoffer6300.registerStudent(studentProfile007);
        courseoffer6300.registerStudent(studentProfile011);
        courseoffer6300.registerStudent(studentProfile013);
        courseoffer6300.registerStudent(studentProfile015);

        courseoffer9899.registerStudent(studentProfile002);
        courseoffer9899.registerStudent(studentProfile004);
        courseoffer9899.registerStudent(studentProfile006);
        courseoffer9899.registerStudent(studentProfile012);
        courseoffer9899.registerStudent(studentProfile010);

        courseoffer6967.registerStudent(studentProfile011);
        courseoffer6967.registerStudent(studentProfile009);
        courseoffer6967.registerStudent(studentProfile013);
        courseoffer6967.registerStudent(studentProfile007);

        courseoffer8793.registerStudent(studentProfile014);
        courseoffer8793.registerStudent(studentProfile002);
        courseoffer8793.registerStudent(studentProfile004);
        courseoffer8793.registerStudent(studentProfile006);
        courseoffer8793.registerStudent(studentProfile012);
        courseoffer8793.registerStudent(studentProfile010);

        courseoffer7100.registerStudent(studentProfile011);
        courseoffer7100.registerStudent(studentProfile009);
        courseoffer7100.registerStudent(studentProfile013);
        courseoffer7100.registerStudent(studentProfile007);
        
        courseoffer6500.registerStudent(studentProfile011);
        courseoffer6500.registerStudent(studentProfile011);
        courseoffer6500.registerStudent(studentProfile009);
        courseoffer6500.registerStudent(studentProfile013);
        courseoffer6500.registerStudent(studentProfile007);
        
         courseoffer7200.registerStudent(studentProfile011);
        courseoffer7200.registerStudent(studentProfile011);
        courseoffer7200.registerStudent(studentProfile009);
        courseoffer7200.registerStudent(studentProfile013);
        courseoffer7200.registerStudent(studentProfile007);
        
        courseoffer5347.registerStudent(studentProfile014);
        courseoffer5347.registerStudent(studentProfile002);
        courseoffer5347.registerStudent(studentProfile004);
        courseoffer5347.registerStudent(studentProfile006);
        courseoffer5347.registerStudent(studentProfile012);
        courseoffer5347.registerStudent(studentProfile010);
        
        courseoffer6740.registerStudent(studentProfile014);
        courseoffer6740.registerStudent(studentProfile002);
        courseoffer6740.registerStudent(studentProfile004);
        courseoffer6740.registerStudent(studentProfile006);
        courseoffer6740.registerStudent(studentProfile012);
        courseoffer6740.registerStudent(studentProfile010);
        
        courseoffer3600.registerStudent(studentProfile011);
        courseoffer3600.registerStudent(studentProfile009);
        courseoffer3600.registerStudent(studentProfile013);
        courseoffer3600.registerStudent(studentProfile007);
        
        courseoffer5331.registerStudent(studentProfile011);
        courseoffer5331.registerStudent(studentProfile009);
        courseoffer5331.registerStudent(studentProfile013);
        courseoffer5331.registerStudent(studentProfile007);
        
        
        courseoffer5400.registerStudent(studentProfile014);
        courseoffer5400.registerStudent(studentProfile002);
        courseoffer5400.registerStudent(studentProfile004);
        courseoffer5400.registerStudent(studentProfile006);
        courseoffer5400.registerStudent(studentProfile012);
        courseoffer5400.registerStudent(studentProfile010);
        
        
        courseoffer2400.registerStudent(studentProfile011);
        courseoffer2400.registerStudent(studentProfile009);
        courseoffer2400.registerStudent(studentProfile013);
        courseoffer2400.registerStudent(studentProfile007);
         
        
        courseoffer6400.registerStudent(studentProfile011);
        courseoffer6400.registerStudent(studentProfile009);
        courseoffer6400.registerStudent(studentProfile013);
        courseoffer6400.registerStudent(studentProfile007);
        
        

        return business;

    }

}
