package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  Ex003IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    negativeOrPositiveNumber(sc);

    evenOrOdd(sc);

    multiples(sc);

    duration(sc);

    dinner(sc);

    interval(sc);

    quadrants(sc);

    incomeTax(sc);

    sc.close();
  }

  public static void negativeOrPositiveNumber(Scanner sc) {
    int isNegative;

    System.out.println("---EX01---");
    System.out.println("Digite um número inteiro para verificar se é negativo: ");

    isNegative = sc.nextInt();

    if (isNegative < 0) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("NÃO NEGATIVO");
    }
  }

  public static void evenOrOdd(Scanner sc) {
    int isEven;

    System.out.println("---EX02---");
    System.out.println("Digite um número inteiro para verificar se é par ou ímpar: ");

    isEven = sc.nextInt();

    if (isEven % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("ÍMPAR");
    }
  }

  public static void multiples(Scanner sc) {
    int num1, num2;

    System.out.println("---EX03---");
    System.out.println("Digite, separado por espaço, dois números inteiros " +
        "para verificar se são múltiplos entre si: ");

    num1 = sc.nextInt();
    num2 = sc.nextInt();

    if (num1 % num2 == 0 || num2 % num1 == 0) {
      System.out.println("São múltiplos");
    } else {
      System.out.println("Não são múltiplos");
    }
  }

  public static void duration(Scanner sc) {
    int startGame, endGame;

    System.out.println("---EX04---");
    System.out.println("Digite, separado por espaço, dois números inteiros em que o primeiro " +
        "é horário de início do jogo e o segundo o horário de término: ");

    startGame = sc.nextInt();
    endGame = sc.nextInt();

    if (startGame < endGame) {
      System.out.printf("O JOGO DUROU %d HORA(S)", (endGame - startGame));
    } else {
      System.out.printf("O JOGO DUROU %d HORA(S)", ((24 - startGame) + endGame));
    }
  }

  public static void dinner(Scanner sc) {
    Map<Integer, Double> products = new HashMap<>();
    products.put(1, 4.0);
    products.put(2, 4.5);
    products.put(3, 5.0);
    products.put(4, 2.0);
    products.put(5, 1.5);

    int product;
    double quantity;

    System.out.println("---EX05---");
    System.out.println("Digite, separado por espaço, o código do produto (1 a 5) " +
        "e a quantidade desejada ");

    product = sc.nextInt();
    quantity = sc.nextDouble();

    System.out.printf("Total: R$ %.2f", products.get(product) * quantity);
  }

  public static void interval(Scanner sc) {
    double value;

    System.out.println("---EX06---");
    System.out.println("Digite um valor: ");

    value = sc.nextDouble();

    if (value >= 0 && value <= 25) {
      System.out.println("Intervalo: (0, 25]");
    } else if (value > 25 && value <= 50) {
      System.out.println("Intervalo: (25, 50]");
    } else if (value > 50 && value <= 75) {
      System.out.println("Intervalo: (50, 75]");
    } else if (value > 75 && value <= 100) {
      System.out.println("Intervalo: (75, 100]");
    } else {
      System.out.println("Fora de intervalo");
    }
  }

  public static void quadrants(Scanner sc) {
    double x, y;
    String quadrant;

    System.out.println("---EX07---");
    System.out.println("Digite, separado por espaço, o valor de X e de Y: ");

    x = sc.nextDouble();
    y = sc.nextDouble();

    if (x > 0 && y > 0) {
      quadrant = "Q1";
    } else if (x < 0 && y > 0) {
      quadrant = "Q2";
    } else if (x < 0 && y < 0) {
      quadrant = "Q3";
    } else if (x > 0 && y < 0) {
      quadrant = "Q4";
    } else if (x == 0 && y != 0) {
      quadrant = "EIXO Y";
    } else if (x != 0 && y == 0) {
      quadrant = "EIXO X";
    } else {
      quadrant = "ORIGEM";
    }

    System.out.println(quadrant);
  }

  public static void incomeTax(Scanner sc) {
    double finalTax = 0, salary;

    System.out.println("---EX08---");
    System.out.println("Digite o valor do salário: ");

    salary = sc.nextDouble();

    if (salary >= 0 && salary <= 2000) {
      System.out.println("Isento");
    } else if (salary > 2000 && salary <= 3000) {
      finalTax = (salary - 2000) * 0.08;

      System.out.printf("R$ %.2f", finalTax);
    } else if (salary > 3000 && salary <= 4500) {
      finalTax = 80 + ((salary - 3000) * 0.18);

      System.out.printf("R$ %.2f", finalTax);
    } else if (salary > 4500) {
      finalTax = (80 + 270 + ((salary - 4500) * 0.28));

      System.out.printf("R$ %.2f", finalTax);
    } else {
      System.out.println("Salário fora do intervalo permitido");
    }
  }
}
