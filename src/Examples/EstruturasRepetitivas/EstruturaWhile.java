package Examples.EstruturasRepetitivas;

import java.util.Scanner;

public class EstruturaWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int result = 0;

    System.out.println("Digite um número inteiro: ");
    num = sc.nextInt();

    while (num != 0) {
      result += num;
      num = sc.nextInt();
    }

    System.out.println(result);
  }
}
