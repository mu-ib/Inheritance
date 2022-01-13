public class Executive extends Manager{
    // Constructor that matches super class
    public Executive(String employeeName, double employeeSalary, String managerDepartment) {
        super(employeeName, employeeSalary, managerDepartment);
    }

    // Overridden toString method prints name, salary, and department
    @Override
    public String toString() {
        return super.toString();
    }
}
