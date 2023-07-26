package Exercises.Ex007MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double dollarPrice, dollars;

    System.out.print("What is the dollar price? ");
    dollarPrice = sc.nextDouble();
    System.out.print("How many dollars will be bought? ");
    dollars = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f",
        CurrencyConverter.converter(dollarPrice, dollars));
    sc.close();
  }
}
