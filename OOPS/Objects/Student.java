import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


class Professor {
    private String name;
    private String department;
    private List<Course> teachingCourses;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.teachingCourses = new ArrayList<>();
    }

    public void assignProfessor(Course course) {
        teachingCourses.add(course);
        course.setProfessor(this);
        System.out.println(name + " is now teaching " + course.getCourseName());
    }

    public void showTeachingCourses() {
        System.out.println("Courses taught by Prof. " + name + ":");
        for (Course c : teachingCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


class Course {
    private String courseName;
    private int courseCode;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Code: " + courseCode);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned yet"));
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}


class UniversitySystem {
    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        
        Professor p1 = new Professor("Dr. Smith", "Computer Science");
        Professor p2 = new Professor("Dr. Lee", "Mathematics");

        Course c1 = new Course("Data Structures", 201);
        Course c2 = new Course("Calculus", 202);

       
        p1.assignProfessor(c1);
        p2.assignProfessor(c2);

        
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        
        System.out.println("\n--- Course Details ---");
        c1.showCourseDetails();
        c2.showCourseDetails();

        System.out.println("\n--- Student Info ---");
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        System.out.println("\n--- Professor Info ---");
        p1.showTeachingCourses();
        p2.showTeachingCourses();
    }
}
