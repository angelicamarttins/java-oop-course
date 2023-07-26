package VetoresTipoValor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de pessoas para calcular a média de suas alturas: ");
    int n = sc.nextInt();
    double[] heights = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Digite a altura da pessoa: ");
      heights[i] = sc.nextDouble();
    }

    double sum = 0f;

    for (int i = 0; i < n; i++) {
      sum += heights[i];
    }

    double avg = sum / n;

    System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

    sc.close();
  }
}
