class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    void displayRole() {
        System.out.println("Role: Person in school");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}


class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Anjali", 16, "10th Grade");
        Staff staff = new Staff("Raj", 35, "Administration");

        System.out.println("--- Teacher ---");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\n--- Student ---");
        student.displayInfo();
        student.displayRole();

        System.out.println("\n--- Staff ---");
        staff.displayInfo();
        staff.displayRole();
    }
}
