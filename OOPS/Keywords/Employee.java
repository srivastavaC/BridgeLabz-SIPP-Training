public class Employee {
    private static String companyName = "Tech Innovations Inc.";
    private static int totalEmployees = 0;

    private final int id; 
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id; 
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void display() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("This is not a valid Employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Chandan Kumar Srivastava", 101, "Software Engineer");
        emp1.display();
        
        Employee emp2 = new Employee("Alice Johnson", 102, "Project Manager");
        emp2.display();

        displayTotalEmployees();
    }
}