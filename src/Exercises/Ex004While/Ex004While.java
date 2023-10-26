package Exercises.Ex004While;

import java.util.Scanner;

public class Ex004While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    password(sc);

    quadrants(sc);

    gasStation(sc);

    sc.close();
  }

  public static void password(Scanner sc) {
    int userPassword;
    int rightPassword = 2002;

    System.out.println("Informe sua senha com quatro dígitos: ");
    userPassword = sc.nextInt();

    while (userPassword != rightPassword) {
      System.out.println("Senha Inválida");
      System.out.println("Informe novamente sua senha com quatro dígitos: ");

      userPassword = sc.nextInt();
    }

    System.out.println("Acesso Permitido");
  }

  public static void quadrants(Scanner sc) {
    double x, y;

    System.out.println("Digite duas coordenadas: ");
    x = sc.nextDouble();
    y = sc.nextDouble();

    while (x != 0 && y != 0) {
      if (x > 0 && y > 0) {
        System.out.println("primeiro");
      } else if (x < 0 && y > 0) {
        System.out.println("segundo");
      } else if (x < 0 && y < 0) {
        System.out.println("terceiro");
      } else {
        System.out.println("quarto");
      }

      System.out.println("Digite duas coordenadas: ");

      x = sc.nextDouble();
      y = sc.nextDouble();
    }
  }

  public static void gasStation(Scanner sc) {
    int alcool = 0;
    int diesel = 0;
    int gas = 0;
    int option;

    System.out.println("Digite o código do combustível: ");

    option = sc.nextInt();

    while (option != 4) {
      switch (option) {
        case 1:
          option = sc.nextInt();
          alcool += 1;
          break;
        case 2:
          option = sc.nextInt();
          gas += 1;
          break;
        case 3:
          option = sc.nextInt();
          diesel += 1;
          break;
        default:
          System.out.println("Digite um código válido (1 a 4): ");
          option = sc.nextInt();
          break;
      }
    }

    System.out.println("MUITO OBRIGADA");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gas);
    System.out.println("Diesel: " + diesel);
  }

}
