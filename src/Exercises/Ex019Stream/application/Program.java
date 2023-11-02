package Exercises.Ex019Stream.application;

import Exercises.Ex019Stream.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();

    System.out.print("Enter salary: ");
    double salaryRange = sc.nextDouble();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();

      while (line != null) {
        String[] lineFields = line.split(",");

        employees.add(new Employee(lineFields[0], lineFields[1], Double.valueOf(lineFields[2])));

        line = bufferedReader.readLine();
      }

      System.out.printf("\nEmail of people whose salary is more than %.2f: \n\n", salaryRange);

      List<String> employeesUnderSalaryRange =
          employees
              .stream()
              .filter(employee -> employee.getSalary() > salaryRange)
              .map(Employee::getEmail)
              .sorted(Comparator.comparing(String::toUpperCase))
              .collect(Collectors.toList());

      employeesUnderSalaryRange.forEach(System.out::println);

      Double sum =
          employees
              .stream()
              .filter(employee -> employee.getName().toUpperCase().charAt(0) == 'M')
              .map(Employee::getSalary)
              .reduce(0.0, Double::sum);


      System.out.printf("\nSum of salary of people whose name starts with 'M': %.2f", sum);

    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
    sc.close();
  }
}

///home/amartins/estudos/curso-java-nelio/src/Exercises/Ex019Stream/csv/employees.csv