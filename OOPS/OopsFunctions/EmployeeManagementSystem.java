interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

   
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    public abstract double calculateSalary();

    
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + calculateSalary());
    }

   
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}


class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[3];

        
        employees[0] = new FullTimeEmployee(101, "Chandan", 50000, 10000);
        employees[0].assignDepartment("Engineering");

        
        employees[1] = new PartTimeEmployee(102, "Sinha", 500, 80);
        employees[1].assignDepartment("Support");

        employees[2] = new FullTimeEmployee(103, "Triphati", 60000, 15000);
        employees[2].assignDepartment("HR");

        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
