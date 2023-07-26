package Exercises.Ex008Vetores.Ex04;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quantity;
    int pairQuantity = 0;

    System.out.print("Quantos números você vai digitar? ");
    quantity = sc.nextInt();

    int[] numbers = new int[quantity];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número: ");
      numbers[i] = sc.nextInt();
    }

    System.out.println("NÚMEROS PARES: ");

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        System.out.print(numbers[i] + " ");
        pairQuantity++;
      }
    }

    System.out.println("\nQUANTIDADE DE PARES = " + pairQuantity);
    sc.close();
  }
}
