package Examples.Composicao.application;

import Examples.Composicao.entities.Department;
import Examples.Composicao.entities.HourContract;
import Examples.Composicao.entities.Worker;
import Examples.Composicao.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    DateTimeFormatter fullDateMask = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String department = sc.nextLine();

    System.out.println("Enter worker data:");

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Level: ");
    String level = sc.nextLine().toUpperCase();

    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    System.out.print("How many contracts to this worker? ");
    int contracts = sc.nextInt();

    Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

    for (int i = 1; i <= contracts; i++) {
      System.out.printf("Enter contract #%s data: \n", i);

      System.out.print("Date (DD/MM/YYYY): ");
      LocalDate date = LocalDate.parse(sc.next(), fullDateMask);

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      HourContract hourContract = new HourContract(date, valuePerHour, hours);

      worker.addContract(hourContract);
    }

    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String[] dateOfContracts = sc.next().split("/");
    int month = Integer.parseInt(dateOfContracts[0]);
    int year = Integer.parseInt(dateOfContracts[1]);

    System.out.println();
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment());
    System.out.printf("Income for %s: %.2f",
        String.join("/", dateOfContracts), worker.income(year, month));

    sc.close();
  }
}