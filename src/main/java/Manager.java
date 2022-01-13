public class Manager extends Employee{
    // private instance variables
    private String department;

    // Manager constructor
    public Manager(String employeeName, double employeeSalary, String managerDepartment){
        super(employeeName, employeeSalary);
        this.department = managerDepartment;
    }

    // Overridden toString method prints name, salary, and department
    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}
