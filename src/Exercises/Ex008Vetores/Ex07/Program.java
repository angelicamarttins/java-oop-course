package Exercises.Ex008Vetores.Ex07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double sumVect = 0f;
    double avgVect = 0f;

    System.out.print("Quantos elementos vai ter o vetor? ");
    int quantity = sc.nextInt();
    double[] vect = new double[quantity];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um número: ");
      double number = sc.nextDouble();

      vect[i] = number;
      sumVect += number;
    }

    avgVect = sumVect / vect.length;

    System.out.printf("MÉDIA DO VETOR = %.3f%n", avgVect);
    System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < avgVect) {
        System.out.printf("%.1f%n", vect[i]);
      }
    }

    sc.close();
  }
}
