
class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("");
    }
}

public class Q7_Employee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 2020, 50000, "1234 Main St.");
        Employee employee2 = new Employee("smith", 2019, 55000, "5678 Elm St.");
        Employee employee3 = new Employee("Jim Doe", 2022, 60000, "9101 Oak St.");

        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
    }
}
