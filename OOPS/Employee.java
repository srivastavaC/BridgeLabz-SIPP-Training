public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Chandan Kumer Srivastava", 101, 5000000000.0);
        emp.display();
    }
}

