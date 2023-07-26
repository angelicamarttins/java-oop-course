package Exercises.Ex008Vetores.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int quantity = 0;

    System.out.print("Quantos números você vai digitar? ");
    quantity = sc.nextInt();
    double[] numbers = new double[quantity];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número: ");
      numbers[i] = sc.nextDouble();
    }

    double sum = 0f;

    System.out.print("VALORES = ");
    for (int i = 0; i< numbers.length; i++) {
      System.out.printf(" %.2f %s", numbers[i], i == numbers.length - 1 ? "\n" : "");
      sum += numbers[i];
    }
    System.out.printf("SOMA = %.2f%n", sum);
    System.out.printf("MÉDIA = %.2f%n", sum / numbers.length);

    sc.close();
  }
}
