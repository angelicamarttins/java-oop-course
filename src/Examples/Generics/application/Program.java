package Examples.Generics.application;

import Examples.Generics.model.services.PrintService;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintService<Integer> printService = new PrintService<>();

    System.out.print("How many values? ");
    int numberOfValues = scanner.nextInt();

    System.out.println("Integer");
    for (int i = 0; i < numberOfValues; i++) {
      System.out.print("Enter the value: ");
      printService.addValue(scanner.nextInt());
    }

    printService.print();
    System.out.printf("FIRST: %d\n", printService.first());

    System.out.println("STRING");
    PrintService<String> printServiceString = new PrintService<>();
    scanner.nextLine();

    for (int i = 0; i < numberOfValues; i++) {
      System.out.print("Enter the value: ");
      printServiceString.addValue(scanner.nextLine());
    }

    printServiceString.print();
    System.out.printf("FIRST: %s", printServiceString.first());

    scanner.close();
  }
}
