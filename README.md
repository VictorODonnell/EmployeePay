# How to Run
1. Open the project in your IDE
2. Run Main.java
3. Enter the employee type, then the values it asks for
4. View the calculated monthly salary

Valid employee types are full-time and part-time. Any other input prints "Invalid employee type" and the program ends.

# Example Output
Full time:

Enter employee type (full-time / part-time):
full-time
Enter monthly base pay:
4000
Enter bonus:
500
Monthly salary: $4500.00

Part time:

Enter employee type (full-time / part-time):
part-time
Enter hourly rate:
20
Enter hours worked:
80
Monthly salary: $1600.00
Files
Main.java: collects input with a Scanner, creates the correct object, and displays the salary
Employee.java: the parent class with calculateSalary() returning 0.0

# FullTimeEmployee.java: child class that returns basePay + bonus
PartTimeEmployee.java: child class that returns hourlyRate * hoursWorked
Code Structure

# Employee (parent class) has a calculateSalary() method that returns 0.0. FullTimeEmployee (child class) uses extends to inherit from Employee, adds basePay and bonus fields, and overrides calculateSalary() to return basePay + bonus. PartTimeEmployee (child class) also extends Employee, adds hourlyRate and hoursWorked fields, and overrides calculateSalary() to return hourlyRate * hoursWorked. Main uses a Scanner to collect input, creates the correct object, and calls calculateSalary().

# Code Explanation
java
class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;

    public FullTimeEmployee(double basePay, double bonus) {
        this.basePay = basePay;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basePay + bonus;
    }
}

FullTimeEmployee inherits from Employee and overrides calculateSalary() to return the base pay plus the bonus. PartTimeEmployee works the same way but multiplies the hourly rate by the hours worked.

In Main, the variable is declared as an Employee, and either subclass can be assigned to it. When employee.calculateSalary() is called, Java runs the version that belongs to the actual object. This is polymorphism.

Author

Victor
