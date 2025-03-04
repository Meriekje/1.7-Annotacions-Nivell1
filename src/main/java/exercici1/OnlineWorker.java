package exercici1;

public class OnlineWorker extends Worker{
    private static final double INTERNET_FEE = 50.0;

    // Constructor to initialize the attributes (calls parent constructor)
    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    // Override method to calculate salary for online workers
    @Override
    public double calculateSalary(int hoursWorked) {
        // Calculate salary with internet fee
        return (hoursWorked * hourlyRate) + INTERNET_FEE;
    }
}
