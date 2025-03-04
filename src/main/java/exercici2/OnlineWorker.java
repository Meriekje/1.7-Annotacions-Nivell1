package exercici2;

public class OnlineWorker extends Worker {
    private static final double INTERNET_FEE = 50.0;


    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }


    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + INTERNET_FEE;
    }

    @Deprecated
    public double calculateOldSalaryWithInternet(int hoursWorked) {
        return hoursWorked * hourlyRate + INTERNET_FEE * 1.1;
    }
}
