package exercici1;

public class Main {
    public static void main(String[] args) {
        // Create instances of each class
        OnlineWorker onlineWorker = new OnlineWorker("John", "Doe", 20.0);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Jane", "Smith", 25.0);

        // Calculate and print salary for online worker
        System.out.println("Online Worker Salary: " + onlineWorker.calculateSalary(160) + " USD");

        // Calculate and print salary for in-person worker
        System.out.println("In-Person Worker Salary: " + onSiteWorker.calculateSalary(160) + " USD");
    }
}
