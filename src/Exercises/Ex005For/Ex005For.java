package Exercises.Ex005For;

import java.util.Scanner;

public class Ex005For {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    odd(sc);

    inAndOutInterval(sc);

    weightedAverage(sc);

    fraction(sc);

    factorial(sc);

    dividers(sc);

    squareAndCube(sc);

    sc.close();
  }

  public static void odd(Scanner sc) {
    System.out.println("Digite um número para ver seus ímpares: ");
    int x = sc.nextInt();

    for (int i = 1; i <= x; i += 2) {
      System.out.println(i);
    }
  }

  public static void inAndOutInterval(Scanner sc) {
    int in = 0;
    int out = 0;

    System.out.println("Digite a quantidade de entrada de números: ");

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Digite um número para calcular se está dentro ou " +
          "fora do range de 10 a 20: ");
      int number = sc.nextInt();

      if (number >= 10 && number <= 20) {
        in++;
      } else {
        out++;
      }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");
  }

  public static void weightedAverage(Scanner sc) {
    System.out.println("Digite o número de casos que serão calculados: ");

    int cases = sc.nextInt();

    double case1 = 0;
    double case2 = 0;
    double case3 = 0;

    for (int i = 0; i < cases; i++) {
      System.out.println("Digite, separado por espaços, três valores decimais para " +
          "calcular sua média ponderada: ");

      case1 = sc.nextDouble();
      case2 = sc.nextDouble();
      case3 = sc.nextDouble();

      System.out.printf("%.1f%n", (case1 * 2 + case2 * 3 + case3 * 5) / (3 + 2 + 5));
    }
  }

  public static void fraction(Scanner sc) {
    int cases;
    double numerator, denominator;

    System.out.println("Digite o número de casos que serão calculados: ");
    cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {
      System.out.println("Digite, separado por espaço, numerador e denominador: ");

      numerator = sc.nextDouble();
      denominator = sc.nextDouble();

      System.out.printf(denominator == 0 ? "Divisão impossível%n" : "%.1f%n", numerator / denominator);
    }
  }

  public static void factorial(Scanner sc) {
    System.out.println("Digite a fatorial a ser calculada: ");

    int factorialNumber = sc.nextInt();
    int factorialResult = 0;

    if (factorialNumber == 0 || factorialNumber == 1) factorialResult = 1;

    for (int i = 0; i < factorialNumber; i++) {
      factorialResult += factorialNumber * i;
    }

    System.out.println(factorialResult);
  }

  public static void dividers(Scanner sc) {
    System.out.println("Digite um número para descobrir seus divisores: ");

    int divider = sc.nextInt();

    for (int i = 1; i <= divider; i++) {
      if (divider % i == 0) System.out.println(i);
    }
  }

  public static void squareAndCube(Scanner sc) {
    System.out.println("Digite um número inteiro positivo para calcular seu quadrado e cubo: ");

    int number = sc.nextInt();

    if (number < 0) System.out.println("Número inválido");

    for (int i = 1; i <= number; i++) {
      double square = Math.pow(i, 2);
      double cube = Math.pow(i, 3);

      System.out.println(i + " " + (int) square + " " + (int) cube);
    }
  }

}
