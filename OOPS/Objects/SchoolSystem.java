import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {

    
    static class Course {
        private String courseName;
        private ArrayList<Student> enrolledStudents;

        public Course(String courseName) {
            this.courseName = courseName;
            this.enrolledStudents = new ArrayList<>();
        }

        public String getCourseName() {
            return courseName;
        }

        public void enrollStudent(Student student) {
            if (!enrolledStudents.contains(student)) {
                enrolledStudents.add(student);
                student.addCourse(this);
            }
        }

        public void showEnrolledStudents() {
            System.out.println("📘 Course: " + courseName + " - Enrolled Students:");
            for (Student s : enrolledStudents) {
                System.out.println("   👤 " + s.getName());
            }
        }
    }

    
    static class Student {
        private String name;
        private ArrayList<Course> enrolledCourses;

        public Student(String name) {
            this.name = name;
            this.enrolledCourses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addCourse(Course course) {
            if (!enrolledCourses.contains(course)) {
                enrolledCourses.add(course);
            }
        }

        public void viewCourses() {
            System.out.println("👤 Student: " + name + " - Enrolled Courses:");
            for (Course c : enrolledCourses) {
                System.out.println("   📘 " + c.getCourseName());
            }
        }
    }

    
    static class School {
        private String schoolName;
        private ArrayList<Student> students;

        public School(String schoolName) {
            this.schoolName = schoolName;
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student); 
        }

        public void showAllStudents() {
            System.out.println("🏫 School: " + schoolName + " - All Students:");
            for (Student s : students) {
                System.out.println("   👤 " + s.getName());
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School school = new School("OpenAI Academy");

        
        Course java = new Course("Java Programming");
        Course dsa = new Course("Data Structures");
        Course dbms = new Course("Database Systems");

        
        System.out.print("Enter number of students to add: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();
            Student student = new Student(name);

            school.addStudent(student);

            System.out.println("Select courses to enroll in (comma-separated numbers):");
            System.out.println("1. Java Programming");
            System.out.println("2. Data Structures");
            System.out.println("3. Database Systems");
            System.out.print("Your choices: ");
            String[] choices = sc.nextLine().split(",");

            for (String choice : choices) {
                switch (choice.trim()) {
                    case "1":
                        java.enrollStudent(student);
                        break;
                    case "2":
                        dsa.enrollStudent(student);
                        break;
                    case "3":
                        dbms.enrollStudent(student);
                        break;
                }
            }
        }

       
        System.out.println("\n======================");
        school.showAllStudents();

        System.out.println("\n--- Students' Enrolled Courses ---");
        for (Student s : school.students) {
            s.viewCourses();
        }

        System.out.println("\n--- Courses and Their Enrolled Students ---");
        java.showEnrolledStudents();
        dsa.showEnrolledStudents();
        dbms.showEnrolledStudents();

        sc.close();
    }
}
