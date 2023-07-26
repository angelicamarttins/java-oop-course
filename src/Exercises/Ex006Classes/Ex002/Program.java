package Exercises.Ex006Classes.Ex002;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.println("Employee infos: ");
    System.out.print("Name: ");
    employee.name = sc.nextLine();

    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();

    System.out.println("Employee: " + employee.toString());

    System.out.println("Which percentage to increase salary? ");
    employee.increaseSalary(sc.nextDouble());

    System.out.println("Updated data: " + employee.toString());

    sc.close();
  }
}
