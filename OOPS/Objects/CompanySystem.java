import java.util.ArrayList;
import java.util.Scanner;

public class CompanySystem {

   
    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public void showInfo() {
            System.out.println("    👤 Employee: " + name);
        }
    }

    
    static class Department {
        private String deptName;
        private ArrayList<Employee> employees;

        public Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }

        public void addEmployee(String employeeName) {
            employees.add(new Employee(employeeName));
        }

        public void showDepartment() {
            System.out.println("🏢 Department: " + deptName);
            for (Employee emp : employees) {
                emp.showInfo();
            }
        }

        public void clearEmployees() {
            employees.clear();
            System.out.println("    🧹 All employees removed from " + deptName);
        }
    }

    
    static class Company {
        private String companyName;
        private ArrayList<Department> departments;

        public Company(String companyName) {
            this.companyName = companyName;
            this.departments = new ArrayList<>();
        }

        public void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }

        public Department getDepartment(int index) {
            return departments.get(index);
        }

        public void showCompany() {
            System.out.println("\n🏬 Company: " + companyName);
            for (Department dept : departments) {
                dept.showDepartment();
            }
        }

        
        public void deleteCompany() {
            for (Department dept : departments) {
                dept.clearEmployees();
            }
            departments.clear(); 
            System.out.println("❌ Company '" + companyName + "' and all departments & employees removed.");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company company = new Company("OpenAI Solutions");

        System.out.print("Enter number of departments: ");
        int deptCount = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < deptCount; i++) {
            System.out.print("Enter department name: ");
            String deptName = sc.nextLine();
            company.addDepartment(deptName);

            System.out.print("Enter number of employees in " + deptName + ": ");
            int empCount = sc.nextInt();
            sc.nextLine(); 

            Department dept = company.getDepartment(i);
            for (int j = 0; j < empCount; j++) {
                System.out.print("  Enter employee name: ");
                String empName = sc.nextLine();
                dept.addEmployee(empName);
            }
        }

        
        company.showCompany();

        
        System.out.println("\nDo you want to delete the company? (yes/no)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            company.deleteCompany();
        }

        sc.close();
    }
}
