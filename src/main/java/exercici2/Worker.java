package exercici2;

public class Worker {
    String firstName;
    String lastName;
    double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    @Deprecated
    public double calculateOldSalary(int hoursWorked) {
        return hoursWorked * hourlyRate * 1.1;
    }
}
