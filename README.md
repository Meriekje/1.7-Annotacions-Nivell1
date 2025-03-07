# 1.7-Annotacions-Nivell1

This project demonstrates inheritance, method overriding, and the use of deprecated methods in Java. It includes a hierarchy of worker classes where salaries are calculated based on different criteria.

**Project Structure**\
The program consists of the following Java classes:
- Worker (Base Class)
  * Attributes: firstName, lastName, hourlyRate
  * Methods:
      + calculateSalary(int hoursWorked): Calculates salary by multiplying hours worked by hourly rate.
      + calculateOldSalary(int hoursWorked) @Deprecated: An old method that adds a 10% salary increase.
- OnSiteWorker (Subclass of Worker)
    * Additional attribute: FUEL_COST
    * Overrides calculateSalary(): Adds a fixed fuel cost to the salary.
    * Deprecated method (added in exercise 2): calculateOldSalaryWithGasoline(), which applies an older calculation method.
- OnlineWorker (Subclass of Worker)
    * Additional attribute: INTERNET_FEE (constant)
    * Overrides calculateSalary(): Adds a fixed internet fee to the salary.
    * Deprecated method (added in exercise 2): calculateOldSalaryWithInternet(), which applies an older calculation method.
- Main (Test Class)
    * Instantiates and tests each worker type.
    * Demonstrates method overriding and usage of deprecated methods (added in exercise 2).

**The output will show:**
- Salaries using the current calculation method.
- Salaries using deprecated methods, which apply an older salary calculation (added in exercise 2).

**Concepts Demonstrated**
- Inheritance: InPersonWorker and OnlineWorker extend Worker.
- Method Overriding (@Override): Subclasses override calculateSalary().
- Static and Final Attributes: FUEL_COST and INTERNET_FEE are static and final.
- Deprecated Methods (@Deprecated): Shows how to mark old methods and suppress warnings (added in exercise 2).
