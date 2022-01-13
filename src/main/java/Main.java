/**
 * @author Muhammad Ibrahim
 * @version 12 January 2022
 * Inheritance Lab (Exercise P10.5)
 */

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Sam", 45000);
        Manager manager = new Manager("Mark", 60000, "Sales");
        Executive executive = new Executive("Dan", 70000, "Marketing");

        System.out.println("Employee:\n" + employee + "\n");
        System.out.println("Manager:\n" + manager + "\n");
        System.out.println("Executive:\n" + executive + "\n");
    }
}
