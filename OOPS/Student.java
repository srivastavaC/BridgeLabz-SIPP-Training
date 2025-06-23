public class Student {
    String name;
    int rollno;
    double marks;
    public Student(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student student = new Student("Chandan Kumer Srivastava", 101, 95.5);
        student.display();
    }
    
}
class grade{
    public static String getGrade(double marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
