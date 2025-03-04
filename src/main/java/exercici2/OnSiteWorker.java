package exercici2;

class OnSiteWorker extends Worker {
    private static final double FUEL_COST = 100.0;

    public OnSiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + FUEL_COST;
    }

    @Deprecated
    public double calculateOldSalaryWithGasoline(int hoursWorked) {
        return hoursWorked * hourlyRate + FUEL_COST * 1.2;
    }
}
