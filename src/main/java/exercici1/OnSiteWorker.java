package exercici1;

class OnSiteWorker extends Worker {
    private static final double FUEL_COST = 100.0;

    // Constructor to initialize the attributes (calls parent constructor)
    public OnSiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    // Override method to calculate salary for in-person workers
    @Override
    public double calculateSalary(int hoursWorked) {
        // Calculate salary with fuel cost
        return (hoursWorked * hourlyRate) + FUEL_COST;
    }
}
