package exercici2;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("John", "Doe", 15.0);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Jane", "Smith", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Alex", "Johnson", 18.0);

        System.out.println("Salary of a worker: " + worker.calculateSalary(160));
        System.out.println("Salary of an onsite worker: " + onSiteWorker.calculateSalary(160));
        System.out.println("Salary of an online worker: " + onlineWorker.calculateSalary(160));

        System.out.println("\nDeprecated methods:");

        System.out.println("Salary of a worker (old method): " + worker.calculateOldSalary(160));
        System.out.println("Salary of an on site worker (old method): " + onSiteWorker.calculateOldSalaryWithGasoline(160));
        System.out.println("Salary of an online worker (old method): " + onlineWorker.calculateOldSalaryWithInternet(160));
    }
}
