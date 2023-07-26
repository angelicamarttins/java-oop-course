package Exercises.Ex009List.application;

import Exercises.Ex009List.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int id, quantity;
    double percentage;

    Scanner sc = new Scanner(System.in);
    List<Employee> employeesList = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    quantity = sc.nextInt();

    for (int i = 1; i <= quantity; i++) {
      System.out.printf("Employee #%d:%n", i);

      System.out.print("Id: ");
      int employeeId = sc.nextInt();

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Salary: ");
      double salary = sc.nextDouble();

        employeesList.add(new Employee(employeeId, name, salary));
    }

    System.out.print("Enter the employee id that will have salary increase: ");
    id = sc.nextInt();

    System.out.print("Enter the percentage: ");
    percentage = sc.nextDouble();

    List<Employee> filteredEmployees =
        employeesList
        .stream()
        .filter(employee -> employee.getId() == id)
        .collect(Collectors.toList());

      if (filteredEmployees.size() != 0) {
        employeesList.get(1).increaseSalary(percentage);
      } else {
        System.out.println("This id does not exist!");
        System.exit(0);
      }

    System.out.println("List of employees:");
    for (Employee employee : employeesList) {
      System.out.println(employee);
    }

    sc.close();
  }
}
