package Examples.Polimorfismo.application;

import Examples.Polimorfismo.entities.Employee;
import Examples.Polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int numberOfEmployees = sc.nextInt();

    for (int i = 1; i <= numberOfEmployees; i++) {
      System.out.printf("Employee #%d data:\n", i);

      System.out.print("Outsourced (y/n)? ");
      boolean isOutsourcedEmployee = sc.next().charAt(0) == 'y';
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Hours: ");
      int hours = sc.nextInt();

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      if (isOutsourcedEmployee) {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();

        employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println("\nPAYMENTS:");

    for (Employee employee : employees) {
      System.out.printf("%s - $ %.2f\n", employee.getName(), employee.payment());
    }

    sc.close();
  }
}
