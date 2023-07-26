package Exercises.Ex008Vetores.Ex08;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double sumPairs = 0f;
    int totalPairs = 0;

    System.out.print("Quantos elementos vai ter o vetor? ");
    int[] numbers = new int[sc.nextInt()];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número: ");
      numbers[i] = sc.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        sumPairs += numbers[i];
        totalPairs++;
      }
    }

    if (sumPairs == 0) {
      System.out.println("NENHUM NÚMERO PAR");
    } else {
      System.out.printf("MÉDIA DOS PARES = %.1f", sumPairs / totalPairs);
    }


    sc.close();
  }
}
