package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex002EntradaDeDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    // Ex 01
    int num1, num2;
    System.out.println("---EX001---");
    System.out.println("Digite um número inteiro: ");
    num1 = sc.nextInt();
    System.out.println("Digite um número inteiro: ");
    num2 = sc.nextInt();
    System.out.println("SOMA = " + (num1 + num2));

    // Ex 02
    double pi = 3.14159;
    double raio;
    System.out.println("---EX002---");
    System.out.println("Digite o tamanho do raio: ");
    raio = sc.nextDouble();
    System.out.printf("A=%.4f\n", (pi * Math.pow(raio, 2)));

    // Ex 03
    int A, B, C, D;
    System.out.println("---EX003---");
    System.out.println("Digite, separado por espaço, quatro números inteiros: ");
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    System.out.println("DIFERENÇA = " + (A * B - C * D));

    // Ex 04
    int number, workingHours;
    double salary;
    System.out.println("---EX004---");
    System.out.println("Digite o número do funcionário: ");
    number = sc.nextInt();
    System.out.println("Digite o salário do funcionário: ");
    salary = sc.nextDouble();
    System.out.println("Digite a quantidade de horas trabalhadas do funcionário: ");
    workingHours = sc.nextInt();
    System.out.println("NUMBER = " + number);
    System.out.printf("SALARY = U$ %.2f\n", (workingHours * salary));

    // Ex 05
    int prod1, prod2, quantity1, quantity2;
    double price1, price2;
    System.out.println("Digite, separado por espaço, o código da primeira peça, a quantidade e o valor de cada: ");
    prod1 = sc.nextInt();
    quantity1 = sc.nextInt();
    price1 = sc.nextDouble();
    System.out.println("Digite, separado por espaço, o código da segunda peça, a quantidade e o valor de cada: ");
    prod2 = sc.nextInt();
    quantity2 = sc.nextInt();
    price2 = sc.nextDouble();
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", (price1 * quantity1 + price2 * quantity2));

    // Ex 06
    double a, b, c;
    System.out.println("Digite, separado por espaço, os valores de três áreas");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    System.out.printf("TRIÂNGULO: %.3f\n", (a * c / 2));
    System.out.printf("CIRCULO: %.3f\n", (pi * Math.pow(c, 2)));
    System.out.printf("TRAPÉZIO: %.3f\n", ((a + b) * c / 2));
    System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
    System.out.printf("RETÂNGULO: %.3f\n", (a * b));

    sc.close();
  }
}
