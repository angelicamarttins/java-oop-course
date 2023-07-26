package Exercises.Ex008Vetores.Ex05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double majorNumber = 0f;
    int positionMajorNumber = 0;

    System.out.print("Quantos números você vai digitar? ");
    int quantity = sc.nextInt();
    double[] numbers = new double[quantity];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número: ");
      double number = sc.nextDouble();

      if (number > majorNumber) {
        majorNumber = number;
        positionMajorNumber = i;
      }

      numbers[i] = number;
    }

    System.out.printf("MAIOR VALOR = %.1f%n", majorNumber);
    System.out.println("POSIÇÃO DO MAIOR VALOR = " + positionMajorNumber);

    sc.close();
  }
}
