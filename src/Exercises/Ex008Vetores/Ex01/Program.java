package Exercises.Ex008Vetores.Ex01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int quantity = 0;

    System.out.print("Quantos números você vai digitar? (Máximo: 10)");
    quantity = sc.nextInt();
    int[] numbers = new int[quantity];

    if (quantity > 10) {
      System.out.println("Número maior que 10. Tente novamente");
    } else {
      for (int i = 0; i < numbers.length; i++) {
        System.out.print("Digite um número: ");
        numbers[i] = sc.nextInt();
      }

      System.out.println("NÚMEROS NEGATIVOS:");
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) System.out.println(numbers[i]);
      }
    };

    sc.close();
  }
}
