public class Q8_EmployeeSal {
    private int salary;
    private int hoursOfWorkPerDay;

    public Q8_EmployeeSal(int salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    public void getInfo(int salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }

    public int AddSal() {
        if (salary < 500) {
            salary += 10;
        }
        return salary;
    }

    public int AddWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5;
        }
        return salary;
    }

    public int getFinalSalary() {
        return AddSal() + AddWork();
    }

    public static void main(String[] args) {
        Q8_EmployeeSal employee = new Q8_EmployeeSal(400, 7);
        System.out.println("Final Salary: " + employee.getFinalSalary());
    }
}
