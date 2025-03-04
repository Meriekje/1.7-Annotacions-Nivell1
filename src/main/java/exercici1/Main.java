package exercici1;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("John", "Doe", 15.0);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Jane", "Smith", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Alex", "Johnson", 18.0);

        System.out.println("Salary of a worker: " + worker.calculateSalary(160));
        System.out.println("Salary of an on site worker: " + onSiteWorker.calculateSalary(160));
        System.out.println("Salary of an online worker: " + onlineWorker.calculateSalary(160));
    }
}
