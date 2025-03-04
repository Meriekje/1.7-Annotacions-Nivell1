package exercici1;

public class Worker {
    String firstName;
    String lastName;
    double hourlyRate;

    // Constructor
    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}
