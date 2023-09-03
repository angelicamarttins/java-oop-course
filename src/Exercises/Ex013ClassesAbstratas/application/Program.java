package Exercises.Ex013ClassesAbstratas.application;

import Exercises.Ex013ClassesAbstratas.entities.Company;
import Exercises.Ex013ClassesAbstratas.entities.Individual;
import Exercises.Ex013ClassesAbstratas.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> payers = new ArrayList<>();
    double sum = 0.0;

    System.out.print("Enter the number of tax payers: ");
    int numberOfPayers = sc.nextInt();

    for (int i = 1; i <= numberOfPayers; i++) {
      System.out.printf("Tax payer #%d data:\n", i);

      System.out.print("Individual or company (i/c)? ");
      char taxPayer = Character.toLowerCase(sc.next().charAt(0));
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Annual income: ");
      double annualIncome = sc.nextDouble();

      if (taxPayer == 'i') {
        System.out.print("Health expenditures: ");
        double healthExpenditures = sc.nextDouble();

        payers.add(new Individual(name, annualIncome, healthExpenditures));
      } else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = sc.nextInt();

        payers.add(new Company(name, annualIncome, numberOfEmployees));
      }
    }

    System.out.println("\nTAXES PAID:");

    for (TaxPayer payer : payers) {
      sum += payer.tax();

      System.out.printf("%s: $ %.2f\n", payer.getName(), payer.tax());
    }

    System.out.printf("\nTOTAL TAXES: $ %.2f", sum);

    sc.close();
  }
}
