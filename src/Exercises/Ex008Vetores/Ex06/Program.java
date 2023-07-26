package Exercises.Ex008Vetores.Ex06;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos valores terá cada vetor? ");
    int quantity = sc.nextInt();

    int[] vectA = new int[quantity];
    int[] vectB = new int[quantity];

    System.out.println("Digite os valores do vetor A: ");
    for (int i = 0; i < vectA.length; i++) {
      vectA[i] = sc.nextInt();
    }

    System.out.println("Digite os valores do vetor B: ");
    for (int i = 0; i < vectB.length; i++) {
      vectB[i] = sc.nextInt();
    }

    System.out.println("VETOR RESULTANTE: ");

    for (int i = 0; i < quantity; i++) {
      System.out.println(vectA[i] + vectB[i]);
    }

    sc.close();
  }
}
