import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee type (full-time / part-time):");
        String answer = scanner.nextLine();

        Employee employee;

        if (answer.equals("full-time"))
        {
            System.out.println("Enter monthly base pay:");
            double basePay = scanner.nextDouble();
            System.out.println("Enter bonus:");
            double bonus = scanner.nextDouble();
            employee = new FullTimeEmployee(basePay, bonus);
        }
        else if (answer.equals("part-time"))
        {
            System.out.println("Enter hourly rate:");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours worked");
            double hoursWorked = scanner.nextDouble();
            employee = new PartTimeEmployee(hourlyRate, hoursWorked);
        }
        else
        {
            System.out.println("Invalid employee type");
            return;
        }
        System.out.printf("Monthly salary: $%.2f%n", employee.calculateSalary());
    }
}
